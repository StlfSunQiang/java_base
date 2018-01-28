package com.sust.java.chapter5.demo02;

/**
 * 演示打印对象和toString方法，重写toString方法
 */
public class Person2 {
    private String name;
    private int age;

    public Person2(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name = " + name + "age = " + age;
    }

    public static void main(String[] args) {
        Person2 person2 = new Person2("小王", 20);
        System.out.println(person2);
        System.out.println(person2.toString());
    }
}
