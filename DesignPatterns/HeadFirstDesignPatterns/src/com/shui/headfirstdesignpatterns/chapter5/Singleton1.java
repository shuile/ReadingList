package com.shui.headfirstdesignpatterns.chapter5;

/**
 * @author shui.
 * @date 2021/7/16.
 * @time 11:02.
 */
public class Singleton1 {
    private static final Singleton1 uniqueInstance = new Singleton1();

    private Singleton1() {}

    public static Singleton1 getInstance() {
        return uniqueInstance;
    }
}
