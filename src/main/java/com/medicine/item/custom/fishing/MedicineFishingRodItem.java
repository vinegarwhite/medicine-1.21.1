package com.medicine.item.custom.fishing;

import com.medicine.util.MedicineTooltipUtils;
import net.minecraft.item.FishingRodItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

/**
 * 模组里面钓鱼竿的父类
 */
public class MedicineFishingRodItem extends FishingRodItem {
    public MedicineFishingRodItem(Settings settings) {
        super(settings);
    }

    // 批量添加物品描述
    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        MedicineTooltipUtils.setToolTips(this, tooltip);
    }
}
