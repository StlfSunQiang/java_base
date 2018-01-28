package com.sust.java.chapter5.demo13;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            new Test();
            System.gc();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("正在清理资源.....");
    }
}
