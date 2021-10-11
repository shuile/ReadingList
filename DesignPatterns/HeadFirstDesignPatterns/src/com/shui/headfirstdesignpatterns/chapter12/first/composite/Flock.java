package com.shui.headfirstdesignpatterns.chapter12.first.composite;

import com.shui.headfirstdesignpatterns.chapter12.first.Quackable;
import com.shui.headfirstdesignpatterns.chapter12.first.observer.Observable;
import com.shui.headfirstdesignpatterns.chapter12.first.observer.Observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author shui.
 * @date 2021/9/28.
 * @time 17:50.
 */
public class Flock implements Quackable {

    ArrayList quackers = new ArrayList();
    Observable observable;

    public Flock() {
        observable = new Observable(this);
    }

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
        }
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
