package com.shui.headfirstdesignpatterns.chapter11.first;

import com.shui.headfirstdesignpatterns.chapter11.GumballMachine;

/**
 * @author shui.
 * @date 2021/9/27.
 * @time 22:57.
 */
public class NoQuarterState implements State {
    transient GumballMachine gumballMachine;

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }
}
