package com.shui.headfirstdesignpatterns.chapter6;

import java.util.Arrays;

/**
 * @author shui.
 * @date 2021/7/19.
 * @time 19:44.
 */
public class RemoteControlWithUndo {
    private Command[] onCommand;
    private Command[] offCommand;
    private Command undoCommand;

    public RemoteControlWithUndo() {
        onCommand = new Command[7];
        offCommand = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommand[i] = noCommand;
            offCommand[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommand[slot] = onCommand;
        this.offCommand[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommand[slot].execute();
        undoCommand = onCommand[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommand[slot].execute();
        undoCommand = offCommand[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        return "RemoteControlWithUndo{" +
                "onCommand=" + Arrays.toString(onCommand) +
                ", offCommand=" + Arrays.toString(offCommand) +
                ", undoCommand=" + undoCommand +
                '}';
    }
}
