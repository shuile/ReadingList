package com.shui.headfirstdesignpatterns.chapter7.home_theater;

/**
 * @author shui.
 * @date 2021/8/9.
 * @time 13:41.
 */
public class Tuner {
    Amplifier amplifier;

    public Tuner(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    private void on() {}

    private void off() {}

    private void setAm() {}

    private void setFm() {}

    private void setFrequency() {}

    @Override
    public String toString() {
        return "Tuner{" +
                "amplifier=" + amplifier +
                '}';
    }
}
