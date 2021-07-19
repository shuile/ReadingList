package com.shui.headfirstdesignpatterns.chapter6;

/**
 * @author shui.
 * @date 2021/7/16.
 * @time 14:21.
 */
public class Hottub {

    private String location;

    public Hottub() {
    }

    public Hottub(String location) {
        this.location = location;
    }

    public void circulate() {}
    public void jetsOn() {
        System.out.println("Hottub is bubbling!");
    }
    public void jetsOff() {
        System.out.println("Hottub is cooling to 98 degrees");
    }
    public void setTemperature() {
        System.out.println("Hottub is heating to a steaming 104 degrees");
    }
}
