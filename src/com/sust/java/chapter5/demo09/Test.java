package com.sust.java.chapter5.demo09;

public class Test {
    public static void main(String[] args) {
        Computer.pluginFlush(new Flush());
        Computer.pluginPrint(new Print());

        //面向接口
//        Computer.plugin(new Flush());
//        Computer.plugin(new Print());
    }
}
