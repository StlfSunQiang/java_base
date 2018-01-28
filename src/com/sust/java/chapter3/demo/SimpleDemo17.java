package com.sust.java.chapter3.demo;

/**
 * 演示引用类型的初始化
 */
public class SimpleDemo17 {
    public static void main(String[] args) {
        Student[] students; //定义一个Student类型的数组变量，用来存储学生实例

        students = new Student[3]; //动态初始化students数组

        Student stu = new Student();//创建学生实例1

        stu.stuId = "25"; //给实例1的属性赋值
        stu.stuName = "孙强";
        stu.stuAge = 20;

        Student stu2 = new Student(); // 创建学生实例2

        stu2.stuId = "30"; //给实例二的属性赋值
        stu2.stuName = "小强";
        stu2.stuAge = 18;

        students[0] = stu; //将实例1赋值给数组第一个元素
        students[1] = stu2; //将实例2赋值给数组的第二个元素

        //下面输出结果一样
        stu.info(); //调用实例一的方法打印学生信息
        students[0].info(); //调用数组第一个元素对应的实例一的方法，打印学生信息

        stu2.info();
        students[1].info();

    }
}

/**
 * 定义一个Student类
 */
class Student{
    public String stuId; //学号
    public String stuName; //姓名
    public int stuAge; //年龄

    public void info(){ //打印学生信息
        System.out.println("学号：" + stuId + " " + "姓名：" + stuName+ " " + "年龄：" + stuAge);
    }
        }