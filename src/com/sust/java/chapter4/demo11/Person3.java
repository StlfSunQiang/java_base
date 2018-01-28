package com.sust.java.chapter4.demo11;

/**
 * 演示使用初始化块
 * 情况三（变量age有初始值，并且在初始化块之前）
 *
 */
public class Person3 {

    private int age = 30;

    {
        age = 20;
        System.out.println("初始化块被执行----");
    }

    public Person3(){
        System.out.println("无参数的构造器被执行----");
    }

    public static void main(String[] args) {
        Person3 person3 = new Person3();
        System.out.println("情况三：person3.age = " + person3.age);
    }
}
