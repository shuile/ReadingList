package com.shui.headfirstdesignpatterns.chapter9.first;

import java.util.ArrayList;

/**
 * @author shui.
 * @date 2021/8/17.
 * @time 17:20.
 */
public class Waitress {
    public void printMenu1() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();

        DinerMenu dinerMenu = new DinerMenu();
        MenuItem[] lunchItems = dinerMenu.getMenuItems();

        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem menuItem = (MenuItem) breakfastItems.get(i);
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }
        for (int i = 0; i < lunchItems.length; i++) {
            MenuItem menuItem = lunchItems[i];
            System.out.print(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription());
        }
    }

    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu2() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu2(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu2(dinerIterator);
    }

    private void printMenu2(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
