package com.shui.headfirstdesignpatterns.chapter11.first;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author shui.
 * @date 2021/9/27.
 * @time 22:58.
 */
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

    private int count;
    private State state;
    private String location;

    public GumballMachine(String location, int numberGumballs) throws RemoteException {
        this.location = location;
        this.count = numberGumballs;
    }

    @Override
    public int getCount() throws RemoteException {
        return count;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public State getState() throws RemoteException {
        return state;
    }
}
