package com.medicine.attribute;

import com.medicine.Medicine;
import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class MedicineEntityAttributes {

    // 精神状态
    public static final RegistryEntry<EntityAttribute> GENERIC_MENTAL_STATE = register(
            "generic.mental_state", new ClampedEntityAttribute("attribute.name.generic.mental_state", 80.0, -1000.0, 1000.0).setTracked(true)
    );
    // 严重程度
    public static final RegistryEntry<EntityAttribute> GENERIC_SEVERITY = register(
            "generic.severity", new ClampedEntityAttribute("attribute.name.generic.severity", 0.9, 0.0, 100.0).setTracked(true)
    );
    // 工作能力
    public static final RegistryEntry<EntityAttribute> GENERIC_WORK_ABILITY = register(
            "generic.work_ability", new ClampedEntityAttribute("attribute.name.generic.work_ability", 1.0, 0.0, 100.0).setTracked(true)
    );
    // 身体素质
    public static final RegistryEntry<EntityAttribute> GENERIC_PHYSICAL_FITNESS = register(
            "generic.physical_fitness", new ClampedEntityAttribute("attribute.name.generic.physical_fitness", 1.0, 0.0, 100.0).setTracked(true)
    );
    // 写作技巧
    public static final RegistryEntry<EntityAttribute> GENERIC_WRITING_SKILL = register(
            "generic.writing_skill", new ClampedEntityAttribute("attribute.name.generic.writing_skill", 1.0, 0.0, 100.0).setTracked(true)
    );
    // 金钱
    public static final RegistryEntry<EntityAttribute> GENERIC_MONEY = register(
            "generic.money", new ClampedEntityAttribute("attribute.name.generic.money", 2000.0, 0.0, 1e10).setTracked(true)
    );
    // 药价
    public static final RegistryEntry<EntityAttribute> GENERIC_MEDICINE_PRICE = register(
            "generic.medicine_price", new ClampedEntityAttribute("attribute.name.generic.medicine_price", 200.0, 0.0, 1e10).setTracked(true)
    );
    // 药价涨幅
    public static final RegistryEntry<EntityAttribute> GENERIC_MEDICINE_PRICE_INCREASE = register(
            "generic.medicine_price_increase", new ClampedEntityAttribute("attribute.name.generic.medicine_price_increase", 10.0, 0.0, 1e10).setTracked(true)
    );
    // 本周工资
    public static final RegistryEntry<EntityAttribute> GENERIC_SALARY = register(
            "generic.salary", new ClampedEntityAttribute("attribute.name.generic.salary", 2000.0, 0.0, 1e10).setTracked(true)
    );
    // 工作进度
    public static final RegistryEntry<EntityAttribute> GENERIC_WORK_PROGRESS = register(
            "generic.work_progress", new ClampedEntityAttribute("attribute.name.generic.work_progress", 7.5, 0.0, 1e10).setTracked(true)
    );
    // 已完成工作进度
    public static final RegistryEntry<EntityAttribute> GENERIC_ACHIEVED_WORK_PROGRESS = register(
            "generic.achieved_work_progress", new ClampedEntityAttribute("attribute.name.generic.achieved_work_progress", 0.0, 0.0, 1e10).setTracked(true)
    );
    // 平台人气
    public static final RegistryEntry<EntityAttribute> GENERIC_POPULARITY = register(
            "generic.popularity", new ClampedEntityAttribute("attribute.name.generic.popularity", 1000.0, 0.0, 40000.0).setTracked(true)
    );

    private static RegistryEntry<EntityAttribute> register(String id, EntityAttribute attribute) {
        return Registry.registerReference(Registries.ATTRIBUTE, Identifier.of(Medicine.MOD_ID,id), attribute);
    }

    public static void registerEntityAttribute(){
        Medicine.LOGGER.info("Registering Medicine Entity Attributes");
    }
}
