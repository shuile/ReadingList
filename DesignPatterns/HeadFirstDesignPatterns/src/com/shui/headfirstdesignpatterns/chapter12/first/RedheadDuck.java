package com.shui.headfirstdesignpatterns.chapter12.first;

import com.shui.headfirstdesignpatterns.chapter12.first.observer.Observable;
import com.shui.headfirstdesignpatterns.chapter12.first.observer.Observer;

/**
 * @author shui.
 * @date 2021/9/28.
 * @time 17:23.
 */
public class RedheadDuck implements Quackable {

    Observable observable;

    public RedheadDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
