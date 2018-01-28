package com.sust.java.chapter2;

/**
 * 演示逻辑运算符
 */
public class SimpleDemo16 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = null;
        String str3 = "ab";

        //str2.length() 发生空指针异常
        boolean flag = str1.length() < 0 && str2.length() < 0;
        System.out.println(flag);


        //非短路与(&)前后都会判断表达式的值，前后同时为真时表达式的值才为真。
        boolean flag1 = str1.length() > 0 & str3.length() < 0;
        System.out.println(flag1);

    }
}
