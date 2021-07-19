package com.shui.headfirstdesignpatterns.chapter6;

/**
 * @author shui.
 * @date 2021/7/19.
 * @time 22:32.
 */
public class HottubOffCommand implements Command {

    private Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.jetsOff();
    }

    @Override
    public void undo() {
        hottub.setTemperature();
        hottub.jetsOn();
    }
}
