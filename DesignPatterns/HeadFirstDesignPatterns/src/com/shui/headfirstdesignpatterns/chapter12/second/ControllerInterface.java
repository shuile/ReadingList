package com.shui.headfirstdesignpatterns.chapter12.second;

/**
 * @author shui.
 * @date 2021/9/29.
 * @time 11:05.
 */
public interface ControllerInterface {
    void start();
    void stop();
    void increaseBPM();
    void decreaseBPM();
    void setBPM(int bpm);
}
