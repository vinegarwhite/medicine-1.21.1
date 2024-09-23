package com.medicine.item.custom.fishing;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FishingBobberEntity;
import net.minecraft.item.FishingRodItem;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class MedicineFishingRodItem extends FishingRodItem {
    public MedicineFishingRodItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        // 获取玩家手中的物品（钓鱼竿）
        ItemStack itemStack = user.getStackInHand(hand);

        // 检查玩家是否已经抛出了钓鱼浮标
        if (user.fishHook != null) {  // 如果玩家已经有一个浮标存在
            if (!world.isClient) {  // 仅在服务端处理
                // 调用 fishHook 的 use 方法收回浮标，并获取浮标使用时对钓竿的损耗值
                int i = user.fishHook.use(itemStack);
                // 根据损耗值对钓竿进行耐久度的削减，处理削减后的物品状态
                itemStack.damage(i, user, LivingEntity.getSlotForHand(hand));
            }

            // 播放收回浮标时的音效
            world.playSound(
                    null,  // 声音播放的目标（null 表示对所有玩家播放）
                    user.getX(), user.getY(), user.getZ(),  // 玩家当前的坐标
                    SoundEvents.ENTITY_FISHING_BOBBER_RETRIEVE,  // 音效：收回浮标
                    SoundCategory.NEUTRAL,  // 音效类别
                    1.0F,  // 音量
                    0.4F / (world.getRandom().nextFloat() * 0.4F + 0.8F)  // 随机音调变化
            );

            // 向游戏事件系统发送物品使用结束的事件（用于游戏中其他互动）
            user.emitGameEvent(GameEvent.ITEM_INTERACT_FINISH);

        } else {  // 玩家没有抛出浮标，则准备抛出浮标
            // 播放抛出浮标时的音效
            world.playSound(
                    null,  // 声音播放的目标（null 表示对所有玩家播放）
                    user.getX(), user.getY(), user.getZ(),  // 玩家当前的坐标
                    SoundEvents.ENTITY_FISHING_BOBBER_THROW,  // 音效：抛出浮标
                    SoundCategory.NEUTRAL,  // 音效类别
                    0.5F,  // 音量
                    0.4F / (world.getRandom().nextFloat() * 0.4F + 0.8F)  // 随机音调变化
            );

            // 仅在服务端生成浮标实体
            if (world instanceof ServerWorld serverWorld) {
                // 计算附魔“钓鱼时间减少”的效果值，返回减少的时间量
                int j = (int)(EnchantmentHelper.getFishingTimeReduction(serverWorld, itemStack, user) * 20.0F);
                // 获取附魔“幸运”的效果，影响钓到的物品种类
                int k = EnchantmentHelper.getFishingLuckBonus(serverWorld, itemStack, user);
                // 生成并抛出浮标实体，传入钓鱼幸运值和钓鱼时间减少的值
                world.spawnEntity(new FishingBobberEntity(user, world, k, j));
            }

            // 更新玩家的钓鱼竿使用统计数据
            user.incrementStat(Stats.USED.getOrCreateStat(this));

            // 向游戏事件系统发送物品使用开始的事件
            user.emitGameEvent(GameEvent.ITEM_INTERACT_START);
        }

        // 返回结果，表示钓鱼竿已被成功使用
        return TypedActionResult.success(itemStack, world.isClient());
    }
}
