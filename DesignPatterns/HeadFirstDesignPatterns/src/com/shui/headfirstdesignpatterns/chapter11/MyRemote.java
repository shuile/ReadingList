package com.shui.headfirstdesignpatterns.chapter11;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author shui.
 * @date 2021/9/27.
 * @time 22:32.
 * 远程接口
 */
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}
