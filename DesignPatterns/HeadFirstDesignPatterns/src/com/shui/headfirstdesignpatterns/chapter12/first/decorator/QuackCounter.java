package com.shui.headfirstdesignpatterns.chapter12.first.decorator;

import com.shui.headfirstdesignpatterns.chapter12.first.Quackable;
import com.shui.headfirstdesignpatterns.chapter12.first.observer.Observable;
import com.shui.headfirstdesignpatterns.chapter12.first.observer.Observer;

/**
 * @author shui.
 * @date 2021/9/28.
 * @time 17:33.
 */
public class QuackCounter implements Quackable {

    Quackable duck;
    static int numberOfQuacks;
    Observable observable;

    public QuackCounter() {
        observable = new Observable(this);
    }

    public QuackCounter(Quackable duck) {
        this.duck = duck;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
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
