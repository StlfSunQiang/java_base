package com.sust.java.chapter5.demo05;

/**
 * final修饰局部变量
 */
public class Test2 {

    public void method(final int score){
        //出现错误，不能对final修饰的形参赋值
        //score = 10;

        final String str = "abc";

        //final修饰的的str,已有初值不能赋值
        //str = "ABC";

        final double d;

        d = 80.5;

        //出现错误final变量只能赋一次值
        //d = 90;
    }

    public static void main(String[] args) {

    }
}
