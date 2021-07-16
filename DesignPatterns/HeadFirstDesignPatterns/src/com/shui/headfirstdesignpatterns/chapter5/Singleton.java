package com.shui.headfirstdesignpatterns.chapter5;

/**
 * @author shui.
 * @date 2021/7/15.
 * @time 15:59.
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
