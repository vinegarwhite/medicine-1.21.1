package com.medicine.item.custom.fishing;

import com.medicine.item.MedicineItems;
import com.medicine.tags.MedicineItemTags;
import net.minecraft.component.ComponentMap;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.CustomModelDataComponent;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FishingBobberEntity;
import net.minecraft.item.FishingRodItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

import java.util.List;

/**
 * 模组里面钓鱼竿的父类
 * 其中材质切换的部分 原版可以控制模型的json里面用
 * "overrides": [
 *         {
 *             "predicate": {
 *                 "cast": 1
 *             },
 *             "model": "item/fishing_rod_cast"
 *         }
 *     ]来切换材质 但是我花了两天也没找到让cast兼容模组钓鱼竿的办法
 */
public class MedicineFishingRodItem extends FishingRodItem {
    public MedicineFishingRodItem(Settings settings) {
        super(settings);
    }

    // 主要用于钓竿抛竿与收杆的切换 切换的逻辑努力照着原版的效果进行还原
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        PlayerEntity player = (PlayerEntity) entity;
        ItemStack mainHand = player.getMainHandStack();
        ItemStack offHand = player.getOffHandStack();

        // 优先将主手的钓鱼竿切换为抛竿材质
        if (player.fishHook != null && mainHand.isIn(MedicineItemTags.MEDICINE_FISHING_ROD)) {
            MedicineFishingRodItem.castingRod(mainHand);
            // 如果一开始副手抛竿 主手切换到新的钓鱼竿 副手钓竿切换为收回状态 主手钓竿变为抛出状态
            if(offHand.isIn(MedicineItemTags.MEDICINE_FISHING_ROD))
                MedicineFishingRodItem.retrievingRod(offHand);
        } else if (player.fishHook != null && offHand.isIn(MedicineItemTags.MEDICINE_FISHING_ROD)) {
            MedicineFishingRodItem.castingRod(offHand);
        }

        // 用于应对玩家没有收杆就切换到别的物品的情况 把所有没有拿在手上的鱼竿全部切换为收杆的状态
        for (int i = 0; i < player.getInventory().main.size(); i++) {
            ItemStack itemStack = player.getInventory().main.get(i);
            if (!itemStack.equals(mainHand) && !itemStack.equals(offHand) && itemStack.isIn(MedicineItemTags.MEDICINE_FISHING_ROD)) {
                MedicineFishingRodItem.retrievingRod(itemStack);
            }
        }

    }

    // 默认的物品描述
    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, tooltip, type);
        tooltip.add(Text.translatable("tooltip.medicine.unfinished"));
    }

    // 修改钓竿的Component来标记抛竿状态
    public static void castingRod(ItemStack itemStack) {
        ComponentMap components = itemStack.getComponents();
        ComponentMap.Builder builder = ComponentMap.builder();
        builder.addAll(components);
        builder.add(DataComponentTypes.CUSTOM_MODEL_DATA, new CustomModelDataComponent(1));
        itemStack.applyComponentsFrom(builder.build());
    }

    // 修改钓竿的Component来标记收杆状态
    public static void retrievingRod(ItemStack itemStack) {
        ComponentMap components = itemStack.getComponents();
        ComponentMap.Builder builder = ComponentMap.builder();
        builder.addAll(components);
        builder.add(DataComponentTypes.CUSTOM_MODEL_DATA, new CustomModelDataComponent(0));
        itemStack.applyComponentsFrom(builder.build());
    }
}
