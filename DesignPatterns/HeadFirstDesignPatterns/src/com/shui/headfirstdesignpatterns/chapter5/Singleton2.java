package com.shui.headfirstdesignpatterns.chapter5;

/**
 * @author shui.
 * @date 2021/7/16.
 * @time 11:09.
 */
public class Singleton2 {
    private volatile static Singleton2 uniqueInstance;

    private Singleton2() {}

    public static Singleton2 getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton2.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton2();
                }
            }
        }
        return uniqueInstance;
    }
}
