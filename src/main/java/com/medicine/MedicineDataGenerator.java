package com.medicine;

import com.medicine.datagen.MedicineENUSLanProvider_zh_cn;
import com.medicine.datagen.MedicineItemTagsProvider;
import com.medicine.datagen.MedicineModelsProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class MedicineDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(MedicineENUSLanProvider_zh_cn::new);
		pack.addProvider(MedicineModelsProvider::new);
		pack.addProvider(MedicineItemTagsProvider::new);
	}
}
