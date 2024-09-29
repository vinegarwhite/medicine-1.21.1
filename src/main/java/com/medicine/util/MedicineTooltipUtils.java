package com.medicine.util;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.Item;
import net.minecraft.text.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * 为了方便批量添加tooltip而封装的类
 * mc直接添加一串很长的tooltip不会自动换行
 * 所以提取了translationKey中的文本并切片
 * 依次添加到tooltip 使得描述不会占满屏幕
 */

public class MedicineTooltipUtils {
    // 传入物品以及对应的tooltip即可自动获取对应的translationKey自动添加tooltip 写的弯弯绕的是为了实现自动换行
    public static void setToolTips(Item item, List<Text> tooltip) {
        // 获取物品的translationKey以的得到对应的tooltip的translationKey (substring用于删去key开头的item.medicine.)
        String translationKey = item.getTranslationKey().substring(14);

        // 拼接得到物品的描述信息对应的translationKey
        String tooltipKey = "tooltip.medicine." + translationKey;
        // 获取描述信息的具体内容
        String tooltipText = Text.translatable(tooltipKey).getString();

        // 物品的数值信息对应的translationKey
        String tooltipKeyShift = "tooltip.medicine." + translationKey + "_shift";
        // 获取数值信息的具体内容
        String tooltipTextShift = Text.translatable(tooltipKeyShift).getString();

        if (Screen.hasShiftDown()) {
            // 按下shift显示数值信息 把字符串切开 一行一行添加进去以实现自动换行
            ArrayList<String> tooltipTextShiftList = splitter(tooltipTextShift, 20);
            for (String text : tooltipTextShiftList)
                tooltip.add(Text.of("§7" + text + "§r"));
        } else {
            // 未按下按键则显示物品描述信息
            ArrayList<String> tooltipTextList = splitter(tooltipText, 20);
            for (String text : tooltipTextList)
                tooltip.add(Text.of("§7" + text + "§r"));
        }
    }

    // 将String 按照一定长度分割后放到ArrayList
    private static ArrayList<String> splitter(String str, int len){
        ArrayList<String> result = new ArrayList<>();

        while (!str.isEmpty()) {
            if (str.length() < len) {
                result.add(str);
                break;
            } else {
                result.add(str.substring(0, len));
                str = str.substring(len);
            }
        }
        return result;
    }
}
