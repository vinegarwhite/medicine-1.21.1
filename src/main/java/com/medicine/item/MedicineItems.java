package com.medicine.item;

import com.medicine.Medicine;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MedicineItems {

    public static final Item ALPHA_PILL = registerItems("alpha_pill", new Item(new Item.Settings()));









    // 注册物品时调用此函数 实现物品的注册
    public static Item registerItems(String id, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Medicine.MOD_ID, id), item);
    }

    public static void registerMedicineItems() {
        Medicine.LOGGER.info("Registering Medicine Items");
    }
}
