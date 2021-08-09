package com.shui.headfirstdesignpatterns.chapter7;

/**
 * @author shui.
 * @date 2021/8/9.
 * @time 10:41.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
