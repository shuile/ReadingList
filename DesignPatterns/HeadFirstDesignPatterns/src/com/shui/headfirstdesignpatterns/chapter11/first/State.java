package com.shui.headfirstdesignpatterns.chapter11.first;

import java.io.Serializable;

/**
 * @author shui.
 * @date 2021/9/27.
 * @time 22:56.
 */
public interface State extends Serializable {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
