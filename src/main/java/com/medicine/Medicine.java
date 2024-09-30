package com.medicine;

import com.medicine.attribute.MedicineEntityAttributes;
import com.medicine.hud.MedicineHUDRender;
import com.medicine.item.MedicineItemGroups;
import com.medicine.item.MedicineItems;
import com.medicine.loot_table.MedicineLootTableModifiers;
import com.medicine.status_effect.MedicineStatusEffects;
import com.medicine.tags.MedicineItemTags;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Medicine implements ModInitializer {
	public static final String MOD_ID = "medicine";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.


		// 注册物品(Item)
		MedicineItems.registerMedicineItems();
		// 注册物品(ItemTag)
		MedicineItemTags.registerMedicineTags();
		// 注册创造模式物品栏(ItemGroup)
		MedicineItemGroups.registerMedicineItemGroups();
		// 注册战利品表(LootTable)
		MedicineLootTableModifiers.registerMedicineLootTable();
		// 注册状态效果(StatusEffect)
		MedicineStatusEffects.registerMedicineStatusEffects();
		// 注册属性(Attribute)
		MedicineEntityAttributes.registerEntityAttribute();
		// 注册HUD
		MedicineHUDRender.registerMedicineHUD();


		LOGGER.info("Hello Fabric world!");
	}
}