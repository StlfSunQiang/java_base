package com.sust.java.chapter5.demo03;

/**
 * 演示（教合理的重写equals判断相等）
 */
public class Test3 {
    public static void main(String[] args) {

        Person2 p = new Person2("小王", 20, "123");

        Person2 p2 = new Person2("小李", 20, "123");

        System.out.println("p.equals(p2):"+ p.equals(p2));
    }
}
