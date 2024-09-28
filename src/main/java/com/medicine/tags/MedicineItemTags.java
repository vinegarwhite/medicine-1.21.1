package com.medicine.tags;

import com.medicine.Medicine;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

/**
 * 这个类用于存放模组自定义的Tag 数据生成只能把物品添加到已有的Tag里面
 * 所以必须写好模组新增的Tag 然后再用数据生成把物品添加到Tag里面
 */


public class MedicineItemTags {
    // 钓鱼竿Tag 用于模组里钓鱼竿相关的判断
    public static final TagKey<Item> MEDICINE_FISHING_ROD = of("medicine_fishing_rod");

    // 从原版那边借鉴过来的注册方法 注册Tag时调用
    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(Medicine.MOD_ID, id));
    }


    // 外界调用这个方法 该类中的静态变量会自动初始化 调用相关的代码 实现注册
    public static void registerMedicineTags(){
        Medicine.LOGGER.info("Registering Medicine Tags");
    }
}
