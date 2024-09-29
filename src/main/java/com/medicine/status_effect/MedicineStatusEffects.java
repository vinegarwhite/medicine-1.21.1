package com.medicine.status_effect;

import com.medicine.Medicine;
import com.medicine.status_effect.effects.Overstuffed;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

/**
 * 用于注册状态效果的类
 */

public class MedicineStatusEffects {

    // 饱腹
    public static final RegistryEntry<StatusEffect> OVER_STUFFED = register(
            "over_stuffed", new Overstuffed(StatusEffectCategory.HARMFUL, 5797459)
                    // 移速减20%
                    .addAttributeModifier(
                            EntityAttributes.GENERIC_MOVEMENT_SPEED,
                            Identifier.of(Medicine.MOD_ID, "effect.over_stuffed"), -0.2F,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    // 攻速减20%
                    .addAttributeModifier(
                            EntityAttributes.GENERIC_ATTACK_SPEED,
                            Identifier.of(Medicine.MOD_ID, "effect.over_stuffed"), -0.2F,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    // 方块破坏速度减20%
                    .addAttributeModifier(
                            EntityAttributes.PLAYER_BLOCK_BREAK_SPEED,
                            Identifier.of(Medicine.MOD_ID, "effect.over_stuffed"), -0.2F,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    // 总伤害降低20%
                    .addAttributeModifier(
                            EntityAttributes.GENERIC_ATTACK_DAMAGE,
                            Identifier.of(Medicine.MOD_ID, "effect.over_stuffed"), -0.2F,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
    );

    private static RegistryEntry<StatusEffect> register(String id, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(Medicine.MOD_ID, id), statusEffect);
    }

    public static void registerMedicineStatusEffects() {
        Medicine.LOGGER.info("Registering Medicine Status Effects");
    }
}
