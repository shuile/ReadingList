package com.shui.headfirstdesignpatterns.chapter11.first;

import java.rmi.RemoteException;

/**
 * @author shui.
 * @date 2021/9/27.
 * @time 23:06.
 */
public class GumballMonitor {
    GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void report() {
        try {
            System.out.println("Gumball Machine: " + machine.getLocation());
            System.out.println("Current inventory: " + machine.getCount() + " gumballs");
            System.out.println("Current state: " + machine.getState());
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }
    }
}
