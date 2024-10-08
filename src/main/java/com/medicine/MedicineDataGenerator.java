package com.medicine;

import com.medicine.datagen.MedicineItemTagsProvider;
import com.medicine.datagen.MedicineModelsProvider;
import com.medicine.datagen.MedicineZHCNLanProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;


public class MedicineDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(MedicineZHCNLanProvider::new);
		pack.addProvider(MedicineModelsProvider::new);
		pack.addProvider(MedicineItemTagsProvider::new);
	}
}
