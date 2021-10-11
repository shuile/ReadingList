package com.shui.headfirstdesignpatterns.chapter12.second;

/**
 * @author shui.
 * @date 2021/9/28.
 * @time 19:58.
 */
public interface BeatModelInterface {
    void initialize();

    void on();

    void off();

    void setBPM(int bpm);

    int getBPM();

    void registerObserver(BeatObserver o);

    void removeObserver(BeatObserver o);

    void registerObserver(BPMObserver o);

    void removeObserver(BPMObserver o);
}
