package com.medicine.mixin;

import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;

/**
 * 这个接口用于获取战利品表类(LootTable)中存储战利品池的数组(LootPool)
 */

@Mixin(LootTable.class)
public interface LootTableAccessor {
    // pools在类中为私有所以使用了Mixin
    @Accessor
    List<LootPool> getPools();
}
