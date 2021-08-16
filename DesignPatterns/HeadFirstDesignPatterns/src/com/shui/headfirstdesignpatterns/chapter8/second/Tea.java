package com.shui.headfirstdesignpatterns.chapter8.second;

/**
 * @author shui.
 * @date 2021/8/11.
 * @time 09:46.
 */
class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
