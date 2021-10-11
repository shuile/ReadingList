package com.shui.headfirstdesignpatterns.chapter12.second;

/**
 * @author shui.
 * @date 2021/9/29.
 * @time 11:13.
 */
public class DJTestDrive {
    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
