package com.sust.java.chapter2;

/**
 * 演示通过String类来定义字符串
 * @author sunqiang
 */
public class SimpleDemo05 {
    public static void main(String[] args) {

        String str = "本宫不死，你永远是妃！";
        System.out.println(str);

        int len = str.length();
        System.out.println("字符串长度为：" + len);

        //证明了字符串下标从0开始
        char c = str.charAt(1);
        System.out.println("下标为一的字符为：" + c);

        int index = str.indexOf("不");
        System.out.println("不出现的位置为：" + index);

        String str1 = str.substring(1,3); //[1,3)
        System.out.println("返回的子串为：" + str1);
    }
}
