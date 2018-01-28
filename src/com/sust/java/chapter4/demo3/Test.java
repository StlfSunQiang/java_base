package com.sust.java.chapter4.demo3;

public class Test {
    public static void main(String[] args) {
        //创建Animal实例
        Animal animal = new Animal();
        System.out.println("父类Animal的属性：" + animal.type);
        System.out.println("父类Animal的方法：");
        animal.eat();

        System.out.println("\n---------子类Tiger---------");

        //创建Animal的子类Tiger实例
        Tiger tiger = new Tiger();
        //tiger继承了父类的type属性
        String t = tiger.type;
        System.out.println("tiger继承的属性：" + t);
        //tiger继承了父类的eat()方法
        System.out.println("tiger继承的方法：");
        tiger.eat();

        System.out.println("\n--------子类Rabbit--------");

        //同理rabbit也继承了父类的属性和方法
        Rabbit rabbit = new Rabbit();
        System.out.println("Rabbit继承的属性：" + rabbit.type);
        System.out.println("Rabbit继承的方法：");
        rabbit.eat();

        System.out.println("\n--------子类的子类LittleRabbit--------");
        //继承具有传递性，LittleRabbit也继承了Animal的属性和方法
        LittleRabbit littleRabbit = new LittleRabbit();
        System.out.println("LittleRabbit继承的属性：" + littleRabbit.type);
        System.out.println("LittleRabbit继承的方法：");
        littleRabbit.eat();
    }
}
