package com.sust.java.chapter2;

/**
 * 演示求余运算符
 */
public class SimpleDemo11 {
    public static void main(String[] args) {
        int num3 = 10;
        int num4 = 3;
        System.out.println("10 % 3 =" + num3 % num4);

        double num1 = 5.2;
        double num2 = 3.1;
        System.out.println("5.2 % 3.1 =" + num1 % num2);
        //输出非数NaN
        System.out.println("5.2 % 0.0 =" + num1 % 0.0);

        //输出非数NaN
        System.out.println("-5.2 % 0.0 =" + -num1 % 0.0);

        //输出0
        System.out.println("0 % 5.2 =" + 0 % num1);

        //输出0
        System.out.println("0 % 0.0 =" + 0 % 0.0);
        //抛出异常
        System.out.println("5.2 % 0 =" + num1 % 0);
    }
}
