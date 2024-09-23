package com.medicine.item;

import com.medicine.Medicine;
import com.medicine.item.custom.fishing.MedicineFishingRodItem;
import net.minecraft.item.FishingRodItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import static net.minecraft.util.Rarity.UNCOMMON;

// 此类用于注册模组里面的物品

public class MedicineItems {

    // 药物
    public static final Item ALPHA_PILL = registerItems("alpha_pill", new Item(new Item.Settings()));
    public static final Item BETA_PILL = registerItems("beta_pill", new Item(new Item.Settings()));
    public static final Item GAMMA_PILL = registerItems("gamma_pill", new Item(new Item.Settings()));
    public static final Item DELTA_PILL = registerItems("delta_pill", new Item(new Item.Settings()));
    public static final Item SLEEPING_PILLS = registerItems("sleeping_pills", new Item(new Item.Settings()));
    public static final Item COLD_MEDICINE = registerItems("cold_medicine", new Item(new Item.Settings()));
    public static final Item HEADACHE_PILLS = registerItems("headache_pills", new Item(new Item.Settings()));
    public static final Item PAIN_KILLERS = registerItems("pain_killers", new Item(new Item.Settings()));
    public static final Item VITAMIN_TABLETS = registerItems("vitamin_tablets", new Item(new Item.Settings()));
    public static final Item STOMACH_MEDICINE = registerItems("stomach_medicine", new Item(new Item.Settings()));
    public static final Item AMPHETAMINE = registerItems("amphetamine", new Item(new Item.Settings()));
    public static final Item ETIZOLAM = registerItems("etizolam", new Item(new Item.Settings()));
    public static final Item ASPIRIN = registerItems("aspirin", new Item(new Item.Settings()));
    public static final Item PROPOXYPHENE = registerItems("propoxyphene", new Item(new Item.Settings()));
    public static final Item RITALIN = registerItems("ritalin", new Item(new Item.Settings()));
    public static final Item ANTI_BIOTICS = registerItems("anti_biotics", new Item(new Item.Settings()));
    public static final Item ANTI_DEPRESSANTS = registerItems("anti_depressants", new Item(new Item.Settings()));
    public static final Item PLACEBO = registerItems("placebo", new Item(new Item.Settings()));

