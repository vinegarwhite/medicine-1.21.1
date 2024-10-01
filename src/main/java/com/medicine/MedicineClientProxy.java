package com.medicine;

import com.medicine.hud.MedicineHUDRender;
import com.medicine.predicate.MedicineModelPredicate;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

/**
 * 区别于Medicine类 这里面的的代码只有在客户端才会调用
 */

@Environment(EnvType.CLIENT)
public class MedicineClientProxy implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // 注册谓词Predicate
        MedicineModelPredicate.registerMedicineModelPredicate();
        // 注册HUD
        MedicineHUDRender.registerMedicineHUD();
    }
}
