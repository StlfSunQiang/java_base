package com.sust.java.chapter4.demo1;

/**
 * 演示定义类
 * @author sunqiang
 */

//定义一个Person类
public class Person {

    public String name; //姓名
    public int age; //年龄

    public void sleep(){ //睡觉的行为
        System.out.println("在" + age + "岁时" + name + "喜欢睡觉");
    }
    public void eat(){ //吃的行为
        System.out.println("在" + age + "岁时" + name + "喜欢吃米饭");
    }
}
