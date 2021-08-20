package com.shui.headfirstdesignpatterns.chapter9.first;

/**
 * @author shui.
 * @date 2021/8/17.
 * @time 17:49.
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        waitress.printMenu2();
    }
}
