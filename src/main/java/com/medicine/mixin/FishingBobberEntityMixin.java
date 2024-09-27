package com.medicine.mixin;

import com.medicine.item.MedicineItems;
import com.medicine.item.custom.fishing.MedicineFishingRodItem;
import com.medicine.tags.MedicineItemTags;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FishingBobberEntity;
import net.minecraft.item.FishingRodItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * 使用Mixin修改原版的浮标实体的判断逻辑
 * 原版的浮标在探测到手上没有拿着原版的钓鱼竿的时候会移除自身
 * 所以只是在注册新的鱼竿的时候用MC官方的FishingRodItem是不够的
 * 浮标实体检测到没有拿着原版鱼竿就会清除自身
 * 所以需要重写判断使其识别模组添加的钓鱼竿
 */

@Mixin(FishingBobberEntity.class)
public class FishingBobberEntityMixin {

    @Shadow @Final private static TrackedData<Boolean> CAUGHT_FISH;

    // bl表示主手是否拿着鱼竿 为其添加模组鱼竿的判断
    // 目前还是以一个一个物品的方式判断的 等以后写了添加Tag的代码之后记得修改一下
    @ModifyVariable(method = "removeIfInvalid", at = @At("STORE"), ordinal = 0)
    private boolean modifyMainHandFishingRodCheck(boolean bl, PlayerEntity player) {
        ItemStack itemStack = player.getMainHandStack();
        return itemStack.isOf(Items.FISHING_ROD) || itemStack.isIn(MedicineItemTags.MEDICINE_FISHING_ROD);
    }

    // bl2表示副手是否拿着鱼竿
    @ModifyVariable(method = "removeIfInvalid", at = @At("STORE"), ordinal = 1)
    private boolean modifyOffHandFishingRodCheck(boolean bl2, PlayerEntity player) {
        ItemStack itemStack = player.getOffHandStack();
        return itemStack.isOf(Items.FISHING_ROD) ||
                itemStack.isOf(MedicineItems.FIBERGLASS_FISHING_ROD) ||
                itemStack.isOf(MedicineItems.CARBON_FIBER_FISHING_ROD) ||
                itemStack.isOf(MedicineItems.TITANIUM_ALLOY_FISHING_ROD) ||
                itemStack.isOf(MedicineItems.SUPER_INVINCIBLE_FISHING_ROD);
    }
}

