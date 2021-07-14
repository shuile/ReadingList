package com.shui.headfirstdesignpatterns.chapter4;

/**
 * @author shui.
 * @date 2021/7/14.
 * @time 08:11.
 */
public class DependentPizzaStore {
    public Pizza createPizza(String style, String type) {
        Pizza pizza = null;
        if (style.equals("NY")) {
            switch (type) {
                case "cheese":
                    pizza = new NYStyleCheesePizza();
                    break;
                case "veggie":
                    pizza = new NYStyleVeggiePizza();
                    break;
                case "clam":
                    pizza = new NYStyleClamPizza();
                    break;
                case "pepperoni":
                    pizza = new NYStylePepperoniPizza();
                    break;
            }
        } else if (style.equals("Chicago")) {
            switch (type) {
                case "cheese":
                    pizza = new ChicagoStyleCheesePizza();
                    break;
                case "veggie":
                    pizza = new ChicagoStyleVeggiePizza();
                    break;
                case "clam":
                    pizza = new ChicagoStyleClamPizza();
                    break;
                case "pepperoni":
                    pizza = new ChicagoStylePepperoniPizza();
                    break;
            }
        } else {
            System.out.println("Error: invalid type of pizza");
        }
        if (pizza == null) {
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