    // 食物
    public static final Item APPLE_SODA = registerItems("apple_soda", new Item(new Item.Settings()));
    public static final Item ORANGE_SODA = registerItems("orange_soda", new Item(new Item.Settings()));
    public static final Item CANNED_COKE = registerItems("canned_coke", new Item(new Item.Settings()));
    public static final Item THICK_EGG_TOAST = registerItems("thick_egg_toast", new Item(new Item.Settings()));
    public static final Item POUR_OVER_COFFEE = registerItems("pour_over_coffee", new Item(new Item.Settings()));
    public static final Item VEGGIE_SALAD = registerItems("veggie_salad", new Item(new Item.Settings()));
    public static final Item SAUSAGE_PIZZA = registerItems("sausage_pizza", new Item(new Item.Settings()));
    public static final Item BEEF_BURGER = registerItems("beef_burger", new Item(new Item.Settings()));
    public static final Item CAESAR_BREAD = registerItems("caesar_bread", new Item(new Item.Settings()));
    public static final Item TOMATO_PASTA = registerItems("tomato_pasta", new Item(new Item.Settings()));
    public static final Item SALMON_SOUP = registerItems("salmon_soup", new Item(new Item.Settings()));
    public static final Item TOMAHAWK_STEAK = registerItems("tomahawk_steak", new Item(new Item.Settings()));
    public static final Item BAGGED_CHESTNUTS = registerItems("bagged_chestnuts", new Item(new Item.Settings()));
    public static final Item FRIED_CRISPY_MEAT = registerItems("fried_crispy_meat", new Item(new Item.Settings()));
    public static final Item GRILLED_COLD_NOODLES = registerItems("grilled_cold_noodles", new Item(new Item.Settings()));
    public static final Item PINEAPPLE_ON_A_STICK = registerItems("pineapple_on_a_stick", new Item(new Item.Settings()));
    public static final Item ICED_AMERICANO = registerItems("iced_americano", new Item(new Item.Settings()));
    public static final Item COCONUT_LATTE = registerItems("coconut_latte", new Item(new Item.Settings()));
    public static final Item MOCHA_COFFEE = registerItems("mocha_coffee", new Item(new Item.Settings()));
    public static final Item WEIRD_BLACK_TEA = registerItems("weird_black_tea", new Item(new Item.Settings()));
    public static final Item MINERAL_WATER = registerItems("mineral_water", new Item(new Item.Settings()));
    public static final Item ICED_MINERAL_WATER = registerItems("iced_mineral_water", new Item(new Item.Settings()));
    public static final Item INSTANT_NOODLES = registerItems("instant_noodles", new Item(new Item.Settings()));
    public static final Item LEMON_WATER = registerItems("lemon_water", new Item(new Item.Settings()));
    public static final Item COCONUT_TEA_JELLY = registerItems("coconut_tea_jelly", new Item(new Item.Settings()));
    public static final Item MATCHA_LUCKY_ICE = registerItems("matcha_lucky_ice", new Item(new Item.Settings()));
    public static final Item PLUM_WINE = registerItems("plum_wine", new Item(new Item.Settings()));
    public static final Item CREAM_CAKE = registerItems("cream_cake", new Item(new Item.Settings()));
    public static final Item STRAWBERRY_CAKE = registerItems("strawberry_cake", new Item(new Item.Settings()));
    public static final Item ORANGE_CAKE = registerItems("orange_cake", new Item(new Item.Settings()));
    public static final Item BOX_OF_STRAWBERRIES = registerItems("box_of_strawberries", new Item(new Item.Settings()));
    public static final Item NO_11_STREET_DRIP_COFFEE = registerItems("no_11_street_drip_coffee", new Item(new Item.Settings()));
    public static final Item BAGGED_GRAPE_COOKIES = registerItems("bagged_grape_cookies", new Item(new Item.Settings()));
    public static final Item BAGGED_CREAM_COOKIES = registerItems("bagged_cream_cookies", new Item(new Item.Settings()));
    public static final Item BAGGED_WATERMELON_COOKIES = registerItems("bagged_watermelon_cookies", new Item(new Item.Settings()));
    public static final Item BAGGED_ORANGE_COOKIES = registerItems("bagged_orange_cookies", new Item(new Item.Settings()));
    public static final Item BAGGED_PINEAPPLE_COOKIES = registerItems("bagged_pineapple_cookies", new Item(new Item.Settings()));
    public static final Item BAGGED_BLUEBERRY_COOKIES = registerItems("bagged_blueberry_cookies", new Item(new Item.Settings()));
    public static final Item BAGGED_MINT_COOKIES = registerItems("bagged_mint_cookies", new Item(new Item.Settings()));
    public static final Item RAW_FISH_KING = registerItems("raw_fish_king", new Item(new Item.Settings()));
    public static final Item COOKED_FISH_KING = registerItems("cooked_fish_king", new Item(new Item.Settings()));
    public static final Item FROZEN_RAW_FISH_KING = registerItems("frozen_raw_fish_king", new Item(new Item.Settings()));
    public static final Item FROZEN_COOKED_FISH_KING = registerItems("frozen_cooked_fish_king", new Item(new Item.Settings()));

