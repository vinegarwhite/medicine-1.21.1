package com.medicine.hud;

import com.medicine.Medicine;
import com.medicine.attribute.MedicineEntityAttributes;
import com.medicine.util.MedicineServerTickHandler;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.OrderedText;
import net.minecraft.text.Text;

/**
 * 这个类用于渲染游戏界面上的数值
 */

public class MedicineHUDRender {

    public static void renderAttributes(DrawContext context) {

        MinecraftClient client = MinecraftClient.getInstance();
        PlayerEntity player = client.player;
        TextRenderer textRenderer = client.textRenderer;
        // 获取缩放后的长宽
        int width = client.getWindow().getScaledWidth();
        int height = client.getWindow().getScaledHeight();

        if (player != null) {

            // 获取玩家属性的数值
            double mentalState = player.getAttributeValue(MedicineEntityAttributes.GENERIC_MENTAL_STATE);
            double severity = player.getAttributeValue(MedicineEntityAttributes.GENERIC_SEVERITY);
            double workAbility = player.getAttributeValue(MedicineEntityAttributes.GENERIC_WORK_ABILITY);
            double physicalFitness = player.getAttributeValue(MedicineEntityAttributes.GENERIC_PHYSICAL_FITNESS);
            double writingSkill = player.getAttributeValue(MedicineEntityAttributes.GENERIC_WRITING_SKILL);
            double money = player.getAttributeValue(MedicineEntityAttributes.GENERIC_MONEY);
            double medicinePrice = player.getAttributeValue(MedicineEntityAttributes.GENERIC_MEDICINE_PRICE);
            double medicinePriceIncrease = player.getAttributeValue(MedicineEntityAttributes.GENERIC_MEDICINE_PRICE_INCREASE);
            double salary = player.getAttributeValue(MedicineEntityAttributes.GENERIC_SALARY);
            double workProgress = player.getAttributeValue(MedicineEntityAttributes.GENERIC_WORK_PROGRESS);
            double achievedWorkProgress = player.getAttributeValue(MedicineEntityAttributes.GENERIC_ACHIEVED_WORK_PROGRESS);
            double popularity = player.getAttributeValue(MedicineEntityAttributes.GENERIC_POPULARITY);

            // 处理文本
            String mentalStateText = Text.translatable("attribute.name.generic.mental_state").getString();

            String severityText = Text.translatable("attribute.name.generic.severity").getString() + " ";
            String workAbilityText = Text.translatable("attribute.name.generic.work_ability").getString() + " ";
            String physicalFitnessText = Text.translatable("attribute.name.generic.physical_fitness").getString() + " ";
            String writingSkillText = Text.translatable("attribute.name.generic.writing_skill").getString() + " ";
            String moneyText = Text.translatable("attribute.name.generic.money").getString() + " ";
            String medicinePriceText = Text.translatable("attribute.name.generic.medicine_price").getString() + " ";
            String salaryText = Text.translatable("attribute.name.generic.salary").getString() + " ";
            String workProgressText = Text.translatable("attribute.name.generic.work_progress").getString() + " ";
            String popularityText = Text.translatable("attribute.name.generic.popularity").getString() + " ";

            int month = MedicineServerTickHandler.getMonth();
            int day = MedicineServerTickHandler.getDay();
            long weeks = MedicineServerTickHandler.getWeeks();
            String dayOfWeek = MedicineServerTickHandler.getDayOfWeek();
            int hours = MedicineServerTickHandler.getHours();
            int minutes = MedicineServerTickHandler.getMinutes();
            context.drawTextWithShadow(textRenderer, "%d月%d日 第%d周".formatted(month, day, weeks), 5, 5, 0xFFFFFF);
            context.drawTextWithShadow(textRenderer, "星期%s %d:%02d".formatted(dayOfWeek, hours, minutes), 5, 15, 0xFFFFFF);

            // 精神状态
            context.drawCenteredTextWithShadow(textRenderer, mentalStateText, width / 2, 5, 0xFFFFFF);
            context.drawCenteredTextWithShadow(textRenderer, String.valueOf(mentalState), width / 2, 15, 0xFFFFFF);
            // 所持金钱
            context.drawTextWithShadow(textRenderer, moneyText, 5, height / 2 - 50, 0xFFFFFF);
            context.drawTextWithShadow(textRenderer, String.valueOf(money), 5 + textRenderer.getWidth(moneyText), height / 2 - 50, 0xFFFFFF);
            // 药物价格
            context.drawTextWithShadow(textRenderer, medicinePriceText, 5, height / 2 - 40, 0xFFFFFF);
            context.drawTextWithShadow(textRenderer, String.valueOf(medicinePrice), 5 + textRenderer.getWidth(medicinePriceText), height / 2 - 40, 0xFFFFFF);
            // 本周工资
            context.drawTextWithShadow(textRenderer, salaryText, 5, height / 2 - 30, 0xFFFFFF);
            context.drawTextWithShadow(textRenderer, String.valueOf(salary), 5 + textRenderer.getWidth(salaryText), height / 2 - 30, 0xFFFFFF);
            // 工作进度
            context.drawTextWithShadow(textRenderer, workProgressText, 5, height / 2 - 20, 0xFFFFFF);
            context.drawTextWithShadow(textRenderer, achievedWorkProgress + "/" + workProgress, 5 + textRenderer.getWidth(workProgressText), height / 2 - 20, 0xFFFFFF);
            // 平台人气
            context.drawTextWithShadow(textRenderer, popularityText, 5, height / 2 - 10, 0xFFFFFF);
            context.drawTextWithShadow(textRenderer, String.valueOf(popularity), 5 + textRenderer.getWidth(popularityText), height / 2 - 10, 0xFFFFFF);
            // 严重程度
            context.drawTextWithShadow(textRenderer, severityText, 5, height / 2 + 10, 0xFFFFFF);
            context.drawTextWithShadow(textRenderer, String.valueOf(severity), 5 + textRenderer.getWidth(severityText), height / 2 + 10, 0xFFFFFF);
            // 工作能力
            context.drawTextWithShadow(textRenderer, workAbilityText, 5, height / 2 + 20, 0xFFFFFF);
            context.drawTextWithShadow(textRenderer, String.valueOf(workAbility), 5 + textRenderer.getWidth(workAbilityText), height / 2 + 20, 0xFFFFFF);
            // 身体素质
            context.drawTextWithShadow(textRenderer, physicalFitnessText, 5, height / 2 + 30, 0xFFFFFF);
            context.drawTextWithShadow(textRenderer, String.valueOf(physicalFitness), 5 + textRenderer.getWidth(physicalFitnessText), height / 2 + 30, 0xFFFFFF);
            // 写作技巧
            context.drawTextWithShadow(textRenderer, writingSkillText, 5, height / 2 + 40, 0xFFFFFF);
            context.drawTextWithShadow(textRenderer, String.valueOf(writingSkill), 5 + textRenderer.getWidth(writingSkillText), height / 2 + 40, 0xFFFFFF);
        }

    }

    public static void registerMedicineHUD() {
        HudRenderCallback.EVENT.register((context, tickDelta) -> renderAttributes(context));
        Medicine.LOGGER.info("Registering Medicine HUD");
    }
}
