package com.sust.java.chapter2;

/**
 * 演示整数
 *
 * @author snnqinag
 */
public class SimpleDemo03 {
    public static void main(String[] args) {

        //将一个较小的整数常量赋值给byte/short型变量，系统发生自动转换
        byte b = 20; //定义一个byte型变量，20自动转换为byte型
        int i = 20;  //定义一个整数变量

        short s = 3344;

        Long l = 9222333723695477L; //定义long型变量需添加L;

        System.out.println(b + "---" + i + "---" + s + "---" + l );
    }
}
