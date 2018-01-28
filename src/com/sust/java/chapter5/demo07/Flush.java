package com.sust.java.chapter5.demo07;

/**
 * U盘
 */
public class Flush implements USB{

    @Override
    public void start() {
        System.out.println("U盘开始工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘停止工作");
    }
}
