package com.sust.java.chapter4.demo10;

public class Tiger {
    //将原来的父类嵌入到原来的子类中，作为子类的一个组合部分
    private Animal animal;

    //提供有参构造器
    public Tiger(Animal animal){
        this.animal = animal;
    }

    //定义一个自己的breath方法
    public void breath(){
        //调用Animal中的breath方法,实现代码复用
        animal.breath();
    }

    public void eat(){
        System.out.println("我喜欢吃Rabbit----");
    }
}
