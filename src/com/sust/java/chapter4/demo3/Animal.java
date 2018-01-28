package com.sust.java.chapter4.demo3;

/**
 * 演示继承的特点
 * 父类Animal
 */
public class Animal {

    public String type = "动物的类型";
    public Animal(){
        System.out.println("Animal被实例化---");
    }
    public void eat(){
        System.out.println("Animal eat()方法被调用---");
    }
}
