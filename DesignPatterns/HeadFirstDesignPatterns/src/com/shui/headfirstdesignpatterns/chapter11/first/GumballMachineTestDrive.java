package com.shui.headfirstdesignpatterns.chapter11.first;

import java.rmi.Naming;

/**
 * @author shui.
 * @date 2021/9/27.
 * @time 23:00.
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachineRemote gumballMachine = null;
        int count;
        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine(args[0], count);
            Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
