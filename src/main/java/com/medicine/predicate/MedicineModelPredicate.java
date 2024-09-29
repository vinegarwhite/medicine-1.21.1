package com.medicine.predicate;

import com.medicine.Medicine;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;

/**
 * 该类用于自定义谓词(Predicate) 可以在物品的model文件中使用 根据谓词切换不同的材质
 * 原版的类叫做ModelPredicateProviderRegistry 可转跳过去进行参考
 * 感谢某位大佬的帮助 我才知道谓词是存放那个类里的 才能以此为基础写自己的谓词
 * 因为是渲染相关 只能在客户端中调用 不然数据生成会报错
 */

public class MedicineModelPredicate {

    static {
        // 根据原版的cast谓词改进 抛竿时谓词fishing_rod_cast变为1 配合json文件可以切换抛竿和收杆的材质
        ModelPredicateProviderRegistry.register(Identifier.of(Medicine.MOD_ID, "fishing_rod_cast"),
                // 根据个人理解 整个函数会对所有物品一次进行一次判断
                (stack, world, entity, seed) -> {
                    // 判断实体是否是玩家 如果不是则不会切换材质
                    if (entity == null) {
                        return 0.0F;
                    } else {
                        // 判断该物品是否是玩家主手的物品
                        boolean bl = entity.getMainHandStack() == stack;
                        // 判断该物品是否是玩家副手的物品
                        boolean bl2 = entity.getOffHandStack() == stack;
                        // 因为双手都有物品会优先使用主手的物品 所以如果主手物品符合条件 则副手的cast为0不进行材质切换
                        if (entity.getMainHandStack().getItem() == stack.getItem()) {
                            // 判断到副手的物品是bl肯定为false 将bl2设为false则bl || bl2的结果必为false cast返回0
                            bl2 = false;
                        }
                        // 物品位于某只手且实体为玩家且fishHook(与该玩家绑定的浮标实体)存在时 对应物品的cast为1 切换为抛竿的材质
                        return (bl || bl2) && entity instanceof PlayerEntity && ((PlayerEntity) entity).fishHook != null ? 1.0F : 0.0F;
                    }
                });
    }

    // 外部调用该函数 则该类内部的静态部分会自动执行 实现谓词(Predicate)的注册
    public static void registerMedicineModelPredicate(){
        Medicine.LOGGER.info("Registering Medicine Model Predicate");
    }
}
