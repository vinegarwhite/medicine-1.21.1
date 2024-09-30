package com.medicine.hud;

import com.medicine.Medicine;
import com.medicine.attribute.MedicineEntityAttributes;
import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.Drawable;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.render.*;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.RotationAxis;
import org.joml.Matrix4f;

/**
 * 这个类用于渲染游戏界面上的数值
 */

public class MedicineHUDRender {

    public static void renderAttributes(DrawContext context) {

        MinecraftClient client = MinecraftClient.getInstance();
        PlayerEntity player = client.player;
        TextRenderer textRenderer = client.textRenderer;
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
            String mentalStateText = Text.translatable("attribute.name.generic.mental_state").getString() + " " + mentalState;
            String severityText = Text.translatable("attribute.name.generic.severity").getString() + " " + severity;
            String workAbilityText = Text.translatable("attribute.name.generic.work_ability").getString() + " " + workAbility;
            String physicalFitnessText = Text.translatable("attribute.name.generic.physical_fitness").getString() + " " + physicalFitness;
            String writingSkillText = Text.translatable("attribute.name.generic.writing_skill").getString() + " " + writingSkill;
            String moneyText = Text.translatable("attribute.name.generic.money").getString() + " " + money;
            String medicinePriceText = Text.translatable("attribute.name.generic.medicine_price").getString() + " " + medicinePrice;
            String medicinePriceIncreaseText = Text.translatable("attribute.name.generic.medicine_price_increase").getString() + " " + medicinePriceIncrease;
            String workProgressText = Text.translatable("attribute.name.generic.work_progress").getString() + " " + workProgress;
            String achievedWorkProgressText = Text.translatable("attribute.name.generic.achieved_work_progress").getString() + " " + achievedWorkProgress;
            String popularityText = Text.translatable("attribute.name.generic.popularity").getString() + " " + popularity;

            MatrixStack matrixStack = new MatrixStack();
            matrixStack.push();
            matrixStack.scale(1.5f, 1.5f, 1.0f);// 旋转 30 度
            matrixStack.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(30.0f));



//            textRenderer.draw(mentalStateText, 10, 10, 0xFFFFFF, true, matrixStack, );

            // Get the transformation matrix from the matrix stack, alongside the tessellator instance and a new buffer builder.
            Matrix4f transformationMatrix = context.getMatrices().peek().getPositionMatrix();
            Tessellator tessellator = Tessellator.getInstance();

            // Begin a triangle strip buffer using the POSITION_COLOR vertex format.
            BufferBuilder buffer = tessellator.begin(VertexFormat.DrawMode.TRIANGLE_STRIP, VertexFormats.POSITION_COLOR);

            // Write our vertices, Z doesn't really matter since it's on the HUD.
            buffer.vertex(transformationMatrix, 20, 20, 5).color(0xFF414141);
            buffer.vertex(transformationMatrix, 5, 40, 5).color(0xFF000000);
            buffer.vertex(transformationMatrix, 35, 40, 5).color(0xFF000000);
            buffer.vertex(transformationMatrix, 20, 60, 5).color(0xFF414141);

            // We'll get to this bit in the next section.
            RenderSystem.setShader(GameRenderer::getPositionColorProgram);
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

            // Draw the buffer onto the screen.
            BufferRenderer.drawWithGlobalProgram(buffer.end());


//            int textWidth = textRenderer.getWidth(mentalStateText);
//            context.drawText(textRenderer, mentalStateText, (width - textWidth) / 2, 5, 0xFFFFFF, true);
//
//            context.drawText(textRenderer, moneyText, 5, 60, 0xFFFFFF, true);
//            context.drawText(textRenderer, medicinePriceText, 5, 70, 0xFFFFFF, true);
//            context.drawText(textRenderer, medicinePriceIncreaseText, 5, 80, 0xFFFFFF, true);
//            context.drawText(textRenderer, workProgressText, 5, 90, 0xFFFFFF, true);
//            context.drawText(textRenderer, achievedWorkProgressText, 5, 100, 0xFFFFFF, true);
//            context.drawText(textRenderer, popularityText, 5, 110, 0xFFFFFF, true);
//
//            context.drawText(textRenderer, severityText, 5, 130, 0xFFFFFF, true);
//            context.drawText(textRenderer, workAbilityText, 5, 140, 0xFFFFFF, true);
//            context.drawText(textRenderer, physicalFitnessText, 5, 150, 0xFFFFFF, true);
//            context.drawText(textRenderer, writingSkillText, 5, 160, 0xFFFFFF, true);

            matrixStack.pop();
        }

    }



    public static void registerMedicineHUD() {
        HudRenderCallback.EVENT.register((context, tickDelta) -> renderAttributes(context));
        Medicine.LOGGER.info("Registering Medicine HUD");
    }
}
