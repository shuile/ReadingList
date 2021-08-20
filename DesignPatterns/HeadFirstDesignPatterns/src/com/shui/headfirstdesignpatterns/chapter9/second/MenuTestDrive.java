package com.shui.headfirstdesignpatterns.chapter9.second;

/**
 * @author shui.
 * @date 2021/8/19.
 * @time 19:04.
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);

        waitress.printMenu();
    }
}
