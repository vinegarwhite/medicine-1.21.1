package com.medicine.status_effect.effects;

import com.medicine.status_effect.MedicineStatusEffects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

public class Overstuffed extends StatusEffect {
    public Overstuffed(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {

        if(entity instanceof PlayerEntity playerEntity){
            int foodLevel = playerEntity.getHungerManager().getFoodLevel();
            if(foodLevel< 20) {
                playerEntity.removeStatusEffect(MedicineStatusEffects.OVER_STUFFED);
                return true;
            }
        }

        return true;
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
