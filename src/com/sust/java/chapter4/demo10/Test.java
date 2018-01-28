package com.sust.java.chapter4.demo10;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();

        //需要显示创建被嵌入的实例
        Tiger tiger = new Tiger(animal);
        tiger.breath();
        tiger.eat();
    }
}
