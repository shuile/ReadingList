package com.shui.headfirstdesignpatterns.chapter7.home_theater;

/**
 * @author shui.
 * @date 2021/8/9.
 * @time 13:41.
 */
public class PopcornPopper {

    public void on() {
        LogUtils.println("Popcorn Popper on");
    }

    public void off() {
        LogUtils.println("Popcorn Popper off");
    }

    public void pop() {
        LogUtils.println("Popcorn Popper popping popcorn!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
