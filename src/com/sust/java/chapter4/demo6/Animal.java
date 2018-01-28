package com.sust.java.chapter4.demo6;

/**
 * 演示调用父类构造器
 * @author sunqiang
 */
public class Animal {
    public String type;

    public Animal(){
        System.out.println("Animal的无参构造器被调用---");
    }
    public Animal(String type){
        System.out.println("Animal(String type) 有参构造器被调用---");
        this.type = type;
    }
}
