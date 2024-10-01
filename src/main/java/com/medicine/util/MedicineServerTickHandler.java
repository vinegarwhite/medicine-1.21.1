package com.medicine.util;

import com.medicine.Medicine;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.time.LocalDate;
import java.util.Date;

public class MedicineServerTickHandler {

    // 设置游戏内的初始时间 游戏里面5月1日为星期二 最近的就是2018年
    public static LocalDate getInitialDate(){
        return LocalDate.of(2018, 4, 30);
    }

    // 获取月份
    public static int getMonth(){
        return getInitialDate().plusDays(countDays()).getMonthValue();
    }
    // 获取日期
    public static int getDay(){
        return getInitialDate().plusDays(countDays()).getDayOfMonth();
    }
    // 获取过了几周
    public static long getWeeks() {
        return countDays() / 7 + 1;
    }
    // 获取星期几
    public static String getDayOfWeek() {
        String[] weekDays = {"", "一", "二", "三", "四", "五", "六", "日"};
        int dayOfWeek = getInitialDate().plusDays(countDays()).getDayOfWeek().getValue();
        return  weekDays[dayOfWeek];
    }
    // 游戏内一天的分钟数按比例转换为现实分钟数
    public static int countMinutes(){
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.world != null) {
            // 游戏一天内过去了多少ticks
            long gameTicks = (client.world.getTimeOfDay()) % 24000L ;
            // 游戏一天内游戏过了多少秒
            long gameSeconds = gameTicks / 20;
            // 游戏里面一天1200秒 现实里面一天86400秒 算出游戏里一秒对应现实几秒
            long seconds = gameSeconds * 84600 / 1200;
            // 把秒转为分钟
            return (int)seconds / 60 + 6 * 60;
        }
        return 0;
    }
    // 获取分钟
    public static int getMinutes(){
        return countMinutes() % 60;
    }
    // 获取小时
    public static int getHours() {
        return (countMinutes() / 60) % 24;
    }



    // 获取游戏内的总天数
    public static long countDays() {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.world != null) {
            return (client.world.getTimeOfDay()) / 24000 + 1;
        }
        return 0;
    }

}
