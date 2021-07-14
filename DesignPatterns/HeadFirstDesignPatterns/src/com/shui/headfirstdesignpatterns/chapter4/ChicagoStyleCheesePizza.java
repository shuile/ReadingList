package com.shui.headfirstdesignpatterns.chapter4;

/**
 * @author shui.
 * @date 2021/7/13.
 * @time 00:56.
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    public void cut() {
        System.out.println("Cuttings the pizza into square slices");
    }
}
