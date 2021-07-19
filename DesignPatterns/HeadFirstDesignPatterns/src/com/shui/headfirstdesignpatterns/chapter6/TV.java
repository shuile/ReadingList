package com.shui.headfirstdesignpatterns.chapter6;

/**
 * @author shui.
 * @date 2021/7/16.
 * @time 14:22.
 */
public class TV {

    private String location;

    public TV() {
    }

    public TV(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " TV is on");
    }
    public void off() {
        System.out.println(location + " TV is off");
    }
    public void setInputChannel() {
        System.out.println(location + " TV channel is set for DVD");
    }
    public void setVolume() {}
}
