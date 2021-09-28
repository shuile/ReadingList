package com.shui.headfirstdesignpatterns.chapter11;

/**
 * @author shui.
 * @date 2021/9/26.
 * @time 14:06.
 */
public class GumballMonitor {
    GumballMachine machine;

    public GumballMonitor(GumballMachine machine) {
        this.machine = machine;
    }

    public void report() {
        System.out.println("Gumball Machine: " + machine.getLocation());
        System.out.println("Current inventory: " + machine.getCount() + " gumballs");
        System.out.println("Current State: " + machine.getState());
    }
}
