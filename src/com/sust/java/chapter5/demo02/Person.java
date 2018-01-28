package com.sust.java.chapter5.demo02;

/**
 * 演示打印对象和toString方法
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person("小王",20);
        //实际输出toString方法的返回值，该方法继承于父类Object
        System.out.println(person);
        System.out.println(person.toString());
    }
}
