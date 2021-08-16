package com.shui.headfirstdesignpatterns.chapter8.second;

/**
 * @author shui.
 * @date 2021/8/11.
 * @time 09:47.
 */
class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
