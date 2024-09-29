package com.medicine.item.custom.food.drinks;

import com.medicine.item.custom.food.MedicineDrinkItem;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class WeirdBlackTea extends MedicineDrinkItem {
    public WeirdBlackTea(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if(!Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.medicine.weird_black_tea"));
        }else{
            tooltip.add(Text.translatable("tooltip.medicine.weird_black_tea_shift"));
        }
    }
}
