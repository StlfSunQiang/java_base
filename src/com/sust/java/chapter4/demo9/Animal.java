package com.sust.java.chapter4.demo9;

/**
 * 演示不能在父类构造器中调用被子类重写的方法
 * @author sunqiang
 */
public class Animal {
    public Animal(){
        //sleep();
    }
    public void sleep(){
        System.out.println("Animal sleep()----");
    }
}
