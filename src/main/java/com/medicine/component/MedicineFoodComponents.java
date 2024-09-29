package com.medicine.component;

import net.minecraft.component.type.FoodComponent;

/**
 * 该类用于存放食物的组件 在注册物品时调用
 * nutrition表示饱食度 saturationModifier表示饱和度
 * 饱食度等于填入的数字 nutrition(1)表示半格饱食度
 * 饱和度为饱食度值×填入数字×2
 * 模组里食物数值的设定相比游戏本体需要做出一定的调整
 * 毕竟MC里面食物的使用频率比本体高多了 吃个东西必定饱腹也太折磨了
 */
public class MedicineFoodComponents {

    // 药物
    public static final FoodComponent MEDICINE_COMMON = new FoodComponent.Builder().nutrition(0).saturationModifier(0F).snack().build();

    // 食物
    public static final FoodComponent MEDICINE_FOOD_COMMON = new FoodComponent.Builder().nutrition(0).saturationModifier(0F).build();
    // 厚蛋吐司
    public static final FoodComponent THICK_EGG_TOAST = new FoodComponent.Builder().nutrition(5).saturationModifier(0.6F).build();
    // 时蔬沙拉
    public static final FoodComponent VEGGIE_SALAD = new FoodComponent.Builder().nutrition(3).saturationModifier(0.5F).build();
    // 香肠皮萨
    public static final FoodComponent SAUSAGE_PIZZA = new FoodComponent.Builder().nutrition(10).saturationModifier(0.6F).build();
    // 牛肉汉堡
    public static final FoodComponent BEEF_BURGER = new FoodComponent.Builder().nutrition(12).saturationModifier(0.6F).build();
    // 凯撒面包
    public static final FoodComponent CAESAR_BREAD = new FoodComponent.Builder().nutrition(5).saturationModifier(0.8F).build();
    // 番茄意面
    public static final FoodComponent TOMATO_PASTA = new FoodComponent.Builder().nutrition(8).saturationModifier(0.6F).build();
    // 鲑鱼靓汤
    public static final FoodComponent SALMON_SOUP = new FoodComponent.Builder().nutrition(10).saturationModifier(0.6F).build();
    // 战斧牛排
    public static final FoodComponent TOMAHAWK_STEAK = new FoodComponent.Builder().nutrition(12).saturationModifier(0.6F).build();
    // 袋装糖炒板栗
    public static final FoodComponent BAGGED_CHESTNUTS = new FoodComponent.Builder().nutrition(5).saturationModifier(0.4F).build();
    // 小酥肉
    public static final FoodComponent FRIED_CRISPY_MEAT = new FoodComponent.Builder().nutrition(5).saturationModifier(0.5F).build();
    // 烤冷面
    public static final FoodComponent GRILLED_COLD_NOODLES = new FoodComponent.Builder().nutrition(5).saturationModifier(0.5F).build();
    // 插着木签的菠萝片
    public static final FoodComponent PINEAPPLE_ON_A_STICK = new FoodComponent.Builder().nutrition(3).saturationModifier(0.6F).build();
    // 泡面
    public static final FoodComponent INSTANT_NOODLES = new FoodComponent.Builder().nutrition(10).saturationModifier(0.1F).build();
    // 奶油蛋糕
    public static final FoodComponent CREAM_CAKE = new FoodComponent.Builder().nutrition(5).saturationModifier(1.0F).build();
    // 草莓蛋糕
    public static final FoodComponent STRAWBERRY_CAKE = new FoodComponent.Builder().nutrition(5).saturationModifier(1.0F).build();
    // 香橙蛋糕
    public static final FoodComponent ORANGE_CAKE = new FoodComponent.Builder().nutrition(5).saturationModifier(1.0F).build();
    // 盒装草莓
    public static final FoodComponent BOX_OF_STRAWBERRIES = new FoodComponent.Builder().nutrition(5).saturationModifier(1.0F).build();
    // 葡萄味饼干
    public static final FoodComponent BAGGED_GRAPE_COOKIES = new FoodComponent.Builder().nutrition(1).saturationModifier(0.5F).build();
    // 奶油味饼干
    public static final FoodComponent BAGGED_CREAM_COOKIES = new FoodComponent.Builder().nutrition(1).saturationModifier(0.5F).build();
    // 西瓜味并按
    public static final FoodComponent BAGGED_WATERMELON_COOKIES = new FoodComponent.Builder().nutrition(1).saturationModifier(0.5F).build();
    // 香橙味饼干
    public static final FoodComponent BAGGED_ORANGE_COOKIES = new FoodComponent.Builder().nutrition(1).saturationModifier(0.5F).build();
    // 菠萝味饼干
    public static final FoodComponent BAGGED_PINEAPPLE_COOKIES = new FoodComponent.Builder().nutrition(1).saturationModifier(0.5F).build();
    // 蓝莓味饼干
    public static final FoodComponent BAGGED_BLUEBERRY_COOKIES = new FoodComponent.Builder().nutrition(1).saturationModifier(0.5F).build();
    // 薄荷味饼干
    public static final FoodComponent BAGGED_MINT_COOKIES = new FoodComponent.Builder().nutrition(1).saturationModifier(0.5F).build();
    // 生鱼王
    public static final FoodComponent RAW_FISH_KING = new FoodComponent.Builder().nutrition(5).saturationModifier(0.1F).build();
    // 熟鱼王
    public static final FoodComponent COOKED_FISH_KING = new FoodComponent.Builder().nutrition(10).saturationModifier(0.8F).build();
    // 冻生鱼王
    public static final FoodComponent FROZEN_RAW_FISH_KING = new FoodComponent.Builder().nutrition(3).saturationModifier(0.1F).build();
    // 冻熟鱼王
    public static final FoodComponent FROZEN_COOKED_FISH_KING = new FoodComponent.Builder().nutrition(6).saturationModifier(0.5F).build();
    // 黄金鱼
    public static final FoodComponent GOLDEN_FISH = new FoodComponent.Builder().nutrition(12).saturationModifier(0.8F).build();

    // 饮料
    public static final FoodComponent MEDICINE_DRINK_COMMON = new FoodComponent.Builder().nutrition(1).saturationModifier(1.0F).alwaysEdible().build();

}
