package com.shui.headfirstdesignpatterns.chapter7.home_theater;

/**
 * @author shui.
 * @date 2021/8/9.
 * @time 13:42.
 */
public class TheaterLights {
    public void on() {
        LogUtils.println("Theater Ceiling Lights on");
    }

    public void off() {
    }

    public void dim(int dims) {
        LogUtils.println("Theater Ceiling Lights dimming to " + dims + "%");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
