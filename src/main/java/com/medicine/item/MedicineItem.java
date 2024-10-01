package com.medicine.item;

import com.medicine.util.MedicineTooltipUtils;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class MedicineItem extends Item {
    public MedicineItem(Settings settings) {
        super(settings);
    }

    // 实现自动添加对应的描述信息 原版直接添加tooltip不会换行 所以自己封装了个方法实现换行 详情见setToolTips内代码
    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        MedicineTooltipUtils.setToolTips(this, tooltip);
    }
}
