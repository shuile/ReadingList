package com.shui.headfirstdesignpatterns.chapter11.first;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author shui.
 * @date 2021/9/27.
 * @time 22:54.
 */
public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public State getState() throws RemoteException;
}
