package com.medicine.item.custom.food;

import com.medicine.item.custom.MedicineItem;
import com.medicine.status_effect.MedicineStatusEffects;
import com.medicine.util.MedicineTooltipUtils;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

import java.util.List;

/**
 * ambient:true时右上角图标有高亮效果
 * showParticles:true时身上冒出粒子效果
 * showIcon:true时右上角显示图标
 */

public class MedicineDrinkItem extends MedicineItem {
    public MedicineDrinkItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        // 饱腹buff判断逻辑
        if (user.isPlayer()) {
            // 获取玩家的饱食度 如果满了则获得饱腹
            float foodLevel = ((PlayerEntity) user).getHungerManager().getFoodLevel();

            if (foodLevel >= 20)
                user.addStatusEffect(new StatusEffectInstance(
                        MedicineStatusEffects.OVER_STUFFED, -1, 0, false, false, false));

        }

        return super.finishUsing(stack, world, user);
    }

    // 把使用物品的动作改为饮用
    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

    // 饮用过程中使用的音效
    @Override
    public SoundEvent getDrinkSound() {
        return SoundEvents.ENTITY_GENERIC_DRINK;
    }

    // 饮用结束时播放的音效
    @Override
    public SoundEvent getEatSound() {
        return SoundEvents.ENTITY_GENERIC_DRINK;
    }
}
