package com.sust.java.chapter5.demo12;

/**
 * 枚举类的属性、方法、和构造器
 */
public enum Gender {
    //枚举值需要调用构造器
    MALE("男"),FEMALE("女");

    //枚举类中的属性
    private String desc;

    private Gender(String desc){
        this.desc = desc;
    }

    public String getDesc(){
        return desc;
    }

}
