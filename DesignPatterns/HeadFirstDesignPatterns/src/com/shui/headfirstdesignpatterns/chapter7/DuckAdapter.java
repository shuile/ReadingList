package com.shui.headfirstdesignpatterns.chapter7;

/**
 * @author shui.
 * @date 2021/8/9.
 * @time 10:48.
 */
public class DuckAdapter implements Turkey {

    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
