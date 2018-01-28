package com.sust.java.chapter3.demo;

/**
 * 演示break结束循环
 */
public class SimpleDemo11 {
    public static void main(String[] args) {
        for (int i = 1; i< 10; i++){
            if (i == 3){
                break;
            }
            System.out.println("i = " + i);
        }
    }
}
