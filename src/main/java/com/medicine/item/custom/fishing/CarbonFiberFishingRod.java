package com.medicine.item.custom.fishing;

import com.medicine.item.MedicineItems;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.component.ComponentMap;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.CustomModelDataComponent;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FishingBobberEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

import java.util.List;

// 碳纤维钓竿
public class CarbonFiberFishingRod extends MedicineFishingRodItem{
    public CarbonFiberFishingRod(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);

        if (user.fishHook != null) {
            if (!world.isClient) {
                int i = user.fishHook.use(itemStack);
                itemStack.damage(i, user, LivingEntity.getSlotForHand(hand));
            }

            world.playSound(
                    null,
                    user.getX(), user.getY(), user.getZ(),
                    SoundEvents.ENTITY_FISHING_BOBBER_RETRIEVE,
                    SoundCategory.NEUTRAL,
                    1.0F,
                    0.4F / (world.getRandom().nextFloat() * 0.4F + 0.8F)
            );

            // 修改custom_model_data的值为0 此时图标为未抛勾
            ComponentMap components = itemStack.getComponents();
            ComponentMap.Builder builder = ComponentMap.builder();;
            builder.addAll(components);
            builder.add(DataComponentTypes.CUSTOM_MODEL_DATA, new CustomModelDataComponent(0));
            itemStack.applyComponentsFrom(builder.build());

            user.emitGameEvent(GameEvent.ITEM_INTERACT_FINISH);
        } else {
            world.playSound(
                    null,
                    user.getX(), user.getY(), user.getZ(),
                    SoundEvents.ENTITY_FISHING_BOBBER_THROW,
                    SoundCategory.NEUTRAL,
                    0.5F,
                    0.4F / (world.getRandom().nextFloat() * 0.4F + 0.8F)
            );

            if (world instanceof ServerWorld serverWorld) {
                int j = (int) (EnchantmentHelper.getFishingTimeReduction(serverWorld, itemStack, user) * 20.0F);
                int k = EnchantmentHelper.getFishingLuckBonus(serverWorld, itemStack, user);
                // 修改j的值让钓鱼时间缩短
                j += 10 * 20;
                if(j >=29 * 20)
                    j = 29 * 20;
                world.spawnEntity(new FishingBobberEntity(user, world, k, j));
            }

            // 修改custom_model_data的值为1 此时图标为已抛勾
            ComponentMap components = itemStack.getComponents();
            ComponentMap.Builder builder = ComponentMap.builder();;
            builder.addAll(components);
            builder.add(DataComponentTypes.CUSTOM_MODEL_DATA, new CustomModelDataComponent(1));
            itemStack.applyComponentsFrom(builder.build());

            user.incrementStat(Stats.USED.getOrCreateStat(this));
            user.emitGameEvent(GameEvent.ITEM_INTERACT_START);
        }

        return TypedActionResult.success(itemStack, world.isClient());
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        PlayerEntity player = (PlayerEntity) entity;

        if(player.fishHook == null && !world.isClient) {

            // 用于应对玩家没有收杆就切换到别的物品的情况 切换为收杆状态
            for (int i = 0; i < player.getInventory().main.size(); i++) {
                ItemStack itemStack = player.getInventory().main.get(i);
                if (itemStack.isOf(MedicineItems.CARBON_FIBER_FISHING_ROD)) {
                    ComponentMap components = itemStack.getComponents();
                    ComponentMap.Builder builder = ComponentMap.builder();
                    builder.addAll(components);
                    builder.add(DataComponentTypes.CUSTOM_MODEL_DATA, new CustomModelDataComponent(0));
                    itemStack.applyComponentsFrom(builder.build());
                }
            }
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if(!Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.medicine.carbon_fiber_fishing_rod"));
        }else{
            tooltip.add(Text.translatable("tooltip.medicine.carbon_fiber_fishing_rod_shift"));
        }
    }
}
