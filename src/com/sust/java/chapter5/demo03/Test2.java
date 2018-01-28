package com.sust.java.chapter5.demo03;

/**
 * 演示自定义的相等标准
 */
public class Test2 {
    public static void main(String[] args) {

        Person p = new Person();

        Person2 p2 = new Person2();

        Dog dog = new Dog();

        //System.out.println("p == p2 :" + (p1 == p2));

        System.out.println("p.equals(p2):" + p.equals(p2));

        System.out.println("p.equals(dog):" + p.equals(dog));
    }
}
