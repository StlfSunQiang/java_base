package com.sust.java.chapter2;

/**
 * 演示boolean类型
 * @author sunqiang
 */
public class SimpleDemo07 {

    public static void main(String[] args) {

        //定义一个boolean类型的变量
        boolean flag = true;
        System.out.println(flag);

        //boolean自动提升为String类型
        String s = flag + "";
        System.out.println(s);
    }
}
