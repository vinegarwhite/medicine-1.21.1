package com.medicine.item.custom.food;

import com.medicine.item.custom.MedicineItem;
import com.medicine.util.MedicineTooltipUtils;
import net.minecraft.entity.LivingEntity;
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
        return super.finishUsing(stack, world, user);

    }

}
