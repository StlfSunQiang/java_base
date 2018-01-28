package com.sust.java.chapter4.demo6;

public class Test {
    public static void main(String[] args) {
        //创建Animal实例
        Animal animal = new Animal();
        System.out.println("Animal类的属性值为：" + animal.type);

        System.out.println("\n-----子类Tiger----");
        //创建Animal的子类Tiger实例
        Tiger tiger = new Tiger();
        System.out.println("Tiger子类继承的属性值为：" + tiger.type);

        System.out.println("\n-----子类Rabbit-----");
        //创建Rabbit实例
        Rabbit rabbit = new Rabbit();
        System.out.println("Rabbit子类继承的属性值为：" + rabbit.type);
    }
}
