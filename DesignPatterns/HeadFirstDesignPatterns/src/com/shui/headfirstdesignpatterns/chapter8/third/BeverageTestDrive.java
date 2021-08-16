package com.shui.headfirstdesignpatterns.chapter8.third;

/**
 * @author shui.
 * @date 2021/8/16.
 * @time 07:42.
 */
public class BeverageTestDrive {
    public static void main(String[] args) {
        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\nMaking tea...");
        teaHook.prepareRecipe();

        System.out.println("Making coffee...");
        coffeeHook.prepareRecipe();
    }
}
