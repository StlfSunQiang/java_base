package com.sust.java.chapter3.demo;

/**
 * 演示循环
 */
public class SimpleDemo07 {
    public static void main(String[] args) {
        int x = 1;
        int sum = 0;
         while(x <= 10){
             sum += x;
             x++;
         }
        System.out.println("1----->10累加结果为：" + sum);
    }
}
