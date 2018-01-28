package com.sust.java.chapter5.demo08;

public class Test {
    public static void main(String[] args) {
        Flush f = new Flush();
        f.start();
        System.out.println("USB3.0理论传输速率：" + f.speed);
        f.stop();
    }
}
