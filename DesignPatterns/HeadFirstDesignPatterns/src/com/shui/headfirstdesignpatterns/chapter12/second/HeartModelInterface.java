package com.shui.headfirstdesignpatterns.chapter12.second;

/**
 * @author shui.
 * @date 2021/9/29.
 * @time 11:19.
 */
public interface HeartModelInterface {
    int getHeartRate();
    void registerBeatObserver();
    void removeBeatObserver();
    void registerBPMObserver();
    void removeBPMObserver();
}
