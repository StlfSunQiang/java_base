package com.sust.java.chapter5.demo04;

/**
 * 单例类（singleton）
 */
public class Singleton {

        private static Singleton instance;

        private Singleton(){

        }

        public static Singleton getInstance(){
            if (instance == null){
                instance = new Singleton();
            }
            return instance;
        }

    public static void main(String[] args) {
        Singleton s = new Singleton();

        Singleton s2 = new Singleton();

        System.out.println(s == s2);
    }
}
