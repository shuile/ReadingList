package com.shui.headfirstdesignpatterns.chapter2;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
