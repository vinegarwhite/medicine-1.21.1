package com.medicine.component;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;

/**
 * 该类用于存放食物的组件 在注册物品时调用
 * nutrition表示饱食度 saturationModifier表示饱和度
 * 饱食度等于填入的数字 nutrition(1)表示半格饱食度
 * 饱和度为饱食度值×填入数字×2
 */
public class MedicineFoodComponents {

    // 药物
    public static final FoodComponent MEDICINE_PILL = new FoodComponent.Builder().nutrition(0).saturationModifier(0F).snack().build();

    // 食物
    public static final FoodComponent MEDICINE_FOOD = new FoodComponent.Builder().nutrition(0).saturationModifier(0F).build();

    public static final FoodComponent MEDICINE_DRINK_COMMON = new FoodComponent.Builder().nutrition(1).saturationModifier(1.0F).alwaysEdible().build();

}
