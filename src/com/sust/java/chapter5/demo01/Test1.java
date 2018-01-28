package com.sust.java.chapter5.demo01;

/**
 * 演示包装类、基本类型变量与包装互相转化
 */
public class Test1 {
    public static void main(String[] args) {
        //1.基本类型
        boolean flag = true;

        //通过构造器将基本类型赋值给对应的包装类
        Boolean flagObj = new Boolean(flag);

        int i = 80;
        //通过构造器将基本类型赋值给对应的包装类
        Integer intObj = new Integer(i);

        //把一个字符串转换为Float对象
        Float floatObj = new Float("8.01");

        //把一个字符串转换为Boolean对象
        Boolean flagObj2 = new Boolean("false");

        //出现错误，必须是有效字符串
        //Integer intObj2 = new Integer("abc"); //"1"


        //2.基本类型和包装类的相互转化
        //将Boolean转化为boolean
        boolean falg = flagObj.booleanValue();

        //将Integer类型转换为int类型
        int score = intObj.intValue();
    }
}
