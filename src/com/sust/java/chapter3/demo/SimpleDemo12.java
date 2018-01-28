package com.sust.java.chapter3.demo;

/**
 * 演示continue结束本次循环
 */
public class SimpleDemo12 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++){
            if (i == 3){
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
