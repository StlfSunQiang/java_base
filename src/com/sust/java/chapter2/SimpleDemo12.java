package com.sust.java.chapter2;

/**
 * 演示自增、自检运算
 */
public class SimpleDemo12 {

    public static void main(String[] args) {

        int a = 0;
        a++;
        System.out.println(a); //1

        int b = 0;
        System.out.println(b++); //0  先使用，后自增
        System.out.println(b); //1

        int c = 0;
        ++c;
        System.out.println(c); //1

        int d = 0;
        System.out.println(++d); //1  先自增，后使用
        System.out.println(d); //1
    }
}
