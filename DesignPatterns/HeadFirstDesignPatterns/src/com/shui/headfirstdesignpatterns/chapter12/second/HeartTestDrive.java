package com.shui.headfirstdesignpatterns.chapter12.second;

/**
 * @author shui.
 * @date 2021/9/29.
 * @time 11:21.
 */
public class HeartTestDrive {
    public static void main(String[] args) {
        HeartModel heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }
}
