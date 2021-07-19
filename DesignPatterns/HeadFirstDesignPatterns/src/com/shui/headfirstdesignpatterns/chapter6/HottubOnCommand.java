package com.shui.headfirstdesignpatterns.chapter6;

/**
 * @author shui.
 * @date 2021/7/19.
 * @time 22:32.
 */
public class HottubOnCommand implements Command {

    private Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.setTemperature();
        hottub.jetsOn();
    }

    @Override
    public void undo() {

    }
}
