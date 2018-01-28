package com.sust.java.chapter3.demo;

/**
 * 演示基本类型的初始化
 */
public class SimpleDemo16 {
    public static void main(String[] args) {

        int[] arr;//定义一个数组

        arr = new int[5]; //动态初始化数组，数组长度为5

        for (int i = 0; i < arr.length; i++){ //采用循环方式给数组每个元素赋值
            arr[i] = i + 10;
            System.out.println(arr[i]);
        }
    }
}
