package com.sust.java.chapter3.demo;

import java.util.Scanner;

/**
 * 演示switch
 */
public class SimpleDemo05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("请输入x的值：");

        int x = input.nextInt();

        System.out.println("请输入y的值：");

        int y = input.nextInt();

        System.out.println("请输入运算符(+、-、*、/):");

        char oper = input.next().charAt(0);

        switch(oper){
            case '+':
                System.out.println("x + y =" + (x + y));
                break;
            case '-':
                System.out.println("x - y = " + (x - y));
                break;
            case '*':
                System.out.println("x * y = " + (x * y));
                break;
            case '/':
                System.out.println("x / y = " + (x / y));
                break;
            default:
                System.out.println("未知操作数！");
                break;
        }
    }
}
