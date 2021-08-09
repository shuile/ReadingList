package com.shui.headfirstdesignpatterns.chapter7.home_theater;

/**
 * @author shui.
 * @date 2021/8/9.
 * @time 13:40.
 */
public class Amplifier {

    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;

    public void on() {
        LogUtils.println("Top-O-Line Amplifier on");
    }

    public void off() {
        LogUtils.println("Top-O-Line Amplifier off");
    }

    public void setCd(CdPlayer cd) {
        cdPlayer = cd;
    }

    public void setDvd(DvdPlayer dvd) {
        LogUtils.println("Top-O-Line Amplifier setting DVD player to Top-O-Line DVD Player");
        dvdPlayer = dvd;
    }

    public void setStereoSound() {

    }

    public void setSurroundSound() {
        LogUtils.println("Top-O-Line Amplifier surround sound on (5 speakers, 1 subwoofer)");
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setVolume(int volume) {
        LogUtils.println("Top-O-Line Amplifier setting volume to 5");
    }

    @Override
    public String toString() {
        return "Amplifier{" +
                "tuner=" + tuner +
                ", dvdPlayer=" + dvdPlayer +
                ", cdPlayer=" + cdPlayer +
                '}';
    }
}
