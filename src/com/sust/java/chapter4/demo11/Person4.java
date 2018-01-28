package com.sust.java.chapter4.demo11;

/**
 * 演示使用初始化块
 * 方式四：(变量age有初始值，并且在初始化块之后)
 */
public class Person4 {
    {
        age = 20;
        System.out.println("初始化块被执行---");
    }
    private int age = 30;

    public Person4(){
        System.out.println("无参数的构造方法被执行---");
    }

    public static void main(String[] args) {
        Person4 person4 = new Person4();
        System.out.println("情况四：person4.age = " + person4.age);
    }
}
