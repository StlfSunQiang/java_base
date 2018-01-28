package com.sust.java.chapter4.demo6;

/**
 * Rabbit继承了Animal
 * @author sunqiang
 */
public class Rabbit extends Animal {
    public Rabbit(){
        //调用父类有参构造器
        super("哺乳纲-兔形目-兔科-兔属");
        System.out.println("Rabbit的无参构造器被调用---");
    }
}
