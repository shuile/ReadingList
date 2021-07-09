package com.shui.headfirstdesignpatterns.chapter3;

/**
 * @author shui.
 * @date 2021/7/8.
 * @time 22:48.
 */
public abstract class Beverage {
    public String description = "Unknown Beverage";

    public SIZE size = SIZE.TALL;

    public enum SIZE {
        TALL, GRANDE, VENATI;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public SIZE getSize() {
        return size;
    }

    public void setSize(SIZE size) {
        this.size = size;
    }
}
