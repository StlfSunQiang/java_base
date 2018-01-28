package com.sust.java.chapter4.demo9;

/**
 * Rabbit继承的父类Animal
 * @author sunqiang
 */
public class Rabbit extends Animal {
    public String type = "哺乳纲-兔形目-兔科-兔属";

    @Override
    public void sleep() {
        System.out.println(type);
        System.out.println("我喜欢睡在树洞里----");
    }
}
