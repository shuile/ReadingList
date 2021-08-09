package com.shui.headfirstdesignpatterns.chapter7.home_theater;

/**
 * @author shui.
 * @date 2021/8/9.
 * @time 13:42.
 */
public class Projector {
    DvdPlayer dvdPlayer;

    public Projector(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public void on() {
        LogUtils.println("Top-O-Line Projector on");
    }

    public void off() {
        LogUtils.println("Top-O-Line Projector off");
    }

    public void tvMode() {}

    public void wideScreenMode() {
        LogUtils.println("Top-O-Line Projector in widescreen mode (16x9 aspect ratio)");
    }

    @Override
    public String toString() {
        return "Projector{" +
                "dvdPlayer=" + dvdPlayer +
                '}';
    }
}
