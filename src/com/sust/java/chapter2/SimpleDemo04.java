package com.sust.java.chapter2;

/**
 * 演示字符
 *
 * @author sunqiang
 *
 */
public class SimpleDemo04 {

    public static void main(String[] args) {

        //直接指定字符作为字符常量，需使用单引号
        char c = 'a';

        //定义单个汉字字符
        char c2 = '孙';

        //直接把0---65535范围内的int整数赋给一个char变量
        char c3 = 97;

        //使用转义字符作为常量
        char c4 = '\n';

        //使用unicode编码来指定字符常量
        char c5 = '\u9999';

        //直接将一个char变量当成Int型变量使用
        int i = c2;

        System.out.println(c+"--"+c2+"--"+c3+"--"+c4+"--"+c5+"--"+i);
    }
}
