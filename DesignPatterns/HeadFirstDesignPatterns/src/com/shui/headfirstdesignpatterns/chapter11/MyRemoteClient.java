package com.shui.headfirstdesignpatterns.chapter11;

import java.rmi.Naming;

/**
 * @author shui.
 * @date 2021/9/27.
 * @time 22:36.
 */
public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            String s = service.sayHello();
            System.out.println(s);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
