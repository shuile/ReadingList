package com.shui.headfirstdesignpatterns.chapter12.first.observer;

/**
 * @author shui.
 * @date 2021/9/28.
 * @time 19:21.
 */
public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
