package com.sust.java.chapter5.demo07;

public class Test {
    public static void main(String[] args) {
        USB usb = new Flush();
        usb.start();
        usb.stop();

        USB usb1 = new Print();
        usb1.start();
        usb1.stop();
    }
}
