package com.shui.headfirstdesignpatterns.chapter9.first;

import java.util.ArrayList;

/**
 * @author shui.
 * @date 2021/8/17.
 * @time 17:43.
 */
public class PancakeHouseMenuIterator implements Iterator {

    ArrayList menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size() && menuItems.get(position) != null;
    }

    @Override
    public Object next() {
        return menuItems.get(position++);
    }
}
