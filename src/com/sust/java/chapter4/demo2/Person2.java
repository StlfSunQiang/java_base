package com.sust.java.chapter4.demo2;

/**
 * 演示 对象的this引用
 * 情况一：（构造器中使用this）
 * @author sunqiang
 */
public class Person2 {

    public String name;
    public int age;

    //一个参数的构造器
    public Person2(String name){
        this.name = name;
    }

    //两个参数的构造器
    public Person2(String name, int age){
        //如何在当前构造器中调用一个参数的构造器
        this(name);//调用当前初始化对象的一个参数的构造器

        //只给当前初始化对象的age属性赋值
        this.age = age;
    }

    public void eat(){
        System.out.println("在" + this.age + "岁那个年代的" + this.name + "吃牛肉面 ... ");
    }
}
