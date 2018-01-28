package com.sust.java.chapter3.demo;

import java.util.Scanner;

/**
 * 演示if语句
 */
public class SimpleDemo01 {
    public static void main(String[] args) {
        //创建Scanner对象，让其能够在控制台接收信息
        Scanner input = new Scanner(System.in);
        //提示信息
        System.out.println("请输入一个数:");
        //从控制台接收一个整数
        int x = input.nextInt();

        if (x % 2 == 0){
            System.out.println("x是偶数");//输出判断结果
        }
    }
}
