package com.sust.java.chapter2;

/**
 * 演示Math类
 */
public class SimpleDemo13 {
    public static void main(String[] args) {

        double i = 9;

        //平方
        double result = Math.pow(i,2);
        System.out.println(result);

        //平方根
        double result1 = Math.sqrt(i);
        System.out.println(result1);

        //0---1之间的随机数
        double result3 = Math.random();
        System.out.println(result3);

        //sin() 例：求60度的sin值
        //方式一
        double d = 60;
        double radians = Math.toRadians(d);
        double result4 = Math.sin(radians);
        System.out.println(result4);

        //方式二
        double result5 = Math.sin(Math.PI*60/180);
        System.out.println(result5);
    }
}
