package com.medicine.item.custom.fishing;

import com.medicine.item.MedicineItems;
import com.medicine.mixin.CaughtFishMixin;
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

/**
 * 超级无敌钓竿
 */
public class SuperInvincibleFishingRod extends MedicineFishingRodItem{
    public SuperInvincibleFishingRod(Settings settings) {
        super(settings);
    }

    // 用于判断是否继续钓鱼
    boolean castAgain = false;
    // 用于记录上次使用的时刻 与游戏时刻进行比较使得自动钓鱼抛竿与收杆不会那么快
    long lastActionTime = -100;

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);

        // 使用鱼竿时已经抛竿 此时操作为右击收杆
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

            // 控制钓竿图标为收起状态
            ComponentMap components = itemStack.getComponents();
            ComponentMap.Builder builder = ComponentMap.builder();;
            builder.addAll(components);
            builder.add(DataComponentTypes.CUSTOM_MODEL_DATA, new CustomModelDataComponent(0));
            itemStack.applyComponentsFrom(builder.build());

            user.emitGameEvent(GameEvent.ITEM_INTERACT_FINISH);
        }
        // 使用鱼竿时未抛竿 此时操作为右击抛竿
        else {
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
                j += 25 * 20;
                if(j >=29 * 20)
                    j = 29 * 20;
                world.spawnEntity(new FishingBobberEntity(user, world, k, j));

            }

            // 停用再次抛竿
            castAgain = false;

            // 控制钓竿图标为抛出状态
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

    // 当该物品存在与物品栏时每tick执行一次 用于实现自动钓鱼
    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);
        PlayerEntity player = (PlayerEntity) entity;
        Hand hand = player.getActiveHand();

        // 每0.5秒判断一次浮标存在且钓到鱼的情况
        if(player.fishHook != null && world.getTime() >= lastActionTime + 10 && ((CaughtFishMixin) player.fishHook).getCaughtFish()) {
            // 检查浮标是否钓到鱼 如果钓到则调用use方法进行收杆
            if (!world.isClient) {
                this.use(world, player, hand);
                castAgain = true;
                lastActionTime = world.getTime();
            }
        }
        // 浮标不存在则尝试判断是否需要再次抛竿
        if(player.fishHook == null && !world.isClient){

            // 用于应对玩家没有收杆就切换到别的物品的情况 切换为收杆状态
            for (int i = 0; i < player.getInventory().main.size(); i++) {
                ItemStack itemStack = player.getInventory().main.get(i);
                if (itemStack.isOf(MedicineItems.SUPER_INVINCIBLE_FISHING_ROD)) {
                    ComponentMap components = itemStack.getComponents();
                    ComponentMap.Builder builder = ComponentMap.builder();
                    builder.addAll(components);
                    builder.add(DataComponentTypes.CUSTOM_MODEL_DATA, new CustomModelDataComponent(0));
                    itemStack.applyComponentsFrom(builder.build());
                }
            }

            if (castAgain && world.getTime() >= lastActionTime + 10){
                this.use(world, player, hand);
                castAgain = false;
                lastActionTime = world.getTime();
            }
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if(!Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.medicine.super_invincible_fishing_rod"));
        }else{
            tooltip.add(Text.translatable("tooltip.medicine.super_invincible_fishing_rod_shift"));
        }
    }
}
