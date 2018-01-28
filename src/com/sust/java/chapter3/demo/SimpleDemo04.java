package com.sust.java.chapter3.demo;

import java.util.Scanner;

/**
 * 演示多重if
 */
public class SimpleDemo04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入java的成绩: ");

        int java = input.nextInt();

        if (java >= 90) {
            System.out.println("优秀 ... ");
        } else if (java >= 80 && java < 90) {
            System.out.println("良好");
        } else if (java >= 70 && java < 80) {
            System.out.println("中等");
        } else if (java >= 60 && java < 70) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }

    }
}
