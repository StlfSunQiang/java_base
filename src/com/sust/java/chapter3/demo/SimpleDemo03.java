package com.sust.java.chapter3.demo;

/**
 * 演示三目运算符代替if-else
 */
public class SimpleDemo03 {
    public static void main(String[] args) {
        int max = 0; // 定义一个变量保存最大值

        int x = 3; // 定义整型变量x

        int y = 5; // 定义整型变量y

        max = x > y ? x : y; // 使用三目运算符获取最大值

        System.out.println("最大值为: " + max);

    }
}
