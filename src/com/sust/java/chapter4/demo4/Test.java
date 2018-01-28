package com.sust.java.chapter4.demo4;

public class Test {
    public static void main(String[] args) {
        //创建Animal实例
        Animal animal = new Animal();
        //调用eat()
        animal.eat();

        //创建Rabbit实例
        Rabbit rabbit = new Rabbit();
        rabbit.eat();

        Tiger tiger = new Tiger();
        tiger.eat();
    }
}
