package com.sust.java.chapter3.demo;

import java.util.Scanner;

/**
 * 演示foreach循环
 */
public class SimpleDemo15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] strs = new String[3];

        for (int i = 0; i <strs.length; i++){
            System.out.println("请输入第" + (i+1) + "个数:");
            strs[i] = input.next();
        }
        System.out.println("遍历数组：");
        for (String str: strs) {
            System.out.println(str);
        }
    }
}
