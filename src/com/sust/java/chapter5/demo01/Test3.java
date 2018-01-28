package com.sust.java.chapter5.demo01;

/**
 * 演示基本类型和字符串直接的转换
 */
public class Test3 {
    public static void main(String[] args) {
        //把一个有效的字符串转换为int型
        String str = "80";
        int score = Integer.parseInt(str);
        System.out.println(score);

        //把一个有效的字符串转换为float型
        String str2 = "80.5";
        float score2 = Float.parseFloat(str2);
        System.out.println(score2);

        //把一个float转换为字符串
        String str3 = String.valueOf(80.6);
        System.out.println(str3);

        //把一个double转换为字符串
        String str4 = String.valueOf(80.88);
        System.out.println(str4);

        //把一个boolean 转换为字符串
        String str5 = String.valueOf(true);
        System.out.println(str5);

    }
}
