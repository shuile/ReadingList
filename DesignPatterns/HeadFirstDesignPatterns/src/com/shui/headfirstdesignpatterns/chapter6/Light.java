package com.shui.headfirstdesignpatterns.chapter6;

/**
 * @author shui.
 * @date 2021/7/16.
 * @time 14:13.
 */
public class Light {

    private String location;

    public Light() {
    }

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " Light is On");
    }

    public void off() {
        System.out.println(location + " Light is Off");
    }
}
