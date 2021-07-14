package com.shui.headfirstdesignpatterns.chapter4.pizzaaf;

/**
 * @author shui.
 * @date 2021/7/14.
 * @time 17:57.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
        }
        return pizza;
    }
}
