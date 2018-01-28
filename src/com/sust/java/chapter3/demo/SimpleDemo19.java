package com.sust.java.chapter3.demo;


import java.util.Arrays;

/**
 * 操作数组的工具类
 */
public class SimpleDemo19 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4};
        int[] arr2 = new int[] {1,2,3,4};

        System.out.println("arr是否等于arr2:" + arr.equals(arr2));

        int[] arr3 = Arrays.copyOf(arr,5);

        System.out.println(Arrays.toString(arr3));

        Arrays.sort(arr3);

        for (int i = 0; i < arr3.length; i++){
            System.out.println("arr3[" + i + "] = " + arr3[i]);
        }

    }
}
