package com.shui.headfirstdesignpatterns.chapter3;

/**
 * @author shui.
 * @date 2021/7/8.
 * @time 22:49.
 */
public abstract class CondimentDecorator extends Beverage {

    public Beverage beverage;

    public abstract String getDescription();
}
