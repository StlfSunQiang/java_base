package com.sust.java.chapter4.demo8;

/**
 * 演示引用类型变量的强制转换
 * @author sunqiang
 */
public class Test1 {
    public static void main(String[] args) {

        //obj的编译类型为Object
        Object obj = "Hello World";
        //obj的实际类型为String,运行时可通过转换为子类String
        String str = (String)obj;

        //obj2的编译类型为Object
        Object obj2 = new Integer("20");
        //obj2的实际类型为Integer,运行时不能转换为子类String，编译不报错，运行报错
        String str2 = (String)obj2;

    }
}
