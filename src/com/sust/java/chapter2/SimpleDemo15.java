package com.sust.java.chapter2;

/**
 * 演示比较运算符
 */
public class SimpleDemo15 {
    public static void main(String[] args) {

        System.out.println("5> 4.0 : " + (5 > 4.0));

        System.out.println("5 == 5.0: " + (5 == 5.0));

        System.out.println("true == false: " + (true == false));

        String str = "java";
        String str2 = "java";
        // 缓存提高效率
        System.out.println(str == str2); // true

        String str3 = new String("java");
        String str4 = new String("java");
        System.out.println(str3 == str4);// false

    }

}
