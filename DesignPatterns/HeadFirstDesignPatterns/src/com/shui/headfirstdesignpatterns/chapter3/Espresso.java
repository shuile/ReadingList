package com.shui.headfirstdesignpatterns.chapter3;

/**
 * @author shui.
 * @date 2021/7/8.
 * @time 22:51.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
