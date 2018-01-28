package com.sust.java.chapter4.demo8;

/**
 * 演示instanceof运算符
 * @author sunqiang
 */
public class Test2 {
    public static void main(String[] args) {

        Object str = "abc";

        System.out.println("字符串是否是Object的实例：" + (str instanceof Object));

        System.out.println("字符串是否是String的实例：" + (str instanceof String));

        System.out.println("字符串是否是Comparable的实例：" + (str instanceof Comparable));
    }
}
