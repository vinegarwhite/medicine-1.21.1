package com.medicine.datagen;

import com.medicine.item.MedicineItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;


// 此类用于进行中文翻译的数据生成
public class MedicineENUSLanProvider_zh_cn extends FabricLanguageProvider {

    public MedicineENUSLanProvider_zh_cn(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {



        // 药物
        translationBuilder.add(MedicineItems.ALPHA_PILL, "α药");

        // 创造模式物品栏
        translationBuilder.add("itemGroup.medicine_group", "药物");
    }
}
