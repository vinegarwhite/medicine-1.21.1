package com.medicine.util;

import com.medicine.Medicine;
import com.medicine.item.MedicineItems;
import com.medicine.mixin.LootTableAccessor;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

/**
 * 这个类用于修改游戏中的战利品表 但是因为我其实没什么JAVA的基础 那么多眼花缭乱的类其实我看不太懂 然后这一块也没有找到相关的教学
 * 研究了好几天 最终还是硬着头皮用各种穷举勉强凑出了不会让游戏崩掉的代码 孩子是真的不会写代码 会写模组的大佬 教教
 */
public class MedicineLootTableModifiers {

    // 写明要修改的战利品表的路径 配合下面的if语句 便于选定需要修改的战利品表
    // 鱼类
    private static final Identifier FISHING_ID = Identifier.ofVanilla("gameplay/fishing/fish");
    // 垃圾
    private static final Identifier JUNK_ID = Identifier.ofVanilla("gameplay/fishing/junk");
    // 宝藏
    private static final Identifier TREASURE_ID = Identifier.ofVanilla("gameplay/fishing/treasure");

    public static void modifyLootTable() {

        // 修改钓鱼的战利品表 使得钓鱼可以钓出模组的物品
        // 总体思路是获取original所代表的原战利品表 获取里面的第一个战利品池
        // 然后加到自己写的新的战利品池中 在新的战利品池中加入新的内容然后写回去
        LootTableEvents.REPLACE.register(((key, original, source, registries) -> {
            if (FISHING_ID.equals(key.getValue())) {

                // 获取最初的战利品表(LootTable)中的战利品池数组(pools) pools是私有所以使用Mixin来获取
                List<LootPool> originalPools = ((LootTableAccessor) original).getPools();
                // getFirst用于获取战利品池数组中的第一个池子 因为原版只有一个池子 所以只需要获取第一个
                LootPool firstPool = originalPools.getFirst();
                // 创建一个新的战利品池用于后续替换替换老的战利品池
                LootPool.Builder poolBuilder = LootPool.builder();

                // 将老的战利品池中原有的条目添加到新的战利品池 firstPool.entries为LootPoolEntry类表示战利品池中的所有条目
                poolBuilder.with(firstPool.entries);
                // 在此基础上追加自己想要添加的物品 weight表示该物品的权重 可原版的权重进行修改
                poolBuilder.with(ItemEntry.builder(MedicineItems.RAW_FISH_KING).weight(2).build());

                // 用新的战利品池构建一个新的战利品表并返回 实现替换
                return LootTable.builder().pool(poolBuilder).build();
            } else if (TREASURE_ID.equals(key.getValue())) {

                List<LootPool> originalPools = ((LootTableAccessor) original).getPools();
                LootPool firstPool = originalPools.getFirst();
                LootPool.Builder poolBuilder = LootPool.builder();

                poolBuilder.with(firstPool.entries);
                poolBuilder.with(ItemEntry.builder(MedicineItems.VIAL_OF_STRANGE_LIQUID).build());
                poolBuilder.with(ItemEntry.builder(MedicineItems.GOLDEN_FISH).build());
                poolBuilder.with(ItemEntry.builder(MedicineItems.GOLD_RING).build());

                return LootTable.builder().pool(poolBuilder).build();
            }
            return null;
        }));



        /* 这种写法会让上钩的时候给两次物品 第一次物品来自原有的池子 第二次的物品来自模组追加的池子
        我觉得掉一次鱼给两份物品很怪 战利品池的写法与上面不同 更适合于钓鱼以外的战利品表 写在这里留作纪念
        LootTableEvents.MODIFY.register(((key, tableBuilder, source, registries) -> {
            if (FISHING_ID.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f))
                        .with(ItemEntry.builder(MedicineItems.A_WILD_SHEEP_ADVENTURE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f,5.0f)));
                tableBuilder.pool(poolBuilder);
            }
        }));
         */


    }

    public static void registerMedicineLootTable() {
        modifyLootTable();
        Medicine.LOGGER.info("Registering Medicine Loot Table");
    }

}
