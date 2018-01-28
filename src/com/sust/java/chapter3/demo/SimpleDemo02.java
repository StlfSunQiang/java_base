package com.sust.java.chapter3.demo;

/**
 * 演示if-else语句
 */
public class SimpleDemo02 {
    public static void main(String[] args) {
        int x = 3; // 定义整型变量x

        if (x % 2 == 1) // 判断余数是否为1
        {
            System.out.println("x是奇数 ... "); // 如果余数为1表示奇数

        } else // else也是一种情况
        {
            System.out.println("x是偶数 ... "); // 如果余数为0表示偶数
        }

    }

}
