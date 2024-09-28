package com.medicine.component;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;

public class MedicineFoodComponents {
    
    public static final FoodComponent MEDICINE = new FoodComponent.Builder().nutrition(0).saturationModifier(0F).snack().build();

    
}
