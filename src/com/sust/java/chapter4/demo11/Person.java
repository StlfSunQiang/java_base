package com.sust.java.chapter4.demo11;

/**
 * 演示使用初始化块
 * 方式一：(变量age没有初始值，并且在初始化块之后)
 * @author sunqiang
 */
public class Person {
    //声明属性age
    private int age;

    //初始化块，将age赋值为20
    {
        age = 20;
        System.out.println("初始化块被执行----");
    }

    public Person(){
        System.out.println("无参数的构造器被执行----");
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("情况1：person.age =" + person.age);
    }
}
