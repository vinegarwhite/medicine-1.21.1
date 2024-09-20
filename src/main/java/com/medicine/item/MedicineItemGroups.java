package com.medicine.item;

import com.medicine.Medicine;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MedicineItemGroups {

    // 注册创造模式物品栏

    // 用于存放药物的创造模式物品栏
    public static final ItemGroup MEDICINE_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Medicine.MOD_ID, "medicine_group"), ItemGroup.create(null, 1)
                    .displayName(Text.translatable("itemGroup.medicine_group"))
                    .icon(() -> new ItemStack(MedicineItems.ALPHA_PILL))
                    .entries((displayContext, entries) -> {
                        entries.add(MedicineItems.ALPHA_PILL);






                    }).build());



    public static void registerMedicineItemGroups() {
        Medicine.LOGGER.info("Registering Medicine Item Groups");
    }
}
