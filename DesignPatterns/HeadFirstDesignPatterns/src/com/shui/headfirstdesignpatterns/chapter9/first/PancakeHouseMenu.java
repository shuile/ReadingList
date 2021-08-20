package com.shui.headfirstdesignpatterns.chapter9.first;

import java.util.ArrayList;

/**
 * @author shui.
 * @date 2021/8/17.
 * @time 17:05.
 */
public class PancakeHouseMenu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        addItem("K&B's Pancake Breakfast", "Pancake with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancake with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes make with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
