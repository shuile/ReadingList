package com.shui.headfirstdesignpatterns.chapter9.forth;

import java.util.Iterator;

/**
 * @author shui.
 * @date 2021/8/20.
 * @time 15:14.
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
