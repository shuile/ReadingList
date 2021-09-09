package com.shui.headfirstdesignpatterns.chapter10.second;

/**
 * @author shui.
 * @date 2021/8/25.
 * @time 17:26.
 */
public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}
