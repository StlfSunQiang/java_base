package com.sust.java.chapter5.demo07;

/**
 * 打印机
 */
public class Print implements USB {

    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机停止工作");
    }
}
