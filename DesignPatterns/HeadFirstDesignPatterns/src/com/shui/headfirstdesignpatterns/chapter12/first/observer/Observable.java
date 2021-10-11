package com.shui.headfirstdesignpatterns.chapter12.first.observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author shui.
 * @date 2021/9/28.
 * @time 19:22.
 */
public class Observable implements QuackObservable {

    ArrayList observers = new ArrayList();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer) iterator.next();
            observer.update(duck);
        }
    }
}
