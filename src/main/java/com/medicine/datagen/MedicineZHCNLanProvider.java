package com.medicine.datagen;

import com.medicine.item.MedicineItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;


/**
 * 此类用于进行中文翻译的数据生成
 * 由于物品描述很长 最好把游戏界面调小玩
 */
public class MedicineZHCNLanProvider extends FabricLanguageProvider {

    public MedicineZHCNLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
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
        translationBuilder.add("tooltip.medicine.apple_soda", "“亚斯塔禄牌苹果汽水，比同类品牌产品多添加20%纯果汁！”");
        translationBuilder.add("tooltip.medicine.apple_soda_shift", "");
        translationBuilder.add(MedicineItems.ORANGE_SODA, "橘子汽水");
        translationBuilder.add("tooltip.medicine.orange_soda", "“阿斯卡隆牌橘子汽水，喝到就是赚到！”");
        translationBuilder.add("tooltip.medicine.orange_soda_shift", "");
        translationBuilder.add(MedicineItems.CANNED_COKE, "罐装可乐");
        translationBuilder.add("tooltip.medicine.canned_coke", "“The choice of a new generation.”");
        translationBuilder.add("tooltip.medicine.canned_coke_shift", "");
        translationBuilder.add(MedicineItems.THICK_EGG_TOAST, "厚蛋吐司");
        translationBuilder.add("tooltip.medicine.thick_egg_toast", "外脆里嫩，鲜香不腻，不过高筋面粉一定要过筛。");
        translationBuilder.add("tooltip.medicine.thick_egg_toast_shift", "");
        translationBuilder.add(MedicineItems.POUR_OVER_COFFEE, "手冲咖啡");
        translationBuilder.add("tooltip.medicine.pour_over_coffee", "又苦又难喝，但是能让人打起精神。");
        translationBuilder.add("tooltip.medicine.pour_over_coffee_shift", "");
        translationBuilder.add(MedicineItems.VEGGIE_SALAD, "时蔬沙拉");
        translationBuilder.add("tooltip.medicine.veggie_salad", "膳食指南推荐一般建议每天摄入300-500g、至少5种以上的蔬菜……");
        translationBuilder.add("tooltip.medicine.veggie_salad_shift", "");
        translationBuilder.add(MedicineItems.SAUSAGE_PIZZA, "香肠皮萨");
        translationBuilder.add("tooltip.medicine.sausage_pizza", "上等的披萨必须具备四个特质：新鲜饼皮、上等芝士、奶酪、顶级比萨酱和新鲜的馅料……");
        translationBuilder.add("tooltip.medicine.sausage_pizza_shift", "");
        translationBuilder.add(MedicineItems.BEEF_BURGER, "牛肉汉堡");
        translationBuilder.add("tooltip.medicine.beef_burger", "热熔芝士yyds！芝士与牛肉饼完美融合，浓香四溢的完美升级！");
        translationBuilder.add("tooltip.medicine.beef_burger_shift", "");
        translationBuilder.add(MedicineItems.CAESAR_BREAD, "凯撒面包");
        translationBuilder.add("tooltip.medicine.caesar_bread", "规定斜切必须要有5道裂口才算标准的长条面包！");
        translationBuilder.add("tooltip.medicine.caesar_bread_shift", "");
        translationBuilder.add(MedicineItems.TOMATO_PASTA, "番茄意面");
        translationBuilder.add("tooltip.medicine.tomato_pasta", "非常的新鲜，非常的美味。");
        translationBuilder.add("tooltip.medicine.tomato_pasta_shift", "");
        translationBuilder.add(MedicineItems.SALMON_SOUP, "鲑鱼靓汤");
        translationBuilder.add("tooltip.medicine.salmon_soup", "“现在，它早已死了，只是眼里还闪着一丝诡异的光。”");
        translationBuilder.add("tooltip.medicine.salmon_soup_shift", "");
        translationBuilder.add(MedicineItems.TOMAHAWK_STEAK, "战斧牛排");
        translationBuilder.add("tooltip.medicine.tomahawk_steak", "家庭聚会一定要点这道菜比惠灵顿还哇塞。……一个人吃？咋不撑死你呢？");
        translationBuilder.add("tooltip.medicine.tomahawk_steak_shift", "");
        translationBuilder.add(MedicineItems.BAGGED_CHESTNUTS, "袋装糖炒板栗");
        translationBuilder.add("tooltip.medicine.bagged_chestnuts", "大多数人都喜欢购买的餐后小零食，也可以当做一顿不怎么管饱的午饭，香味飘散在空气中简单引发食欲。不过吃多了可不太妙，你不准备再花更多的钱去看牙齿。");
        translationBuilder.add("tooltip.medicine.bagged_chestnuts_shift", "");
        translationBuilder.add(MedicineItems.FRIED_CRISPY_MEAT, "油炸小酥肉");
        translationBuilder.add("tooltip.medicine.fried_crispy_meat", "似乎是一家网红小吃店的招牌，手机里到处是它的广告，同样在各种测评里时常出现它的身影。看上去金黄酥脆，但是谁知道是不是地沟油做的呢？");
        translationBuilder.add("tooltip.medicine.fried_crispy_meat_shift", "");
        translationBuilder.add(MedicineItems.GRILLED_COLD_NOODLES, "烤冷面");
        translationBuilder.add("tooltip.medicine.grilled_cold_noodles", "不是用火烤的面条哦，是酸甜鲜香的烤冷面！");
        translationBuilder.add("tooltip.medicine.grilled_cold_noodles_shift", "");
        translationBuilder.add(MedicineItems.PINEAPPLE_ON_A_STICK, "插着木签的菠萝片");
        translationBuilder.add("tooltip.medicine.pineapple_on_a_stick", "新鲜的小菠萝，店家特地用盐水洗过一遍的削皮新鲜水果，酸中带甜，可是总会有汁水溅在衣服上。当然，最难过的是菠萝会塞牙，祝你好运。");
        translationBuilder.add("tooltip.medicine.pineapple_on_a_stick_shift", "");
        translationBuilder.add(MedicineItems.ICED_AMERICANO, "冰美式");
        translationBuilder.add("tooltip.medicine.iced_americano", "A市的人喝咖啡，像进行一场不需要规则的游戏，随性放任，百无禁忌。");
        translationBuilder.add("tooltip.medicine.iced_americano_shift", "");
        translationBuilder.add(MedicineItems.COCONUT_LATTE, "生椰拿铁");
        translationBuilder.add("tooltip.medicine.coconut_latte", "“我不在咖啡馆，就在去咖啡馆的路上。”");
        translationBuilder.add("tooltip.medicine.coconut_latte_shift", "");
        translationBuilder.add(MedicineItems.MOCHA_COFFEE, "摩卡咖啡");
        translationBuilder.add("tooltip.medicine.mocha_coffee", "让爱恋中的人们了解爱情的甜美和波折，为了告诉我们幸福的简单。");
        translationBuilder.add("tooltip.medicine.mocha_coffee_shift", "");
        translationBuilder.add(MedicineItems.WEIRD_BLACK_TEA, "奇怪的红茶");
        translationBuilder.add("tooltip.medicine.weird_black_tea", "在你拜访你最喜欢的朋友的家时，可以分享给他品尝，不过要提前问好几分钟后会不会有人敲门。");
        translationBuilder.add("tooltip.medicine.weird_black_tea_shift", "");
        translationBuilder.add(MedicineItems.MINERAL_WATER, "天然矿泉水");
        translationBuilder.add("tooltip.medicine.mineral_water", "“添加了一整个元素周期表的微量元素，纯天然矿物质水就选于秀爱牌天然矿泉水。”");
        translationBuilder.add("tooltip.medicine.mineral_water_shift", "");
        translationBuilder.add(MedicineItems.ICED_MINERAL_WATER, "冰天然矿泉水");
        translationBuilder.add("tooltip.medicine.iced_mineral_water", "好吧，它确实应该变成冰水。");
        translationBuilder.add("tooltip.medicine.iced_mineral_water_shift", "");
        translationBuilder.add(MedicineItems.INSTANT_NOODLES, "泡面");
        translationBuilder.add("tooltip.medicine.instant_noodles", "某种意义上的硬通货。");
        translationBuilder.add("tooltip.medicine.instant_noodles_shift", "");
        translationBuilder.add(MedicineItems.LEMON_WATER, "柠檬水");
        translationBuilder.add("tooltip.medicine.lemon_water", "普通的柠檬水，便宜又好喝。");
        translationBuilder.add("tooltip.medicine.lemon_water_shift", "");
        translationBuilder.add(MedicineItems.COCONUT_TEA_JELLY, "椰椰茶冻");
        translationBuilder.add("tooltip.medicine.coconut_tea_jelly", "椰子香味和淡淡的乌龙茶香简直是绝配。");
        translationBuilder.add("tooltip.medicine.coconut_tea_jelly_shift", "");
        translationBuilder.add(MedicineItems.MATCHA_LUCKY_ICE, "抹茶幸运冰");
        translationBuilder.add("tooltip.medicine.matcha_lucky_ice", "虽然我对抹茶不感兴趣，但它真的很好喝。");
        translationBuilder.add("tooltip.medicine.matcha_lucky_ice_shift", "");
        translationBuilder.add(MedicineItems.PLUM_WINE, "梅子酒");
        translationBuilder.add("tooltip.medicine.plum_wine", "“吾身为火，烧尽那些敢于眷恋我的勇者。”");
        translationBuilder.add("tooltip.medicine.plum_wine_shift", "");
        translationBuilder.add(MedicineItems.CREAM_CAKE, "小块奶油蛋糕");
        translationBuilder.add("tooltip.medicine.cream_cake", "平淡的美味。");
        translationBuilder.add("tooltip.medicine.cream_cake_shift", "");
        translationBuilder.add(MedicineItems.STRAWBERRY_CAKE, "小块草莓蛋糕");
        translationBuilder.add("tooltip.medicine.strawberry_cake", "你最喜欢的味道。");
        translationBuilder.add("tooltip.medicine.strawberry_cake_shift", "");
        translationBuilder.add(MedicineItems.ORANGE_CAKE, "小块香橙蛋糕");
        translationBuilder.add("tooltip.medicine.orange_cake", "他最喜欢的味道。");
        translationBuilder.add("tooltip.medicine.orange_cake_shift", "");
        translationBuilder.add(MedicineItems.BOX_OF_STRAWBERRIES, "一盒草莓");
        translationBuilder.add("tooltip.medicine.box_of_strawberries", "天赐的奖励。");
        translationBuilder.add("tooltip.medicine.box_of_strawberries_shift", "");
        translationBuilder.add(MedicineItems.NO_11_STREET_DRIP_COFFEE, "“11号街”挂耳咖啡包");
        translationBuilder.add("tooltip.medicine.no_11_street_drip_coffee", "“苦味之外还有些许淡淡的柑橘香味。”");
        translationBuilder.add("tooltip.medicine.no_11_street_drip_coffee_shift", "");
        translationBuilder.add(MedicineItems.BAGGED_GRAPE_COOKIES, "袋装葡萄味饼干");
        translationBuilder.add("tooltip.medicine.bagged_grape_cookies", "尝起来像你自己。");
        translationBuilder.add("tooltip.medicine.bagged_grape_cookies_shift", "");
        translationBuilder.add(MedicineItems.BAGGED_CREAM_COOKIES, "袋装奶油味饼干");
        translationBuilder.add("tooltip.medicine.bagged_cream_cookies", "尝起来像一维生物。");
        translationBuilder.add("tooltip.medicine.bagged_cream_cookies_shift", "");
        translationBuilder.add(MedicineItems.BAGGED_WATERMELON_COOKIES, "袋装西瓜味饼干");
        translationBuilder.add("tooltip.medicine.bagged_watermelon_cookies", "尝起来像99层过劳。");
        translationBuilder.add("tooltip.medicine.bagged_watermelon_cookies_shift", "");
        translationBuilder.add(MedicineItems.BAGGED_ORANGE_COOKIES, "袋装香橙味饼干");
        translationBuilder.add("tooltip.medicine.bagged_orange_cookies", "尝起来像铁锈和酒精。");
        translationBuilder.add("tooltip.medicine.bagged_orange_cookies_shift", "");
        translationBuilder.add(MedicineItems.BAGGED_PINEAPPLE_COOKIES, "袋装菠萝味饼干");
        translationBuilder.add("tooltip.medicine.bagged_pineapple_cookies", "尝起来有些烤过头了。");
        translationBuilder.add("tooltip.medicine.bagged_pineapple_cookies_shift", "");
        translationBuilder.add(MedicineItems.BAGGED_BLUEBERRY_COOKIES, "袋装蓝莓味饼干");
        translationBuilder.add("tooltip.medicine.bagged_blueberry_cookies", "尝起来像鱼鳃。");
        translationBuilder.add("tooltip.medicine.bagged_blueberry_cookies_shift", "");
        translationBuilder.add(MedicineItems.BAGGED_MINT_COOKIES, "袋装薄荷味饼干");
        translationBuilder.add("tooltip.medicine.bagged_mint_cookies", "尝起来像脑浆。");
        translationBuilder.add("tooltip.medicine.bagged_mint_cookies_shift", "");
        translationBuilder.add(MedicineItems.RAW_FISH_KING, "生鱼王");
        translationBuilder.add("tooltip.medicine.raw_fish_king", "它真的很大。");
        translationBuilder.add("tooltip.medicine.raw_fish_king_shift", "");
        translationBuilder.add(MedicineItems.COOKED_FISH_KING, "熟鱼王");
        translationBuilder.add("tooltip.medicine.cooked_fish_king", "比普通的熟鱼更香……");
        translationBuilder.add("tooltip.medicine.cooked_fish_king_shift", "");
        translationBuilder.add(MedicineItems.FROZEN_RAW_FISH_KING, "冻生鱼王");
        translationBuilder.add("tooltip.medicine.frozen_raw_fish_king", "除非我想要永久保存这东西，不然我应该是不需要这么做的。");
        translationBuilder.add("tooltip.medicine.frozen_raw_fish_king_shift", "");
        translationBuilder.add(MedicineItems.FROZEN_COOKED_FISH_KING, "冻熟鱼王");
        translationBuilder.add("tooltip.medicine.frozen_cooked_fish_king", "好吧，稍微有点糟蹋它了。");
        translationBuilder.add("tooltip.medicine.frozen_cooked_fish_king_shift", "");

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
        translationBuilder.add("tooltip.medicine.fiberglass_fishing_rod", "能经受较大的弯折，但十分重");
        translationBuilder.add("tooltip.medicine.fiberglass_fishing_rod_shift", "最多减少5秒的上钩等待时间");
        translationBuilder.add(MedicineItems.CARBON_FIBER_FISHING_ROD, "碳纤维钓竿");
        translationBuilder.add("tooltip.medicine.carbon_fiber_fishing_rod", "又轻又结实，十分优秀的钓鱼竿");
        translationBuilder.add("tooltip.medicine.carbon_fiber_fishing_rod_shift", "最多减少10秒的上钩等待时间");
        translationBuilder.add(MedicineItems.TITANIUM_ALLOY_FISHING_ROD, "钛合金钓竿");
        translationBuilder.add("tooltip.medicine.titanium_alloy_fishing_rod", "宣传语是“永不空军”");
        translationBuilder.add("tooltip.medicine.titanium_alloy_fishing_rod_shift", "最多减少15秒的上钩等待时间");
        translationBuilder.add(MedicineItems.SUPER_INVINCIBLE_FISHING_ROD, "超级无敌钓竿");
        translationBuilder.add("tooltip.medicine.super_invincible_fishing_rod", "你已经用钱征服了这个钓鱼游戏，现在去干点别的吧？");
        translationBuilder.add("tooltip.medicine.super_invincible_fishing_rod_shift", "最多减少25秒的上钩等待时间，可以实现自动钓鱼");
        translationBuilder.add(MedicineItems.VIAL_OF_STRANGE_LIQUID, "神秘液体瓶");
        translationBuilder.add("tooltip.medicine.vial_of_strange_liquid", "内容物看上去十分粘稠。");
        translationBuilder.add("tooltip.medicine.vial_of_strange_liquid_shift", "");
        translationBuilder.add(MedicineItems.GOLD_RING, "金戒指");
        translationBuilder.add(MedicineItems.GOLDEN_FISH, "黄金鱼");
        translationBuilder.add("tooltip.medicine.golden_fish", "开局就送1000抽，如果你抽到了这只鱼，那就说明你是真正的欧皇！");
        translationBuilder.add("tooltip.medicine.golden_fish_shift", "");

