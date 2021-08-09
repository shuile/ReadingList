package com.shui.headfirstdesignpatterns.chapter7.home_theater;

/**
 * @author shui.
 * @date 2021/8/9.
 * @time 13:41.
 */
public class Screen {

    public void up() {
        LogUtils.println("Theater Screen going up");
    }

    public void down() {
        LogUtils.println("Theater Screen going down");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
