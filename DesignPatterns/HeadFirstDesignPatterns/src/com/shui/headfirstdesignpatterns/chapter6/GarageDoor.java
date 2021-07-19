package com.shui.headfirstdesignpatterns.chapter6;

/**
 * @author shui.
 * @date 2021/7/16.
 * @time 14:18.
 */
public class GarageDoor {

    private String location;

    public GarageDoor() {
    }

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {}
    public void down() {}
    public void stop() {}
    public void lightOn() {
        System.out.println("Garage Door light on");
    }
    public void lightOff() {}
}
