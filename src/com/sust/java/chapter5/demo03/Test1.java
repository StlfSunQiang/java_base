package com.sust.java.chapter5.demo03;

/**
 * 演示==和equals比较运算符
 */
public class Test1 {
    public static void main(String[] args) {
        //1.基本类型
        int i = 97;
        float f = 97.0f;

        //相等返回true
        System.out.println("97和97.0是否相等：" +(i == f));

        char c = 'a';
        System.out.println("97和a是否相等：" + (c == i));

        //2.引用类型
        String str = new String("abc");
        String str2 = new String("abc");
        //返回false str、str2指向的不是同一对象
        System.out.println("str是否等于str2:"+(str == str2));
        //返回true,string重写了object中的equals方法，只判断内容是否相等。
        System.out.println("str.equals(str2)是否相等：" + str.equals(str2));
    }
}
