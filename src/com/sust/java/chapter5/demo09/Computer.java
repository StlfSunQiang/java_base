package com.sust.java.chapter5.demo09;

public class Computer {

    public static void pluginFlush(Flush flush){
        flush.start();
        System.out.println("----USB设备开始工作----");
        flush.stop();
    }

    public static void pluginPrint(Print print){
        print.start();
        System.out.println("-----USB设备开始工作----");
        print.stop();
    }

    //面向接口编程
//    public static void plugin(USB usb){ //只要是USB设备就可以使用
//        usb.start();
//        System.out.println("----USB设备开始工作----");
//        usb.stop();
//
//    }
}
