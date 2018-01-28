package com.sust.java.chapter2;

/**
 * 演示赋值运算符
 */
public class SimpleDemo14 {
    public static void main(String[] args) {

        String str = "java";

        String str2 = str;

        System.out.println(str2);

        str2 = "jsp";
        System.out.println(str + "---" + str2);

    }
}
