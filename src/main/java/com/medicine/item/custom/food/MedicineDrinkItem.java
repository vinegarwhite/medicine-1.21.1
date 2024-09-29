package com.medicine.item.custom.food;

import com.medicine.item.custom.MedicineItem;
import com.medicine.util.MedicineTooltipUtils;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.UseAction;

import java.util.List;

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
