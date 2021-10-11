package com.shui.headfirstdesignpatterns.chapter12.first.adapter;

import com.shui.headfirstdesignpatterns.chapter12.first.Goose;
import com.shui.headfirstdesignpatterns.chapter12.first.Quackable;
import com.shui.headfirstdesignpatterns.chapter12.first.observer.Observable;
import com.shui.headfirstdesignpatterns.chapter12.first.observer.Observer;

/**
 * @author shui.
 * @date 2021/9/28.
 * @time 17:29.
 */
public class GooseAdapter implements Quackable {

    Goose goose;
    Observable observable;

    public GooseAdapter() {
        observable = new Observable(this);
    }

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
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
