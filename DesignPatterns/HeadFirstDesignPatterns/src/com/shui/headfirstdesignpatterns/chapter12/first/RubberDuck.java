package com.shui.headfirstdesignpatterns.chapter12.first;

import com.shui.headfirstdesignpatterns.chapter12.first.observer.Observable;
import com.shui.headfirstdesignpatterns.chapter12.first.observer.Observer;

/**
 * @author shui.
 * @date 2021/9/28.
 * @time 17:24.
 */
public class RubberDuck implements Quackable {

    Observable observable;

    public RubberDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
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
