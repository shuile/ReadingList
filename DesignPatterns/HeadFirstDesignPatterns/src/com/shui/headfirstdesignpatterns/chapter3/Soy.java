package com.shui.headfirstdesignpatterns.chapter3;

/**
 * @author shui.
 * @date 2021/7/9.
 * @time 08:04.
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
