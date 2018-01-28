package com.sust.java.chapter4.demo1;

/**
 * 演示对象的产生和使用
 * 定义一个测试类
 * @author  sunqiang
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person(); //创建一个people的实例
        p.name = "张三丰";
        p.age = 20;
        p.sleep();
        p.eat();

    }
}
