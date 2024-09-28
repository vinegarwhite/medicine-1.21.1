package com.medicine.mixin;

import net.minecraft.entity.projectile.FishingBobberEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

/**
 * 这个接口用于获取浮标类(FishingBobberEntity)中表示浮标受否上钩的变量(caughtFish)
 */
@Mixin(FishingBobberEntity.class)
public interface FishingBobberEntityAccessor {
    // 因为类中的caughtFish为私有 所以使用了Mixin
    @Accessor
    boolean getCaughtFish();
}
