package com.sust.java.chapter3.demo;

/**
 * 演示do-while循环
 */
public class SimpleDemo08 {
    public static void main(String[] args) {
        int x = 1; // 定义整型变量x

        int sum = 0; // 定义变量保存累加结果

        do { // do-while至少执行一次

            sum += x; // 执行累加操作

            x++; // 修改循环条件

        } while (x <= 10); // 判断循环条件

        System.out.println("1---->10累加结果为: " + sum);// 输出结果

    }
}
