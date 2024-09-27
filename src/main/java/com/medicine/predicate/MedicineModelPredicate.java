package com.medicine.predicate;

import com.medicine.Medicine;
import com.medicine.item.MedicineItems;
import com.medicine.tags.MedicineItemTags;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.FishingRodItem;
import net.minecraft.util.Identifier;

public class MedicineModelPredicate {

    static {
        ModelPredicateProviderRegistry.register(MedicineItems.FIBERGLASS_FISHING_ROD,Identifier.of(Medicine.MOD_ID, "fiberglass_fishing_rod_cast"),
                (stack, world, entity, seed) -> {
                    if (entity == null) {
                        return 0.0F;
                    } else {
                        boolean bl = entity.getMainHandStack() == stack;
                        boolean bl2 = entity.getOffHandStack() == stack;
                        if (entity.getMainHandStack().getItem() instanceof FishingRodItem) {
                            bl2 = false;
                        }

                        return (bl || bl2) && entity instanceof PlayerEntity && ((PlayerEntity) entity).fishHook != null ? 1.0F : 0.0F;
                    }
                });
        ModelPredicateProviderRegistry.register(MedicineItems.CARBON_FIBER_FISHING_ROD,Identifier.of(Medicine.MOD_ID, "carbon_fiber_fishing_rod_cast"),
                (stack, world, entity, seed) -> {
                    if (entity == null) {
                        return 0.0F;
                    } else {
                        boolean bl = entity.getMainHandStack() == stack;
                        boolean bl2 = entity.getOffHandStack() == stack;
                        if (entity.getMainHandStack().getItem() instanceof FishingRodItem) {
                            bl2 = false;
                        }

                        return (bl || bl2) && entity instanceof PlayerEntity && ((PlayerEntity) entity).fishHook != null ? 1.0F : 0.0F;
                    }
                });
        ModelPredicateProviderRegistry.register(MedicineItems.TITANIUM_ALLOY_FISHING_ROD,Identifier.of(Medicine.MOD_ID, "titanium_alloy_fishing_rod_cast"),
                (stack, world, entity, seed) -> {
                    if (entity == null) {
                        return 0.0F;
                    } else {
                        boolean bl = entity.getMainHandStack() == stack;
                        boolean bl2 = entity.getOffHandStack() == stack;
                        if (entity.getMainHandStack().getItem() instanceof FishingRodItem) {
                            bl2 = false;
                        }

                        return (bl || bl2) && entity instanceof PlayerEntity && ((PlayerEntity) entity).fishHook != null ? 1.0F : 0.0F;
                    }
                });
        ModelPredicateProviderRegistry.register(MedicineItems.SUPER_INVINCIBLE_FISHING_ROD,Identifier.of(Medicine.MOD_ID, "super_invincible_fishing_rod_cast"),
                (stack, world, entity, seed) -> {
                    if (entity == null) {
                        return 0.0F;
                    } else {
                        boolean bl = entity.getMainHandStack() == stack;
                        boolean bl2 = entity.getOffHandStack() == stack;
                        if (entity.getMainHandStack().getItem() instanceof FishingRodItem) {
                            bl2 = false;
                        }

                        return (bl || bl2) && entity instanceof PlayerEntity && ((PlayerEntity) entity).fishHook != null ? 1.0F : 0.0F;
                    }
                });
    }

    public static void registerMedicineModelPredicate(){

        Medicine.LOGGER.info("Registering Medicine Model Predicate");
    }
}
