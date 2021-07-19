package com.shui.headfirstdesignpatterns.chapter6;

/**
 * @author shui.
 * @date 2021/7/16.
 * @time 14:59.
 */
public class CeilingFanOnCommand implements Command {

    private CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.high();
    }

    @Override
    public void undo() {

    }
}
