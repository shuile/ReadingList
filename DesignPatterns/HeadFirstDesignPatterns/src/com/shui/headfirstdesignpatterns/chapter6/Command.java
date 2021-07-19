package com.shui.headfirstdesignpatterns.chapter6;

/**
 * @author shui.
 * @date 2021/7/16.
 * @time 14:11.
 */
public interface Command {
    public void execute();
    public void undo();
}
