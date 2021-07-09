package com.shui.headfirstdesignpatterns.chapter3;

/**
 * @author shui.
 * @date 2021/7/8.
 * @time 22:52.
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
