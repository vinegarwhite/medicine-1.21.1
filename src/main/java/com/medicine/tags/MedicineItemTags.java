package com.medicine.tags;

import com.medicine.Medicine;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class MedicineItemTags {
    public static final TagKey<Item> MEDICINE_FISHING_ROD = of("medicine_fishing_rod");


    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(Medicine.MOD_ID, id));
    }

    public static void registerMedicineTags(){
        Medicine.LOGGER.info("Registering Medicine Tags");
    }
}
