package com.shui.headfirstdesignpatterns.chapter3;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * @author shui.
 * @date 2021/7/9.
 * @time 07:54.
 */
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        double cost = getCost(beverage.cost(), getSizeCost(beverage));
        System.out.println(beverage.getDescription() + " $" + cost);

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        double cost2 = getCost(beverage2.cost(), getSizeCost(beverage2));
        System.out.println(beverage2.getDescription() + " $" + cost2);

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        double cost3 = getCost(beverage3.cost(), getSizeCost(beverage3));
        System.out.println(beverage3.getDescription() + " $" + cost3);
    }

    private static double getSizeCost(Beverage beverage) {
        switch (beverage.getSize()) {
            case TALL:
                return 0.1;
            case GRANDE:
                return 0.15;
            case VENATI:
                return 0.2;
        }
        return 0;
    }

    private static double getCost(double... cost) {
        if (cost.length == 0) {
            return 0;
        }
        BigDecimal[] bigDecimals = new BigDecimal[cost.length];
        for (int i = 0; i < bigDecimals.length; i++) {
            bigDecimals[i] = new BigDecimal(String.valueOf(cost[i]));
        }
        for (int i = 1; i < bigDecimals.length; i++) {
            bigDecimals[0] = bigDecimals[0].add(bigDecimals[i]);
        }
        return bigDecimals[0].doubleValue();
    }
}
