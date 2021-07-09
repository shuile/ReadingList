package com.shui.headfirstdesignpatterns.chapter3;

/**
 * @author shui.
 * @date 2021/7/8.
 * @time 22:51.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
