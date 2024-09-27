package com.medicine.datagen;

import com.medicine.item.MedicineItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.data.client.Models;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;


// 此类用于进行中文翻译的数据生成
public class MedicineENUSLanProvider_zh_cn extends FabricLanguageProvider {

    public MedicineENUSLanProvider_zh_cn(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {



        // 药物
        translationBuilder.add(MedicineItems.ALPHA_PILL, "α药");
        translationBuilder.add(MedicineItems.BETA_PILL, "β药");
        translationBuilder.add(MedicineItems.GAMMA_PILL, "γ药");
        translationBuilder.add(MedicineItems.DELTA_PILL, "δ药");

        translationBuilder.add(MedicineItems.SLEEPING_PILLS, "安眠药");
        translationBuilder.add(MedicineItems.COLD_MEDICINE, "感冒药");
        translationBuilder.add(MedicineItems.HEADACHE_PILLS, "头疼药");
        translationBuilder.add(MedicineItems.PAIN_KILLERS, "镇痛药");
        translationBuilder.add(MedicineItems.VITAMIN_TABLETS, "维生素片");
        translationBuilder.add(MedicineItems.STOMACH_MEDICINE, "胃药");
        translationBuilder.add(MedicineItems.AMPHETAMINE, "安非他命");
        translationBuilder.add(MedicineItems.ETIZOLAM, "依替唑仑");
        translationBuilder.add(MedicineItems.ASPIRIN, "阿司匹林");
        translationBuilder.add(MedicineItems.PROPOXYPHENE, "右丙氧芬");
        translationBuilder.add(MedicineItems.RITALIN, "利他林");
        translationBuilder.add(MedicineItems.ANTI_BIOTICS, "抗生素");
        translationBuilder.add(MedicineItems.ANTI_DEPRESSANTS, "抗抑郁药");
        translationBuilder.add(MedicineItems.PLACEBO, "安慰剂");

        // 食物
        translationBuilder.add(MedicineItems.APPLE_SODA, "苹果汽水");
        translationBuilder.add(MedicineItems.ORANGE_SODA, "橘子汽水");
        translationBuilder.add(MedicineItems.CANNED_COKE, "罐装可乐");
        translationBuilder.add(MedicineItems.THICK_EGG_TOAST, "厚蛋土司");
        translationBuilder.add(MedicineItems.POUR_OVER_COFFEE, "手冲咖啡");
        translationBuilder.add(MedicineItems.VEGGIE_SALAD, "时蔬沙拉");
        translationBuilder.add(MedicineItems.SAUSAGE_PIZZA, "香肠皮萨");
        translationBuilder.add(MedicineItems.BEEF_BURGER, "牛肉汉堡");
        translationBuilder.add(MedicineItems.CAESAR_BREAD, "凯撒面包");
        translationBuilder.add(MedicineItems.TOMATO_PASTA, "番茄意面");
        translationBuilder.add(MedicineItems.SALMON_SOUP, "鲑鱼靓汤");
        translationBuilder.add(MedicineItems.TOMAHAWK_STEAK, "战斧牛排");
        translationBuilder.add(MedicineItems.BAGGED_CHESTNUTS, "袋装糖炒板栗");
        translationBuilder.add(MedicineItems.FRIED_CRISPY_MEAT, "油炸小酥肉");
        translationBuilder.add(MedicineItems.GRILLED_COLD_NOODLES, "烤冷面");
        translationBuilder.add(MedicineItems.PINEAPPLE_ON_A_STICK, "插着木签的菠萝片");
        translationBuilder.add(MedicineItems.ICED_AMERICANO, "冰美式");
        translationBuilder.add(MedicineItems.COCONUT_LATTE, "生椰拿铁");
        translationBuilder.add(MedicineItems.MOCHA_COFFEE, "摩卡咖啡");
        translationBuilder.add(MedicineItems.WEIRD_BLACK_TEA, "奇怪的红茶");
        translationBuilder.add(MedicineItems.MINERAL_WATER, "天然矿泉水");
        translationBuilder.add(MedicineItems.ICED_MINERAL_WATER, "冰天然矿泉水");
        translationBuilder.add(MedicineItems.INSTANT_NOODLES, "泡面");
        translationBuilder.add(MedicineItems.LEMON_WATER, "柠檬水");
        translationBuilder.add(MedicineItems.COCONUT_TEA_JELLY, "椰椰茶冻");
        translationBuilder.add(MedicineItems.MATCHA_LUCKY_ICE, "抹茶幸运冰");
        translationBuilder.add(MedicineItems.PLUM_WINE, "梅子酒");
        translationBuilder.add(MedicineItems.CREAM_CAKE, "小块奶油蛋糕");
        translationBuilder.add(MedicineItems.STRAWBERRY_CAKE, "小块草莓蛋糕");
        translationBuilder.add(MedicineItems.ORANGE_CAKE, "小块香橙蛋糕");
        translationBuilder.add(MedicineItems.BOX_OF_STRAWBERRIES, "一盒草莓");
        translationBuilder.add(MedicineItems.NO_11_STREET_DRIP_COFFEE, "“11号街”挂耳咖啡包");
        translationBuilder.add(MedicineItems.BAGGED_GRAPE_COOKIES, "袋装葡萄味饼干");
        translationBuilder.add(MedicineItems.BAGGED_CREAM_COOKIES, "袋装奶油味饼干");
        translationBuilder.add(MedicineItems.BAGGED_WATERMELON_COOKIES, "袋装西瓜味饼干");
        translationBuilder.add(MedicineItems.BAGGED_ORANGE_COOKIES, "袋装香橙味饼干");
        translationBuilder.add(MedicineItems.BAGGED_PINEAPPLE_COOKIES, "袋装菠萝味饼干");
        translationBuilder.add(MedicineItems.BAGGED_BLUEBERRY_COOKIES, "袋装蓝莓味饼干");
        translationBuilder.add(MedicineItems.BAGGED_MINT_COOKIES, "袋装薄荷味饼干");
        translationBuilder.add(MedicineItems.RAW_FISH_KING, "生鱼王");
        translationBuilder.add(MedicineItems.COOKED_FISH_KING, "熟鱼王");
        translationBuilder.add(MedicineItems.FROZEN_RAW_FISH_KING, "冻生鱼王");
        translationBuilder.add(MedicineItems.FROZEN_COOKED_FISH_KING, "冻熟鱼王");

        // 书籍
        translationBuilder.add(MedicineItems.COMPUTER_SCIENCE_TEXTBOOKS, "计算机科学专业书籍");
        translationBuilder.add(MedicineItems.TEXT_USAGE_TEXTBOOKS, "文字运用专业书籍");
        translationBuilder.add(MedicineItems.PSYCHOLOGY_TEXTBOOKS, "心理学专业书籍");
        translationBuilder.add(MedicineItems.ZENIS_WOOD, "泽尼的森林");
        translationBuilder.add(MedicineItems.WRITING_SKILLS_TAUGHT_BY_TEACHER_YU, "于老师教我的写作技巧");
        translationBuilder.add(MedicineItems.NAVAL_MAJOR_AND_THE_CLERK, "海军少校与书记官");
        translationBuilder.add(MedicineItems.BREATHING_EXERCISES, "呼吸训练");
        translationBuilder.add(MedicineItems.BRAIN_IN_A_VAT, "缸中之脑");
        translationBuilder.add(MedicineItems.SECRETS_TO_STAY_AWAKE, "保持清醒的秘诀");
        translationBuilder.add(MedicineItems.PINBALL_2001, "2001年的弹珠机");
        translationBuilder.add(MedicineItems.TALE_OF_THE_SEA_GOD, "海神记");
        translationBuilder.add(MedicineItems.SPRING_OF_ASKALON, "阿斯卡隆之春");
        translationBuilder.add(MedicineItems.WINTER_OF_ASTAROTH, "亚斯塔禄之冬");
        translationBuilder.add(MedicineItems.DEEP_RAIN, "深沉之雨");
        translationBuilder.add(MedicineItems.PRACTICAL_ENCYCLOPEDIA, "实用百科全书");
        translationBuilder.add(MedicineItems.A_LION_ON_ITS_OWN, "一只特立独行的狮子");
        translationBuilder.add(MedicineItems.GODS_US_OR_ALL_SOLDIERS, "神，我们，或所有士兵");
        translationBuilder.add(MedicineItems.END_OF_THE_WORLD, "世界之终");
        translationBuilder.add(MedicineItems.FEVER_ILLNESS, "热病");
        translationBuilder.add(MedicineItems.BAPTISM_OF_VIOLET, "紫罗兰的洗礼");
        translationBuilder.add(MedicineItems.NORTH_OF_THE_BORDER_SOUTH_OF_THE_STARS, "国境以北星空以南");
        translationBuilder.add(MedicineItems.A_WILD_SHEEP_ADVENTURE, "寻羊历险记");
        translationBuilder.add(MedicineItems.THE_ART_OF_LETTING_GO, "摆烂的艺术");
        translationBuilder.add(MedicineItems.GUNMAN_IN_THE_RAIN, "雨中枪手");
        translationBuilder.add(MedicineItems.FISHING_MASTERS_PRIVATE_TIPS, "垂钓大师私家秘诀");
        translationBuilder.add(MedicineItems.SECRETS_OF_THE_FISSURE, "裂分之秘");
        translationBuilder.add(MedicineItems.SCARS_OF_THE_SKY, "天宇的伤疤");
        translationBuilder.add(MedicineItems.ASTONISHING_SECRETS_SO_IT_GOES, "惊天秘密！如此这般这般如此");
        translationBuilder.add(MedicineItems.DO_NOT_READ_THIS_BOOK, "不要读这本书");

        // 植物
        translationBuilder.add(MedicineItems.MAGNOLIA_POT, "一盆木兰");
        translationBuilder.add(MedicineItems.FORGET_ME_NOT_POT, "一盆勿忘我");
        translationBuilder.add(MedicineItems.MARIGOLD_POT, "一盆万寿菊");
        translationBuilder.add(MedicineItems.SUNFLOWER_POT, "一盆向日葵");
        translationBuilder.add(MedicineItems.ROSE_BOUQUET, "一束玫瑰花");
        translationBuilder.add(MedicineItems.CACTUS_POTTED_PLANT, "仙人掌盆栽");
        translationBuilder.add(MedicineItems.BLOOMING_CACTUS_POTTED_PLANT, "盛开的仙人掌盆栽");
        translationBuilder.add(MedicineItems.DEAD_CACTUS_POTTED_PLANT, "死亡的仙人掌盆栽");
        translationBuilder.add(MedicineItems.CACTUS_FERTILIZER, "仙人掌肥料");
        translationBuilder.add(MedicineItems.CACTUS_CULTIVATION_MANUAL, "仙人掌栽培手册");

        // 收藏品
        translationBuilder.add(MedicineItems.BADMINTON_RACKET, "羽毛球拍");
        translationBuilder.add(MedicineItems.MINI_HUMIDIFIER, "小型加湿器");
        translationBuilder.add(MedicineItems.SNOW_GLOBE, "落雪景观球");
        translationBuilder.add(MedicineItems.CLOCK_TOWER_ORNAMENT, "钟塔摆件");
        translationBuilder.add(MedicineItems.VALID_GYM_MEMBERSHIP_CARD, "健身房的有效会员卡");
        translationBuilder.add(MedicineItems.GOLD_MEDAL_AUTHOR_TROPHY, "金牌作者证明");
        translationBuilder.add(MedicineItems.COUPON, "优惠券");
        translationBuilder.add(MedicineItems.TOMATO_BROOCH, "番茄胸针");
        translationBuilder.add(MedicineItems.SNEAKERS, "运动鞋");
        translationBuilder.add(MedicineItems.FILE_FOLDER_SET, "档案夹套装");
        translationBuilder.add(MedicineItems.NOTEBOOK, "记事本");
        translationBuilder.add(MedicineItems.FRUIT_KNIFE, "水果刀");
        translationBuilder.add(MedicineItems.REPAIR_TOOL_KIT, "维修工具组");
        translationBuilder.add(MedicineItems.MEDICAL_KIT, "医药箱");
        translationBuilder.add(MedicineItems.VOICE_RECORDER, "录音笔");
        translationBuilder.add(MedicineItems.FASCIA_GUN, "筋膜枪");
        translationBuilder.add(MedicineItems.MINI_FRIDGE, "小型冰箱");
        translationBuilder.add(MedicineItems.ELECTRIC_KETTLE, "热水壶");
        translationBuilder.add(MedicineItems.RUBBER_DUCK, "小黄鸭");
        translationBuilder.add(MedicineItems.SUNSHINE_DOLL, "晴天娃娃");
        translationBuilder.add(MedicineItems.ADVANCED_SPORTS_GUIDE, "高级运动指南");
        translationBuilder.add(MedicineItems.TUNGSTEN_ALLOY_ORNAMENT, "钨合金摆件");
        translationBuilder.add(MedicineItems.SOFT_PILLOW, "柔软枕头");
        translationBuilder.add(MedicineItems.ORANGE_BOOKMARK, "橘色书签");
        translationBuilder.add(MedicineItems.FIDGET_SPINNER, "指尖陀螺");

        // 特殊藏品
        translationBuilder.add(MedicineItems.HALLUKES_OLD_KNEE_PAD, "Halluke的旧护膝");
        translationBuilder.add(MedicineItems.ACOLASS_OLD_NOTES, "Acolas的旧笔记");
        translationBuilder.add(MedicineItems.DEPLINES_SKETCH, "Depline的素描画");
        translationBuilder.add(MedicineItems.TICKET_OF_DERIMO, "德里莫号船票");
        translationBuilder.add(MedicineItems.STICKER_59, "59号贴纸");
        translationBuilder.add(MedicineItems.GROUP_PHOTO, "合照");
        translationBuilder.add(MedicineItems.CITY_A_HOSPITAL_MEDICAL_REPORT, "A市医院体检报告单");
        translationBuilder.add(MedicineItems.TRANSPARENT_MEDICINE_BOTTLE, "透明药瓶");
        translationBuilder.add(MedicineItems.EXPIRED_TRAIN_TICKET, "失效的火车票");
        translationBuilder.add(MedicineItems.BOOK, "书");
        translationBuilder.add(MedicineItems.LEAVE_PERMISSION, "请假许可");
        translationBuilder.add(MedicineItems.SPORTS_BOTTLE, "运动水壶");
        translationBuilder.add(MedicineItems.LIGHTER, "打火机");
        translationBuilder.add(MedicineItems.EXPLICIT_PHOTO, "色情照片");
        translationBuilder.add(MedicineItems.BLACK_LION_PLUSH, "黑色狮子玩偶");
        translationBuilder.add(MedicineItems.COFFEE_MACHINE, "咖啡机");
        translationBuilder.add(MedicineItems.SILVER_BOOKMARK, "银色书签");

        // 钓鱼
        translationBuilder.add(MedicineItems.FIBERGLASS_FISHING_ROD, "玻璃纤维钓竿");
        translationBuilder.add("tooltip.medicine.fiberglass_fishing_rod", "§7能经受较大的弯折，但十分重§r");
        translationBuilder.add("tooltip.medicine.fiberglass_fishing_rod_shift", "§7最多减少5秒的上钩等待时间§r");
        translationBuilder.add(MedicineItems.CARBON_FIBER_FISHING_ROD, "碳纤维钓竿");
        translationBuilder.add("tooltip.medicine.carbon_fiber_fishing_rod", "§7又轻又结实，十分优秀的钓鱼竿§r");
        translationBuilder.add("tooltip.medicine.carbon_fiber_fishing_rod_shift", "§7最多减少10秒的上钩等待时间§r");
        translationBuilder.add(MedicineItems.TITANIUM_ALLOY_FISHING_ROD, "钛合金钓竿");
        translationBuilder.add("tooltip.medicine.titanium_alloy_fishing_rod", "§7宣传语是“永不空军”§r");
        translationBuilder.add("tooltip.medicine.titanium_alloy_fishing_rod_shift", "§7最多减少15秒的上钩等待时间§r");
        translationBuilder.add(MedicineItems.SUPER_INVINCIBLE_FISHING_ROD, "超级无敌钓竿");
        translationBuilder.add("tooltip.medicine.super_invincible_fishing_rod", "§7你已经用钱征服了这个钓鱼游戏，现在去干点别的吧？§r");
        translationBuilder.add("tooltip.medicine.super_invincible_fishing_rod_shift", "§7最多减少25秒的上钩等待时间，可以实现自动钓鱼§r");
        translationBuilder.add(MedicineItems.VIAL_OF_STRANGE_LIQUID, "神秘液体瓶");
        translationBuilder.add(MedicineItems.GOLD_RING, "金戒指");
        translationBuilder.add(MedicineItems.GOLDEN_FISH, "黄金鱼");


        // 创造模式物品栏
        translationBuilder.add("itemGroup.medicine_group", "药物");
        translationBuilder.add("itemGroup.food_group", "食物");
        translationBuilder.add("itemGroup.book_group", "书籍");
        translationBuilder.add("itemGroup.plant_group", "植物");
        translationBuilder.add("itemGroup.collectible_group", "收藏品");
        translationBuilder.add("itemGroup.special_collectible_group", "特殊藏品");
        translationBuilder.add("itemGroup.fishing_group", "钓鱼");

        // 未完成提示
        translationBuilder.add("tooltip.medicine.unfinished", "§7如果你看到这条信息，说明这个物品可能还没做完§r");
    }
}
