package com.shui.headfirstdesignpatterns.chapter6;

/**
 * @author shui.
 * @date 2021/7/16.
 * @time 14:20.
 */
public class Stereo {

    private String location;

    public Stereo() {
    }

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " stereo is on");
    }
    public void off() {
        System.out.println(location + " stereo is off");
    }
    public void setCd() {
        System.out.println(location + " stereo is set for CD input");
    }
    public void setDvd() {}
    public void setRadio() {}
    public void setVolume() {
        System.out.println(location + " stereo volume set to l1");
    }
}
