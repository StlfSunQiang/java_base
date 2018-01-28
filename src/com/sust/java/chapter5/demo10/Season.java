package com.sust.java.chapter5.demo10;

/**
 *演示手动实现枚举
 */
public class Season {
    //季节名称
    private final String name;

    //季节描述
    private final String desc;

    //定义四个实例
    public static final Season SPRING = new Season("春天", "生机盎然");

    public static final Season SUMMER = new Season("夏天", "夏日炎炎");

    public static final Season AUTUMN = new Season("秋天", "秋高气爽");

    public static final Season WINTER = new Season("冬天", "寒风凛冽");

    private Season(String name, String desc){
        this.name = name;
        this.desc = desc;
    }

    public String getName(){
        return name;
    }

    public String getDesc(){
        return desc;
    }


}
