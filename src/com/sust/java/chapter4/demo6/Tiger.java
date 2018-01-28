package com.sust.java.chapter4.demo6;

/**
 * Tiger继承了Animal
 *
 * @author sunqiang
 */
public class Tiger extends Animal {
    public Tiger(){
        //调用父类有参构造器
        super("哺乳纲-食肉目-猫科-虎属");
        System.out.println("Tiger的无参构造器被调用---");
    }

}
