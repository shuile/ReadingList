package com.shui.headfirstdesignpatterns.chapter7.home_theater;

/**
 * @author shui.
 * @date 2021/8/9.
 * @time 13:41.
 */
public class DvdPlayer {
    Amplifier amplifier;

    public DvdPlayer(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
        LogUtils.println("Top-O-Line DVD Player on");
    }

    public void off() {
        LogUtils.println("Top-O-Line DVD Player off");
    }

    public void eject() {
        LogUtils.println("Top-O-Line DVD Player eject");
    }

    public void pause() {

    }

    public void play(String movie) {
        LogUtils.println("Top-O-Line DVD Player playing \"" + movie + "\"");
    }

    public void setSurroundAudio() {}

    public void setTwoChannelAudio() {}

    public void stop(String movie) {
        LogUtils.println("Top-O-Line DVD Player stopped \"" + movie + "\"");
    }

    @Override
    public String toString() {
        return "DvdPlayer{" +
                "amplifier=" + amplifier +
                '}';
    }
}
