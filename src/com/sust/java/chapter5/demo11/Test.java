package com.sust.java.chapter5.demo11;

public class Test {
    public static void main(String[] args) {
        //使用enum定义的枚举类
        Season spring = Season.SPRING;
        System.out.println(spring);

        //枚举转换enum---->string
        String summer = Season.SUMMER.toString();
        System.out.println(summer);

        //枚举转换string---->enum
        Season autumn = Enum.valueOf(Season.class,"AUTUMN");
        System.out.println(autumn);

        System.out.println("遍历枚举中所有的值：");
        Season[] values = Season.values();
        for (int i = 0; i < values.length; i++){
            Season season = values[i];
            System.out.println(season);
        }
    }
}

