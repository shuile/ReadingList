package com.shui.headfirstdesignpatterns.chapter9.third;

import com.shui.headfirstdesignpatterns.chapter9.first.MenuItem;
import com.shui.headfirstdesignpatterns.chapter9.second.Menu;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author shui.
 * @date 2021/8/19.
 * @time 19:51.
 */
public class Waitress {
    ArrayList menu;

    public Waitress(ArrayList menu) {
        this.menu = menu;
    }

    public void printMenu() {
        Iterator iterator = menu.iterator();
        while (iterator.hasNext()) {
            Menu menu = (Menu) iterator.next();
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