    // 书籍
    public static final Item COMPUTER_SCIENCE_TEXTBOOKS = registerItems("computer_science_textbooks", new Item(new Item.Settings()));
    public static final Item TEXT_USAGE_TEXTBOOKS = registerItems("text_usage_textbooks", new Item(new Item.Settings()));
    public static final Item PSYCHOLOGY_TEXTBOOKS = registerItems("psychology_textbooks", new Item(new Item.Settings()));
    public static final Item ZENIS_WOOD = registerItems("zenis_wood", new Item(new Item.Settings()));
    public static final Item WRITING_SKILLS_TAUGHT_BY_TEACHER_YU = registerItems("writing_skills_taught_by_teacher_yu", new Item(new Item.Settings()));
    public static final Item NAVAL_MAJOR_AND_THE_CLERK = registerItems("naval_major_and_the_clerk", new Item(new Item.Settings()));
    public static final Item BREATHING_EXERCISES = registerItems("breathing_exercises", new Item(new Item.Settings()));
    public static final Item BRAIN_IN_A_VAT = registerItems("brain_in_a_vat", new Item(new Item.Settings()));
    public static final Item SECRETS_TO_STAY_AWAKE = registerItems("secrets_to_stay_awake", new Item(new Item.Settings()));
    public static final Item PINBALL_2001 = registerItems("pinball_2001", new Item(new Item.Settings()));
    public static final Item TALE_OF_THE_SEA_GOD = registerItems("tale_of_the_sea_god", new Item(new Item.Settings()));
    public static final Item SPRING_OF_ASKALON = registerItems("spring_of_askalon", new Item(new Item.Settings()));
    public static final Item WINTER_OF_ASTAROTH = registerItems("winter_of_astaroth", new Item(new Item.Settings()));
    public static final Item DEEP_RAIN = registerItems("deep_rain", new Item(new Item.Settings()));
    public static final Item PRACTICAL_ENCYCLOPEDIA = registerItems("practical_encyclopedia", new Item(new Item.Settings()));
    public static final Item A_LION_ON_ITS_OWN = registerItems("a_lion_on_its_own", new Item(new Item.Settings()));
    public static final Item GODS_US_OR_ALL_SOLDIERS = registerItems("gods_us_or_all_soldiers", new Item(new Item.Settings()));
    public static final Item END_OF_THE_WORLD = registerItems("end_of_the_world", new Item(new Item.Settings()));
    public static final Item FEVER_ILLNESS = registerItems("fever_illness", new Item(new Item.Settings()));
    public static final Item BAPTISM_OF_VIOLET = registerItems("baptism_of_violet", new Item(new Item.Settings()));
    public static final Item NORTH_OF_THE_BORDER_SOUTH_OF_THE_STARS = registerItems("north_of_the_border_south_of_the_stars", new Item(new Item.Settings()));
    public static final Item A_WILD_SHEEP_ADVENTURE = registerItems("a_wild_sheep_adventure", new Item(new Item.Settings()));
    public static final Item THE_ART_OF_LETTING_GO = registerItems("the_art_of_letting_go", new Item(new Item.Settings()));
    public static final Item GUNMAN_IN_THE_RAIN = registerItems("gunman_in_the_rain", new Item(new Item.Settings()));
    public static final Item FISHING_MASTERS_PRIVATE_TIPS = registerItems("fishing_masters_private_tips", new Item(new Item.Settings()));
    public static final Item SECRETS_OF_THE_FISSURE = registerItems("secrets_of_the_fissure", new Item(new Item.Settings()));
    public static final Item SCARS_OF_THE_SKY = registerItems("scars_of_the_sky", new Item(new Item.Settings()));
    public static final Item ASTONISHING_SECRETS_SO_IT_GOES = registerItems("astonishing_secrets_so_it_goes", new Item(new Item.Settings()));
    public static final Item DO_NOT_READ_THIS_BOOK = registerItems("do_not_read_this_book", new Item(new Item.Settings()));

    // 植物
    public static final Item MAGNOLIA_POT = registerItems("magnolia_pot", new Item(new Item.Settings()));
    public static final Item FORGET_ME_NOT_POT = registerItems("forget_me_not_pot", new Item(new Item.Settings()));
    public static final Item MARIGOLD_POT = registerItems("marigold_pot", new Item(new Item.Settings()));
    public static final Item SUNFLOWER_POT = registerItems("sunflower_pot", new Item(new Item.Settings()));
    public static final Item ROSE_BOUQUET = registerItems("rose_bouquet", new Item(new Item.Settings()));
    public static final Item CACTUS_POTTED_PLANT = registerItems("cactus_potted_plant", new Item(new Item.Settings()));
    public static final Item BLOOMING_CACTUS_POTTED_PLANT = registerItems("blooming_cactus_potted_plant", new Item(new Item.Settings()));
    public static final Item DEAD_CACTUS_POTTED_PLANT = registerItems("dead_cactus_potted_plant", new Item(new Item.Settings()));
    public static final Item CACTUS_FERTILIZER = registerItems("cactus_fertilizer", new Item(new Item.Settings()));
    public static final Item CACTUS_CULTIVATION_MANUAL = registerItems("cactus_cultivation_manual", new Item(new Item.Settings()));

