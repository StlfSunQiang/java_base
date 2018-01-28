package com.sust.java.chapter2;

/**
 * 演示三目运算符
 */
public class SimpleDemo17 {
    public static void main(String[] args) {
        boolean flag = 5 > 3 ? true : false;
        System.out.println(flag);

        String str = 5 < 3 ? "5 > 3" : "5 < 3";
        System.out.println(str);
    }
}
