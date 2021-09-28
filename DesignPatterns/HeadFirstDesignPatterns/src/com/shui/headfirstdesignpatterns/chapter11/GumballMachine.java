package com.shui.headfirstdesignpatterns.chapter11;

/**
 * @author shui.
 * @date 2021/9/26.
 * @time 13:51.
 */
public class GumballMachine extends com.shui.headfirstdesignpatterns.chapter10.second.GumballMachine {
    String location;

    public GumballMachine(String location, int count) {
        super(count);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}
