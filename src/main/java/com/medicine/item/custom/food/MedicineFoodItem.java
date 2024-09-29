package com.medicine.item.custom.food;

import com.medicine.item.custom.MedicineItem;
import com.medicine.status_effect.MedicineStatusEffects;
import com.medicine.status_effect.effects.Overstuffed;
import com.medicine.util.MedicineTooltipUtils;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

public class MedicineFoodItem extends MedicineItem {
    public MedicineFoodItem(Settings settings) {
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
                        MedicineStatusEffects.OVER_STUFFED, 10, 0, true, false, true));

        }

        return super.finishUsing(stack, world, user);
    }

}
