package com.shui.headfirstdesignpatterns.chapter11;

/**
 * @author shui.
 * @date 2021/9/26.
 * @time 17:26.
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        args = new String[]{"Seattle", "112"};
        int count = 0;
        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }
        count = Integer.parseInt(args[1]);
        GumballMachine gumballMachine = new GumballMachine(args[0], count);
        GumballMonitor monitor = new GumballMonitor(gumballMachine);
        monitor.report();
    }
}
