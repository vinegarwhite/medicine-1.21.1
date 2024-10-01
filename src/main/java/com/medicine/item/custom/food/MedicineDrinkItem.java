package com.medicine.item.custom.food;

import com.medicine.item.MedicineItem;
import com.medicine.status_effect.MedicineStatusEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

/**
 * ambient:true时右上角图标有高亮效果
 * showParticles:true时身上冒出粒子效果
 * showIcon:true时右上角显示图标
 */

public class MedicineDrinkItem extends MedicineItem {
    public MedicineDrinkItem(Settings settings) {
        super(settings);
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
