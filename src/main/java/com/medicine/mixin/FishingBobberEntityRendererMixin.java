package com.medicine.mixin;

import com.medicine.tags.MedicineItemTags;
import net.minecraft.client.render.entity.FishingBobberEntityRenderer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Arm;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

/**
 * 这个类是负责抛出鱼竿后鱼线的渲染的 如果不修改的话 鱼线都会从左边抛出 看起来会很违和
 * 主要也就是修改一下物品的判断 源码只判断了原版的鱼竿在哪只手 鱼线跟着拿着原版鱼竿的那只手
 * 所以要修改一下添加一下模组鱼竿的判断
 */

@Mixin(FishingBobberEntityRenderer.class)
public class FishingBobberEntityRendererMixin {

    @ModifyVariable(method = "getHandPos", at = @At("STORE"), ordinal = 0)
    private int modifyHandUsedForFishing(int i, PlayerEntity player) {
        // 判断玩家的主手是右手还是左手 i为1鱼线从右边抛出 i为-1鱼线从左边抛出
        i = player.getMainArm() == Arm.RIGHT ? 1 : -1;
        // 获取主手的物品
        ItemStack itemStack = player.getMainHandStack();

        // 主手里面为钓鱼竿 则钓鱼线从主手方向抛出
        if(itemStack.isOf(Items.FISHING_ROD) || itemStack.isIn(MedicineItemTags.MEDICINE_FISHING_ROD))
            return i;
        else
            return -i;
    }
}

