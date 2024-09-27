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

    // 默认的物品描述
    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, tooltip, type);
        tooltip.add(Text.translatable("tooltip.medicine.unfinished"));
    }
}
