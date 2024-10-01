package com.medicine.mixin;

import com.medicine.attribute.MedicineEntityAttributes;
import com.medicine.status_effect.MedicineStatusEffects;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * 这个类使用Mixin修改玩家类 在其中添加模组自定义的属性
 */

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin {

    // 为玩家添加属性
    @Inject(method = "createPlayerAttributes", at = @At("RETURN"), cancellable = true)
    private static void modifyPlayerAttributes(CallbackInfoReturnable<DefaultAttributeContainer.Builder> cir) {
        // 获取返回的属性构建器
        DefaultAttributeContainer.Builder builder = cir.getReturnValue();

        // 精神状态
        builder.add(MedicineEntityAttributes.GENERIC_MENTAL_STATE, 80.0);
        // 严重程度
        builder.add(MedicineEntityAttributes.GENERIC_SEVERITY, 0.9);
        // 工作能力
        builder.add(MedicineEntityAttributes.GENERIC_WORK_ABILITY, 1.0);
        // 身体素质
        builder.add(MedicineEntityAttributes.GENERIC_PHYSICAL_FITNESS, 1.0);
        // 写作技巧
        builder.add(MedicineEntityAttributes.GENERIC_WRITING_SKILL, 1.0);
        // 金钱
        builder.add(MedicineEntityAttributes.GENERIC_MONEY, 2000.0);
        // 药价
        builder.add(MedicineEntityAttributes.GENERIC_MEDICINE_PRICE, 200.0);
        // 药价涨幅
        builder.add(MedicineEntityAttributes.GENERIC_MEDICINE_PRICE_INCREASE, 10.0);
        // 本周工资
        builder.add(MedicineEntityAttributes.GENERIC_SALARY, 2000.0);
        // 工作进度
        builder.add(MedicineEntityAttributes.GENERIC_WORK_PROGRESS, 7.5);
        // 已完成的工作进度
        builder.add(MedicineEntityAttributes.GENERIC_ACHIEVED_WORK_PROGRESS, 0.0);
        // 平台人气
        builder.add(MedicineEntityAttributes.GENERIC_POPULARITY, 1000.0);

        cir.setReturnValue(builder);
    }

    // 饱食度满了后获得饱腹
    @Inject(method = "tick", at = @At("RETURN"))
    private void isOverStuffed(CallbackInfo ci) {
        PlayerEntity player = (PlayerEntity) (Object) this;

        int foodLevel = player.getHungerManager().getFoodLevel();
        if(foodLevel >= 20 && !player.isCreative() && !player.isSpectator()){
            player.addStatusEffect(new StatusEffectInstance(
                    MedicineStatusEffects.OVER_STUFFED, -1, 0, false, false, false));
        }
    }
}

