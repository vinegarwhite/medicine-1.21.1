package com.medicine.item.custom.food;

import com.medicine.item.MedicineItem;
import com.medicine.status_effect.MedicineStatusEffects;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;

public class MedicineFoodItem extends MedicineItem {
    public MedicineFoodItem(Settings settings) {
        super(settings);
    }
}
