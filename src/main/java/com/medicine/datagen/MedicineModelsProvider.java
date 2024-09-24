package com.medicine.datagen;

import com.medicine.item.MedicineItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class MedicineModelsProvider extends FabricModelProvider {

    public MedicineModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        // 药物
        itemModelGenerator.register(MedicineItems.ALPHA_PILL, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.BETA_PILL, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.GAMMA_PILL, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.DELTA_PILL, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.SLEEPING_PILLS, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.COLD_MEDICINE, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.HEADACHE_PILLS, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.PAIN_KILLERS, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.VITAMIN_TABLETS, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.STOMACH_MEDICINE, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.AMPHETAMINE, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.ETIZOLAM, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.ASPIRIN, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.PROPOXYPHENE, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.RITALIN, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.ANTI_BIOTICS, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.ANTI_DEPRESSANTS, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.PLACEBO, Models.GENERATED);

        // 食物
        itemModelGenerator.register(MedicineItems.APPLE_SODA, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.ORANGE_SODA, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.CANNED_COKE, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.THICK_EGG_TOAST, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.POUR_OVER_COFFEE, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.VEGGIE_SALAD, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.SAUSAGE_PIZZA, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.BEEF_BURGER, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.CAESAR_BREAD, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.TOMATO_PASTA, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.SALMON_SOUP, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.TOMAHAWK_STEAK, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.BAGGED_CHESTNUTS, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.FRIED_CRISPY_MEAT, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.GRILLED_COLD_NOODLES, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.PINEAPPLE_ON_A_STICK, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.ICED_AMERICANO, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.COCONUT_LATTE, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.MOCHA_COFFEE, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.WEIRD_BLACK_TEA, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.MINERAL_WATER, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.ICED_MINERAL_WATER, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.INSTANT_NOODLES, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.LEMON_WATER, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.COCONUT_TEA_JELLY, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.MATCHA_LUCKY_ICE, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.PLUM_WINE, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.CREAM_CAKE, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.STRAWBERRY_CAKE, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.ORANGE_CAKE, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.BOX_OF_STRAWBERRIES, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.NO_11_STREET_DRIP_COFFEE, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.BAGGED_GRAPE_COOKIES, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.BAGGED_CREAM_COOKIES, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.BAGGED_WATERMELON_COOKIES, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.BAGGED_ORANGE_COOKIES, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.BAGGED_PINEAPPLE_COOKIES, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.BAGGED_BLUEBERRY_COOKIES, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.BAGGED_MINT_COOKIES, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.RAW_FISH_KING, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.COOKED_FISH_KING, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.FROZEN_RAW_FISH_KING, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.FROZEN_COOKED_FISH_KING, Models.GENERATED);

        // 书籍
        itemModelGenerator.register(MedicineItems.COMPUTER_SCIENCE_TEXTBOOKS, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.TEXT_USAGE_TEXTBOOKS, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.PSYCHOLOGY_TEXTBOOKS, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.ZENIS_WOOD, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.WRITING_SKILLS_TAUGHT_BY_TEACHER_YU, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.NAVAL_MAJOR_AND_THE_CLERK, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.BREATHING_EXERCISES, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.BRAIN_IN_A_VAT, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.SECRETS_TO_STAY_AWAKE, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.PINBALL_2001, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.TALE_OF_THE_SEA_GOD, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.SPRING_OF_ASKALON, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.WINTER_OF_ASTAROTH, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.DEEP_RAIN, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.PRACTICAL_ENCYCLOPEDIA, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.A_LION_ON_ITS_OWN, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.GODS_US_OR_ALL_SOLDIERS, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.END_OF_THE_WORLD, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.FEVER_ILLNESS, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.BAPTISM_OF_VIOLET, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.NORTH_OF_THE_BORDER_SOUTH_OF_THE_STARS, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.A_WILD_SHEEP_ADVENTURE, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.THE_ART_OF_LETTING_GO, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.GUNMAN_IN_THE_RAIN, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.FISHING_MASTERS_PRIVATE_TIPS, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.SECRETS_OF_THE_FISSURE, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.SCARS_OF_THE_SKY, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.ASTONISHING_SECRETS_SO_IT_GOES, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.DO_NOT_READ_THIS_BOOK, Models.GENERATED);

        // 植物
        itemModelGenerator.register(MedicineItems.MAGNOLIA_POT, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.FORGET_ME_NOT_POT, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.MARIGOLD_POT, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.SUNFLOWER_POT, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.ROSE_BOUQUET, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.CACTUS_POTTED_PLANT, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.BLOOMING_CACTUS_POTTED_PLANT, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.DEAD_CACTUS_POTTED_PLANT, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.CACTUS_FERTILIZER, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.CACTUS_CULTIVATION_MANUAL, Models.GENERATED);

        // 收藏品
        itemModelGenerator.register(MedicineItems.BADMINTON_RACKET, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.MINI_HUMIDIFIER, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.SNOW_GLOBE, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.CLOCK_TOWER_ORNAMENT, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.VALID_GYM_MEMBERSHIP_CARD, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.GOLD_MEDAL_AUTHOR_TROPHY, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.COUPON, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.TOMATO_BROOCH, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.SNEAKERS, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.FILE_FOLDER_SET, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.NOTEBOOK, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.FRUIT_KNIFE, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.REPAIR_TOOL_KIT, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.MEDICAL_KIT, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.VOICE_RECORDER, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.FASCIA_GUN, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.MINI_FRIDGE, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.ELECTRIC_KETTLE, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.RUBBER_DUCK, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.SUNSHINE_DOLL, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.TUNGSTEN_ALLOY_ORNAMENT, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.ADVANCED_SPORTS_GUIDE, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.SOFT_PILLOW, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.ORANGE_BOOKMARK, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.FIDGET_SPINNER, Models.GENERATED);

        // 特殊藏品
        itemModelGenerator.register(MedicineItems.HALLUKES_OLD_KNEE_PAD, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.ACOLASS_OLD_NOTES, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.DEPLINES_SKETCH, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.TICKET_OF_DERIMO, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.STICKER_59, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.GROUP_PHOTO, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.CITY_A_HOSPITAL_MEDICAL_REPORT, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.TRANSPARENT_MEDICINE_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.EXPIRED_TRAIN_TICKET, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.BOOK, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.LEAVE_PERMISSION, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.SPORTS_BOTTLE, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.LIGHTER, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.EXPLICIT_PHOTO, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.BLACK_LION_PLUSH, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.COFFEE_MACHINE, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.SILVER_BOOKMARK, Models.GENERATED);

        // 钓鱼
//        itemModelGenerator.register(MedicineItems.FIBERGLASS_FISHING_ROD, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.CARBON_FIBER_FISHING_ROD, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.TITANIUM_ALLOY_FISHING_ROD, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.SUPER_INVINCIBLE_FISHING_ROD, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.VIAL_OF_STRANGE_LIQUID, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.GOLD_RING, Models.GENERATED);
        itemModelGenerator.register(MedicineItems.GOLDEN_FISH, Models.GENERATED);
    }
}
