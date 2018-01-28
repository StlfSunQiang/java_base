package com.sust.java.chapter3.demo;

/**
 * 演示for循环
 *
 * @author Administrator
 *
 */

public class SimpleDemo09 {

    public static void main(String[] args) {
        int sum = 0; // 定义变量保存累加结果
        for (int i = 0; i <= 10; i++)// 使用for循环
        {
            sum += i; // 执行累加操作
        }
        System.out.println("1--->10的累加结果为:" + sum); // 输出累加结果

    }
}