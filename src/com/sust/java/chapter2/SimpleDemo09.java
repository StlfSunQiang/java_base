package com.sust.java.chapter2;

/**
 * 演示强制转换
 * @author sunqiang
 */
public class SimpleDemo09 {
    public static void main(String[] args) {

        //强制转换可能丢失数据
        int i = 233;
        byte b = (byte) i;
        System.out.println(b);

        double d = 5.20;
        int i1 = (int) d;
        System.out.println(d);
    }
}
