package com.sust.java.chapter3.demo;

/**
 * 演示return结束方法
 */
public class SimpleDemo13 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++){
            if (i == 3){
                return;
            }
            System.out.println("i = " + i);
        }
    }
}
