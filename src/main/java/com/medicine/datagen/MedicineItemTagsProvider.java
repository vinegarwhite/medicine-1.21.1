package com.medicine.datagen;

import com.medicine.item.MedicineItems;
import com.medicine.tags.MedicineItemTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class MedicineItemTagsProvider extends FabricTagProvider.ItemTagProvider {
    public MedicineItemTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(MedicineItemTags.MEDICINE_FISHING_ROD)
                .add(MedicineItems.FIBERGLASS_FISHING_ROD)
                .add(MedicineItems.CARBON_FIBER_FISHING_ROD)
                .add(MedicineItems.TITANIUM_ALLOY_FISHING_ROD)
                .add(MedicineItems.SUPER_INVINCIBLE_FISHING_ROD);
    }
}
