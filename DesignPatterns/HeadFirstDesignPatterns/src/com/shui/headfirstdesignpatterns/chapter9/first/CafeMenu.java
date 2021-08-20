package com.shui.headfirstdesignpatterns.chapter9.first;

import com.shui.headfirstdesignpatterns.chapter9.first.MenuItem;

import java.util.Hashtable;

/**
 * @author shui.
 * @date 2021/8/19.
 * @time 18:56.
 */
public class CafeMenu {
    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("Veggie Burger and Air Fires", "Veggie burger on a whole wheat bun, lettuce, tomato, and fires", true, 3.99);
        addItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69);
        addItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Hashtable getItems() {
        return menuItems;
    }
}
