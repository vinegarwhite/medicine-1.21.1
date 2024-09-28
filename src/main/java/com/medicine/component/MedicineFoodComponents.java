package com.medicine.component;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;

public class MedicineFoodComponents {

    // 药物
    public static final FoodComponent MEDICINE_PILL = new FoodComponent.Builder().nutrition(0).saturationModifier(0F).snack().build();

    // 食物
    public static final FoodComponent MEDICINE_FOOD = new FoodComponent.Builder().nutrition(0).saturationModifier(0F).build();
}
