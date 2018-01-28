package com.sust.java.chapter3.demo;

import java.util.Scanner;

/**
 * 演示数组的定义和使用
 */
public class SimpleDemo14 {
    public static void main(String[] args) {
        //----静态
        //定义一个int型数组
        int[] score;

        //使用静态初始化定义数组，并指定初始值
        int[] score2 = new int[] {30,40,50};

        //简化的静态初始化写法-----定义和初始化一起完成
        int[] score3 ={30,40,50};

        //任何类型的数组都能放入Object数组中
        Object[] objs;
        objs = new String[] {"java","jsp","servlet"};

        //----动态
        //数组的定义和初始化同时完成，使用动态语法，----数组中每个元素有初始值

        int[] score4 = new int[3];

        //访问数组
        //出错，没有初始化
        //String res = score[0];

        //访问数组中下标为一的元素

        int res2 = score2[1];
        System.out.println(res2);

        //出现下标越界异常
        //int res3 = score2[3];
        //System.out.println(res3);

        //常见访问方式
        for (int i = 0; i < score2.length; i++){
            System.out.println(score2[i]);
        }

        //赋值方式
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < score4.length; i++){
            System.out.println("请输入第"+ (i+1) + "个数：");
            score4[i] = input.nextInt();
        }
        System.out.println(score4);
    }
}
