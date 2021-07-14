package com.shui.headfirstdesignpatterns.chapter4;

/**
 * @author shui.
 * @date 2021/7/13.
 * @time 00:53.
 */
public class NYPizzaStore extends PizzaStore {
    public NYPizzaStore() {
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("clam")) {
            pizza = new NYStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        } else if (type.equals("veggie")) {
            pizza = new NYStyleVeggiePizza();
        }
        return pizza;
    }
}
