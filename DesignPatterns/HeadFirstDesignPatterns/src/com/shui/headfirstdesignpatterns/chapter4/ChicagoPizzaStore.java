package com.shui.headfirstdesignpatterns.chapter4;

/**
 * @author shui.
 * @date 2021/7/13.
 * @time 00:53.
 */
public class ChicagoPizzaStore extends PizzaStore {

    public ChicagoPizzaStore() {
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ChicagoStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
