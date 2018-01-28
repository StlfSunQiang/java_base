package com.sust.java.chapter5.demo10;

public class Test {
    public static void main(String[] args) {
        //使用自定义枚举类
        Season spring = Season.SPRING;
        System.out.println(spring.getName() + "----" + spring.getDesc());

        Season winter = Season.WINTER;
        System.out.println(winter.getName() + "----" + winter.getDesc());
    }
}
