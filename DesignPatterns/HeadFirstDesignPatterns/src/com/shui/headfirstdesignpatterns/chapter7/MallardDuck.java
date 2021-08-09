package com.shui.headfirstdesignpatterns.chapter7;

/**
 * @author shui.
 * @date 2021/8/9.
 * @time 10:40.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
