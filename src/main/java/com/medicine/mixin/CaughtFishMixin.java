package com.medicine.mixin;

import net.minecraft.entity.projectile.FishingBobberEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

// 这个接口用于获取浮标中记录的关于是否上钩的变量caughtFish
@Mixin(FishingBobberEntity.class)
public interface CaughtFishMixin {

    @Accessor("caughtFish")
    boolean getCaughtFish();
}
