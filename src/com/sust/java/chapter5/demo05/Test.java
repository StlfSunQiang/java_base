package com.sust.java.chapter5.demo05;

/**
 * 演示final修饰成员变量
 *
 */
public class Test {

    final int score = 10;

    final int score2;

    final String str;

    final static double d;

    //final char c; //没有赋初始值

    //在静态块中初始化 类（static）属性
    static{
        d = 52.01;
    }

    //初始化块，对没有指定初始值的实例属性指定初始值
    {
        str = "Hello World";

        //在次对score属性赋值出现错误
        //score = 20;
    }

    //构造器中也可对final类型变量赋初值
    public Test(){
        score2 = 80;
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("" + Test.d);
        System.out.println("" + t.score);
        System.out.println("" + t.score2);
    }


}
