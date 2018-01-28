package com.sust.java.chapter5.demo01;

/**
 * 演示自动（拆箱/装箱）
 */
public class Test2 {
    public static void main(String[] args) {
        //直接将基本类型变量赋值为Integer对象----装箱
        Integer intObj = 60;

        //直接把boolean类型变量赋值给Object变量----装箱
        Object obj = true;

        //直接把Integer变量赋值给int型变量----拆箱
        int score = intObj;

        if (obj instanceof Boolean){
            //装箱拆箱自动完成
            boolean flag = (Boolean) obj;
            System.out.println(flag);
        }
    }
}
