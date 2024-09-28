package com.medicine.item.custom.fishing;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.enchantment.EnchantmentHelper;
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

// 钛合金钓竿
public class TitaniumAlloyFishingRod extends MedicineFishingRodItem{
    public TitaniumAlloyFishingRod(Settings settings) {
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
                j += 15 * 20;
                if(j >=29 * 20)
                    j = 29 * 20;
                world.spawnEntity(new FishingBobberEntity(user, world, k, j));
            }

            user.incrementStat(Stats.USED.getOrCreateStat(this));
            user.emitGameEvent(GameEvent.ITEM_INTERACT_START);
        }

        return TypedActionResult.success(itemStack, world.isClient());
    }


    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if(!Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.medicine.titanium_alloy_fishing_rod"));
        }else{
            tooltip.add(Text.translatable("tooltip.medicine.titanium_alloy_fishing_rod_shift"));
        }
    }
}
