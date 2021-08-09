package com.shui.headfirstdesignpatterns.chapter7;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author shui.
 * @date 2021/8/9.
 * @time 11:49.
 */
public class EnumerationIterator implements Iterator {

    Enumeration enumeration;

    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
