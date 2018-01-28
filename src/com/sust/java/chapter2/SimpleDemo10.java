package com.sust.java.chapter2;

/**
 * 演示算数运算符
 * @author sunqiang
 */
public class SimpleDemo10 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 2;

        System.out.println(num1 / num2); //2

        double d = 2.0;
        System.out.println(num1 / d); //2.5

        System.out.println(num1 / 0.0); //Infinity

        System.out.println(-num1 / 0.0); //-Infinity
    }
}
