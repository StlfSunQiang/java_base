package com.sust.java.chapter4.demo12;

/**
 * 演示使用静态初始化块
 */
public class Person {

    public Person(){
        System.out.println("无参数的构造器被执行---");
    }
    //初始化块
    {
        System.out.println("初始化块被执行---");
    }

    static {
        System.out.println("静态初始化块被执行---");
    }

    public static void main(String[] args) {
        Person person = new Person();
    }
}
