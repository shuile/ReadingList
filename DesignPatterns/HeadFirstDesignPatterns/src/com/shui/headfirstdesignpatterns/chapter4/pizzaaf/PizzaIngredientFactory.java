package com.shui.headfirstdesignpatterns.chapter4.pizzaaf;

/**
 * @author shui.
 * @date 2021/7/14.
 * @time 17:29.
 */
public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
