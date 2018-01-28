package com.sust.java.chapter4.demo2;

/**
 * 演示对象的this引用
 * 情况一：引用对象：this表示引用调用该方法的对象
 */
public class Person {
    public String name;
    public int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void sleep(){
        //如出现局部变量和成员变重名，使用成员变量需使用this
        String name = "";
        System.out.println("在" + age + "岁时" + this.name + "喜欢睡觉");
    }

    public void eat(){
        this.sleep();
        System.out.println("在" + age + "岁时" + this.name + "喜欢吃米饭");
    }

}
