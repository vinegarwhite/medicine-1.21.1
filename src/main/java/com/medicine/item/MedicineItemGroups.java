package com.medicine.item;

import com.medicine.Medicine;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

// 此类用于注册创造模式物品栏 可以在创造模式的物品栏里面显示添加的物品
public class MedicineItemGroups {

    // 药物
    public static final ItemGroup MEDICINE_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Medicine.MOD_ID, "medicine_group"), ItemGroup.create(null, 1)
                    .displayName(Text.translatable("itemGroup.medicine_group"))
                    .icon(() -> new ItemStack(MedicineItems.ALPHA_PILL))
                    .entries((displayContext, entries) -> {
                        // 在此进行物品的添加
                        entries.add(MedicineItems.ALPHA_PILL);
                        entries.add(MedicineItems.BETA_PILL);
                        entries.add(MedicineItems.GAMMA_PILL);
                        entries.add(MedicineItems.DELTA_PILL);

                        entries.add(MedicineItems.SLEEPING_PILLS);
                        entries.add(MedicineItems.COLD_MEDICINE);
                        entries.add(MedicineItems.HEADACHE_PILLS);
                        entries.add(MedicineItems.PAIN_KILLERS);
                        entries.add(MedicineItems.VITAMIN_TABLETS);
                        entries.add(MedicineItems.STOMACH_MEDICINE);
                        entries.add(MedicineItems.AMPHETAMINE);
                        entries.add(MedicineItems.ETIZOLAM);
                        entries.add(MedicineItems.ASPIRIN);
                        entries.add(MedicineItems.PROPOXYPHENE);
                        entries.add(MedicineItems.RITALIN);
                        entries.add(MedicineItems.ANTI_BIOTICS);
                        entries.add(MedicineItems.ANTI_DEPRESSANTS);
                        entries.add(MedicineItems.PLACEBO);
                    }).build());

    // 食物
    public static final ItemGroup FOOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Medicine.MOD_ID, "food_group"), ItemGroup.create(null, 1)
                    .displayName(Text.translatable("itemGroup.food_group"))
                    .icon(() -> new ItemStack(MedicineItems.CAESAR_BREAD))
                    .entries((displayContext, entries) -> {
                        // 在此进行物品的添加
                        entries.add(MedicineItems.APPLE_SODA);
                        entries.add(MedicineItems.ORANGE_SODA);
                        entries.add(MedicineItems.CANNED_COKE);
                        entries.add(MedicineItems.THICK_EGG_TOAST);
                        entries.add(MedicineItems.POUR_OVER_COFFEE);
                        entries.add(MedicineItems.VEGGIE_SALAD);
                        entries.add(MedicineItems.SAUSAGE_PIZZA);
                        entries.add(MedicineItems.BEEF_BURGER);
                        entries.add(MedicineItems.CAESAR_BREAD);
                        entries.add(MedicineItems.TOMATO_PASTA);
                        entries.add(MedicineItems.SALMON_SOUP);
                        entries.add(MedicineItems.TOMAHAWK_STEAK);
                        entries.add(MedicineItems.BAGGED_CHESTNUTS);
                        entries.add(MedicineItems.FRIED_CRISPY_MEAT);
                        entries.add(MedicineItems.GRILLED_COLD_NOODLES);
                        entries.add(MedicineItems.PINEAPPLE_ON_A_STICK);
                        entries.add(MedicineItems.ICED_AMERICANO);
                        entries.add(MedicineItems.COCONUT_LATTE);
                        entries.add(MedicineItems.MOCHA_COFFEE);
                        entries.add(MedicineItems.WEIRD_BLACK_TEA);
                        entries.add(MedicineItems.MINERAL_WATER);
                        entries.add(MedicineItems.ICED_MINERAL_WATER);
                        entries.add(MedicineItems.INSTANT_NOODLES);
                        entries.add(MedicineItems.LEMON_WATER);
                        entries.add(MedicineItems.COCONUT_TEA_JELLY);
                        entries.add(MedicineItems.MATCHA_LUCKY_ICE);
                        entries.add(MedicineItems.PLUM_WINE);
                        entries.add(MedicineItems.CREAM_CAKE);
                        entries.add(MedicineItems.STRAWBERRY_CAKE);
                        entries.add(MedicineItems.ORANGE_CAKE);
                        entries.add(MedicineItems.BOX_OF_STRAWBERRIES);
                        entries.add(MedicineItems.NO_11_STREET_DRIP_COFFEE);
                        entries.add(MedicineItems.BAGGED_GRAPE_COOKIES);
                        entries.add(MedicineItems.BAGGED_CREAM_COOKIES);
                        entries.add(MedicineItems.BAGGED_WATERMELON_COOKIES);
                        entries.add(MedicineItems.BAGGED_ORANGE_COOKIES);
                        entries.add(MedicineItems.BAGGED_PINEAPPLE_COOKIES);
                        entries.add(MedicineItems.BAGGED_BLUEBERRY_COOKIES);
                        entries.add(MedicineItems.BAGGED_MINT_COOKIES);
                        entries.add(MedicineItems.RAW_FISH_KING);
                        entries.add(MedicineItems.COOKED_FISH_KING);
                        entries.add(MedicineItems.FROZEN_RAW_FISH_KING);
                        entries.add(MedicineItems.FROZEN_COOKED_FISH_KING);
                    }).build());

    // 书籍
    public static final ItemGroup BOOK_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Medicine.MOD_ID, "book_group"), ItemGroup.create(null, 1)
                    .displayName(Text.translatable("itemGroup.book_group"))
                    .icon(() -> new ItemStack(MedicineItems.END_OF_THE_WORLD))
                    .entries((displayContext, entries) -> {
                        // 在此进行物品的添加
                        entries.add(MedicineItems.COMPUTER_SCIENCE_TEXTBOOKS);
                        entries.add(MedicineItems.TEXT_USAGE_TEXTBOOKS);
                        entries.add(MedicineItems.PSYCHOLOGY_TEXTBOOKS);
                        entries.add(MedicineItems.ZENIS_WOOD);
                        entries.add(MedicineItems.WRITING_SKILLS_TAUGHT_BY_TEACHER_YU);
                        entries.add(MedicineItems.NAVAL_MAJOR_AND_THE_CLERK);
                        entries.add(MedicineItems.BREATHING_EXERCISES);
                        entries.add(MedicineItems.BRAIN_IN_A_VAT);
                        entries.add(MedicineItems.SECRETS_TO_STAY_AWAKE);
                        entries.add(MedicineItems.PINBALL_2001);
                        entries.add(MedicineItems.TALE_OF_THE_SEA_GOD);
                        entries.add(MedicineItems.SPRING_OF_ASKALON);
                        entries.add(MedicineItems.WINTER_OF_ASTAROTH);
                        entries.add(MedicineItems.DEEP_RAIN);
                        entries.add(MedicineItems.PRACTICAL_ENCYCLOPEDIA);
                        entries.add(MedicineItems.A_LION_ON_ITS_OWN);
                        entries.add(MedicineItems.GODS_US_OR_ALL_SOLDIERS);
                        entries.add(MedicineItems.END_OF_THE_WORLD);
                        entries.add(MedicineItems.FEVER_ILLNESS);
                        entries.add(MedicineItems.BAPTISM_OF_VIOLET);
                        entries.add(MedicineItems.NORTH_OF_THE_BORDER_SOUTH_OF_THE_STARS);
                        entries.add(MedicineItems.A_WILD_SHEEP_ADVENTURE);
                        entries.add(MedicineItems.THE_ART_OF_LETTING_GO);
                        entries.add(MedicineItems.GUNMAN_IN_THE_RAIN);
                        entries.add(MedicineItems.FISHING_MASTERS_PRIVATE_TIPS);
                        entries.add(MedicineItems.SECRETS_OF_THE_FISSURE);
                        entries.add(MedicineItems.SCARS_OF_THE_SKY);
                        entries.add(MedicineItems.ASTONISHING_SECRETS_SO_IT_GOES);
                        entries.add(MedicineItems.DO_NOT_READ_THIS_BOOK);
                        entries.add(MedicineItems.CACTUS_CULTIVATION_MANUAL);
                    }).build());

    // 植物
    public static final ItemGroup PLANT_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Medicine.MOD_ID, "plant_group"), ItemGroup.create(null, 1)
                    .displayName(Text.translatable("itemGroup.plant_group"))
                    .icon(() -> new ItemStack(MedicineItems.CACTUS_POTTED_PLANT))
                    .entries((displayContext, entries) -> {
                        // 在此进行物品的添加
                        entries.add(MedicineItems.MAGNOLIA_POT);
                        entries.add(MedicineItems.FORGET_ME_NOT_POT);
                        entries.add(MedicineItems.MARIGOLD_POT);
                        entries.add(MedicineItems.SUNFLOWER_POT);
                        entries.add(MedicineItems.ROSE_BOUQUET);
                        entries.add(MedicineItems.CACTUS_POTTED_PLANT);
                        entries.add(MedicineItems.BLOOMING_CACTUS_POTTED_PLANT);
                        entries.add(MedicineItems.DEAD_CACTUS_POTTED_PLANT);
                        entries.add(MedicineItems.CACTUS_FERTILIZER);
                        entries.add(MedicineItems.CACTUS_CULTIVATION_MANUAL);
                    }).build());

    // 收藏品
    public static final ItemGroup COLLECTIBLE_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Medicine.MOD_ID, "collectible_group"), ItemGroup.create(null, 1)
                    .displayName(Text.translatable("itemGroup.collectible_group"))
                    .icon(() -> new ItemStack(MedicineItems.RUBBER_DUCK))
                    .entries((displayContext, entries) -> {
                        // 在此进行物品的添加
                        entries.add(MedicineItems.BADMINTON_RACKET);
                        entries.add(MedicineItems.MINI_HUMIDIFIER);
                        entries.add(MedicineItems.SNOW_GLOBE);
                        entries.add(MedicineItems.CLOCK_TOWER_ORNAMENT);
                        entries.add(MedicineItems.VALID_GYM_MEMBERSHIP_CARD);
                        entries.add(MedicineItems.GOLD_MEDAL_AUTHOR_TROPHY);
                        entries.add(MedicineItems.COUPON);
                        entries.add(MedicineItems.TOMATO_BROOCH);
                        entries.add(MedicineItems.SNEAKERS);
                        entries.add(MedicineItems.FILE_FOLDER_SET);
                        entries.add(MedicineItems.NOTEBOOK);
                        entries.add(MedicineItems.FRUIT_KNIFE);
                        entries.add(MedicineItems.REPAIR_TOOL_KIT);
                        entries.add(MedicineItems.MEDICAL_KIT);
                        entries.add(MedicineItems.VOICE_RECORDER);
                        entries.add(MedicineItems.FASCIA_GUN);
                        entries.add(MedicineItems.MINI_FRIDGE);
                        entries.add(MedicineItems.ELECTRIC_KETTLE);
                        entries.add(MedicineItems.RUBBER_DUCK);
                        entries.add(MedicineItems.SUNSHINE_DOLL);
                        entries.add(MedicineItems.TUNGSTEN_ALLOY_ORNAMENT);
                        entries.add(MedicineItems.ADVANCED_SPORTS_GUIDE);
                        entries.add(MedicineItems.SOFT_PILLOW);
                        entries.add(MedicineItems.ORANGE_BOOKMARK);
                        entries.add(MedicineItems.FIDGET_SPINNER);
                    }).build());

    // 特殊藏品
    public static final ItemGroup SPECIAL_COLLECTIBLE_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Medicine.MOD_ID, "special_collectible_group"), ItemGroup.create(null, 1)
                    .displayName(Text.translatable("itemGroup.special_collectible_group"))
                    .icon(() -> new ItemStack(MedicineItems.GROUP_PHOTO))
                    .entries((displayContext, entries) -> {
                        // 在此进行物品的添加
                        entries.add(MedicineItems.HALLUKES_OLD_KNEE_PAD);
                        entries.add(MedicineItems.ACOLASS_OLD_NOTES);
                        entries.add(MedicineItems.DEPLINES_SKETCH);
                        entries.add(MedicineItems.TICKET_OF_DERIMO);
                        entries.add(MedicineItems.STICKER_59);
                        entries.add(MedicineItems.GROUP_PHOTO);
                        entries.add(MedicineItems.CITY_A_HOSPITAL_MEDICAL_REPORT);
                        entries.add(MedicineItems.TRANSPARENT_MEDICINE_BOTTLE);
                        entries.add(MedicineItems.EXPIRED_TRAIN_TICKET);
                        entries.add(MedicineItems.BOOK);
                        entries.add(MedicineItems.LEAVE_PERMISSION);
                        entries.add(MedicineItems.SPORTS_BOTTLE);
                        entries.add(MedicineItems.LIGHTER);
                        entries.add(MedicineItems.EXPLICIT_PHOTO);
                        entries.add(MedicineItems.BLACK_LION_PLUSH);
                        entries.add(MedicineItems.COFFEE_MACHINE);
                        entries.add(MedicineItems.SILVER_BOOKMARK);
                    }).build());

    // 特殊藏品
    public static final ItemGroup FISHING_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Medicine.MOD_ID, "fishing_group"), ItemGroup.create(null, 1)
                    .displayName(Text.translatable("itemGroup.fishing_group"))
                    .icon(() -> new ItemStack(MedicineItems.GOLDEN_FISH))
                    .entries((displayContext, entries) -> {
                        // 在此进行物品的添加
                        entries.add(MedicineItems.FIBERGLASS_FISHING_ROD);
                        entries.add(MedicineItems.CARBON_FIBER_FISHING_ROD);
                        entries.add(MedicineItems.TITANIUM_ALLOY_FISHING_ROD);
                        entries.add(MedicineItems.SUPER_INVINCIBLE_FISHING_ROD);
                        entries.add(MedicineItems.VIAL_OF_STRANGE_LIQUID);
                        entries.add(MedicineItems.GOLD_RING);
                        entries.add(MedicineItems.RAW_FISH_KING);
                        entries.add(MedicineItems.FROZEN_RAW_FISH_KING);
                        entries.add(MedicineItems.COOKED_FISH_KING);
                        entries.add(MedicineItems.FROZEN_COOKED_FISH_KING);
                        entries.add(MedicineItems.GOLDEN_FISH);
                    }).build());

    // 外部调用此方法 自动初始化上方的静态变量
    public static void registerMedicineItemGroups() {
        Medicine.LOGGER.info("Registering Medicine Item Groups");
    }
}