        // 创造模式物品栏
        translationBuilder.add("itemGroup.medicine_group", "药物");
        translationBuilder.add("itemGroup.food_group", "食物");
        translationBuilder.add("itemGroup.book_group", "书籍");
        translationBuilder.add("itemGroup.plant_group", "植物");
        translationBuilder.add("itemGroup.collectible_group", "收藏品");
        translationBuilder.add("itemGroup.special_collectible_group", "特殊藏品");
        translationBuilder.add("itemGroup.fishing_group", "钓鱼");

        // 状态效果
        translationBuilder.add("effect.medicine.over_stuffed", "饱腹");

        // 玩家属性
        translationBuilder.add("attribute.name.generic.mental_state","精神状态");
        translationBuilder.add("attribute.name.generic.severity","严重程度");
        translationBuilder.add("attribute.name.generic.work_ability","工作能力");
        translationBuilder.add("attribute.name.generic.physical_fitness","身体素质");
        translationBuilder.add("attribute.name.generic.writing_skill","写作技巧");
        translationBuilder.add("attribute.name.generic.money","所持金钱");
        translationBuilder.add("attribute.name.generic.medicine_price","药物价格");
        translationBuilder.add("attribute.name.generic.medicine_price_increase","药价涨幅");
        translationBuilder.add("attribute.name.generic.salary","本周工资");
        translationBuilder.add("attribute.name.generic.work_progress","工作进度");
        translationBuilder.add("attribute.name.generic.achieved_work_progress","已完成工作进度");
        translationBuilder.add("attribute.name.generic.popularity","平台人气");


        // 未完成提示
        translationBuilder.add("tooltip.medicine.unfinished", "如果你看到这条信息，说明这个部分可能还没做完");
    }
}
