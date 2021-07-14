package com.shui.headfirstdesignpatterns.chapter4;

/**
 * @author shui.
 * @date 2021/7/12.
 * @time 23:45.
 */
public abstract class PizzaStore {
    public final Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
