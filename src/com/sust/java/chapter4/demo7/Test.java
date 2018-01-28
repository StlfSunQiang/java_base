package com.sust.java.chapter4.demo7;

public class Test {
    public static void main(String[] args) {
        System.out.println("----父类Animal----");
        // 创建父类Animal对象 --- 编译时类型和运行时类型相同
        Animal animal = new Animal();
        //不发生多态现象
        animal.sleep();

        System.out.println("\n----子类Tiger----");
        // 创建Tiger对象 --- 编译时类型和运行时类型相同
        Tiger tiger = new Tiger();
        //不发生多态现象
        tiger.sleep();

        System.out.println("\n----子类Rabbit----");
        // 创建Rabbit对象 --- 编译时类型和运行时类型相同
        Rabbit rabbit = new Rabbit();
        //不发生多态现象
        rabbit.sleep();

        System.out.println("\n----以下发生多态----");
        // 编译时类型和运行时类型不相同
        Animal animal2 = new Tiger();
        animal2.sleep();

        animal2 = new Rabbit();
        //同样的方法，因为保存对象的不同而体现出不同的方法实现----多态
        animal2.sleep();//调用的是Animal的sleep(),但实际运行的是传入的实例的sleep方法实现

    }
}
