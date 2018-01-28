package com.sust.java.chapter2;

/**
 * 演示浮点数
 *
 * @author sunqiang
 */
public class SimpleDemo06 {
    public static void main(String[] args) {

        //单精度浮点数添加f
        float f = 5.23455568f;
        //可能出现丢失精度
        System.out.println(f);

        //可用double提高精度
        double d = 5.23455568d;
        System.out.println(d);

        //正数浮点数除以0得到正无穷
        System.out.println("正无穷：" + 1.0 / 0);
        //负数浮点数除以0得到负无穷
        System.out.println("负无穷：" + -1.0 / 0);

        //负无穷==负无穷 正无穷 == 正无穷
        float f2 = Float.NEGATIVE_INFINITY;
        double d2 = Double.NEGATIVE_INFINITY;
        System.out.println("负无穷=负无穷 " +(f2 == d2));

        float f3 = Float.POSITIVE_INFINITY;
        double d3 = Double.POSITIVE_INFINITY;
        System.out.println("正无穷=正无穷 " + (f3 == d3));

        //出现非数
        System.out.println(0.0 / 0.0);
        //两个非数不相等
        System.out.println(0.0 / 0.0 == Float.NaN);
        //抛出异常
        System.out.println(1 / 0);
    }
}
