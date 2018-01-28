package com.sust.java.chapter4.demo11;

/**
 * 演示使用初始化块
 * 方式二：方式一：(变量age没有初始值，并且在初始化块之前)
 */
public class Person2 {

    //初始化块，age赋值为20
    {
        age = 20;
        System.out.println("初始化块被执行----");
    }
    private int age;

    public Person2(){
        System.out.println("无参数的构造方法被执行----");
    }

    public static void main(String[] args) {
        Person2 person2 = new Person2();
        System.out.println("情况2：person2.age = " + person2.age);
    }
}