    // 藏品
    public static final Item BADMINTON_RACKET = registerItems("badminton_racket", new Item(new Item.Settings()));
    public static final Item MINI_HUMIDIFIER = registerItems("mini_humidifier", new Item(new Item.Settings()));
    public static final Item SNOW_GLOBE = registerItems("snow_globe", new Item(new Item.Settings()));
    public static final Item CLOCK_TOWER_ORNAMENT = registerItems("clock_tower_ornament", new Item(new Item.Settings()));
    public static final Item VALID_GYM_MEMBERSHIP_CARD = registerItems("valid_gym_membership_card", new Item(new Item.Settings()));
    public static final Item GOLD_MEDAL_AUTHOR_TROPHY = registerItems("gold_medal_author_trophy", new Item(new Item.Settings()));
    public static final Item COUPON = registerItems("coupon", new Item(new Item.Settings()));
    public static final Item TOMATO_BROOCH = registerItems("tomato_brooch", new Item(new Item.Settings()));
    public static final Item SNEAKERS = registerItems("sneakers", new Item(new Item.Settings()));
    public static final Item FILE_FOLDER_SET = registerItems("file_folder_set", new Item(new Item.Settings()));
    public static final Item NOTEBOOK = registerItems("notebook", new Item(new Item.Settings()));
    public static final Item FRUIT_KNIFE = registerItems("fruit_knife", new Item(new Item.Settings()));
    public static final Item REPAIR_TOOL_KIT = registerItems("repair_tool_kit", new Item(new Item.Settings()));
    public static final Item MEDICAL_KIT = registerItems("medical_kit", new Item(new Item.Settings()));
    public static final Item VOICE_RECORDER = registerItems("voice_recorder", new Item(new Item.Settings()));
    public static final Item FASCIA_GUN = registerItems("fascia_gun", new Item(new Item.Settings()));
    public static final Item MINI_FRIDGE = registerItems("mini_fridge", new Item(new Item.Settings()));
    public static final Item ELECTRIC_KETTLE = registerItems("electric_kettle", new Item(new Item.Settings()));
    public static final Item RUBBER_DUCK = registerItems("rubber_duck", new Item(new Item.Settings()));
    public static final Item SUNSHINE_DOLL = registerItems("sunshine_doll", new Item(new Item.Settings()));
    public static final Item ADVANCED_SPORTS_GUIDE = registerItems("advanced_sports_guide", new Item(new Item.Settings()));
    public static final Item TUNGSTEN_ALLOY_ORNAMENT = registerItems("tungsten_alloy_ornament", new Item(new Item.Settings()));
    public static final Item SOFT_PILLOW = registerItems("soft_pillow", new Item(new Item.Settings()));
    public static final Item ORANGE_BOOKMARK = registerItems("orange_bookmark", new Item(new Item.Settings()));
    public static final Item FIDGET_SPINNER = registerItems("fidget_spinner", new Item(new Item.Settings()));

    // 特殊藏品
    public static final Item HALLUKES_OLD_KNEE_PAD = registerItems("hallukes_old_knee_pad", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item ACOLASS_OLD_NOTES = registerItems("acolass_old_notes", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item DEPLINES_SKETCH = registerItems("deplines_sketch", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item TICKET_OF_DERIMO = registerItems("ticket_of_derimo", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item STICKER_59 = registerItems("sticker_59", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item GROUP_PHOTO = registerItems("group_photo", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item CITY_A_HOSPITAL_MEDICAL_REPORT = registerItems("city_a_hospital_medical_report", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item TRANSPARENT_MEDICINE_BOTTLE = registerItems("transparent_medicine_bottle", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item EXPIRED_TRAIN_TICKET = registerItems("expired_train_ticket", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item BOOK = registerItems("book", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item LEAVE_PERMISSION = registerItems("leave_permission", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item SPORTS_BOTTLE = registerItems("sports_bottle", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item LIGHTER = registerItems("lighter", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item EXPLICIT_PHOTO = registerItems("explicit_photo", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item BLACK_LION_PLUSH = registerItems("black_lion_plush", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item COFFEE_MACHINE = registerItems("coffee_machine", new Item(new Item.Settings().rarity(Rarity.EPIC)));
    public static final Item SILVER_BOOKMARK = registerItems("silver_bookmark", new Item(new Item.Settings().rarity(Rarity.EPIC)));

    // 钓鱼
    public static final Item FIBERGLASS_FISHING_ROD = registerItems("fiberglass_fishing_rod", new MedicineFishingRodItem(new Item.Settings().maxDamage(64)));
    public static final Item CARBON_FIBER_FISHING_ROD = registerItems("carbon_fiber_fishing_rod", new MedicineFishingRodItem(new Item.Settings().maxDamage(64)));
    public static final Item TITANIUM_ALLOY_FISHING_ROD = registerItems("titanium_alloy_fishing_rod", new MedicineFishingRodItem(new Item.Settings().maxDamage(64)));
    public static final Item SUPER_INVINCIBLE_FISHING_ROD = registerItems("super_invincible_fishing_rod", new MedicineFishingRodItem(new Item.Settings().maxDamage(64)));
    public static final Item VIAL_OF_STRANGE_LIQUID = registerItems("vial_of_strange_liquid", new Item(new Item.Settings()));
    public static final Item GOLD_RING = registerItems("gold_ring", new Item(new Item.Settings()));
    public static final Item GOLDEN_FISH = registerItems("golden_fish", new Item(new Item.Settings().rarity(UNCOMMON)));

    // 注册物品时调用此函数 实现物品的注册
    public static Item registerItems(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Medicine.MOD_ID, id), item);
    }

    public static void registerMedicineItems() {
        Medicine.LOGGER.info("Registering Medicine Items");
    }
}
