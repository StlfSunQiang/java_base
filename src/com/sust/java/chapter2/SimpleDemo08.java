package com.sust.java.chapter2;

/**
 * 演示自动类型转换
 * @author sunqiang
 */
public class SimpleDemo08 {
    public static void main(String[] args) {
        int i = 6;
        float f = i; //自动转换
        System.out.println(f); //6.0

        byte b = 9;
        double d = b; //自动转换
        System.out.println(d); //9.0

        //自动提升为字符串
        String s = f + d + "";
        System.out.println(s);
    }
}
