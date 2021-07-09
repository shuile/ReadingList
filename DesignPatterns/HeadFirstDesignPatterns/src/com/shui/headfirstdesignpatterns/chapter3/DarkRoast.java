package com.shui.headfirstdesignpatterns.chapter3;

/**
 * @author shui.
 * @date 2021/7/9.
 * @time 07:57.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dar Roast Coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
