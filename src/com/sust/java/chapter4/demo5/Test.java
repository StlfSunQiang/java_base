package com.sust.java.chapter4.demo5;

public class Test {
    public static void main(String[] args) {

        //创建Animal实例
        Animal animal = new Animal();
        //调用eat()方法
        animal.eat();
        System.out.println("Animal类的属性值为：" + animal.type);

        //子类的eat()显然和父类不同，故子类重写父类方法
        System.out.println("\n-----子类Tiger-----");
        //创建Animal的子类Tiger实例
        Tiger tiger = new Tiger();
        //Tiger继承了父类eat方法
        tiger.eat();
        System.out.println("Tiger子类覆盖的属性值为：" + tiger.type);

        System.out.println("\n-----子类Rabbit-----");
        //同理Rabbit也继承了父类的属性和方法
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        System.out.println("Rabbit子类覆盖的属性值为：" + rabbit.type);


    }
}
