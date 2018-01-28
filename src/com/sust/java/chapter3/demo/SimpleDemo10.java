package com.sust.java.chapter3.demo;

/**
 * 演示嵌套循环
 *
 * @author Administrator
 *
 */
public class SimpleDemo10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) // 第一次循环
        {
            for (int j = 1; j <= i; j++) // 第二次循环
            {
                System.out.print(i + " * " + j + " = " + (i * j) + " ");
            }
            System.out.println(); // 换行
        }

    }
}
