package com.shui.headfirstdesignpatterns.chapter12.first.observer;

/**
 * @author shui.
 * @date 2021/9/28.
 * @time 19:30.
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
