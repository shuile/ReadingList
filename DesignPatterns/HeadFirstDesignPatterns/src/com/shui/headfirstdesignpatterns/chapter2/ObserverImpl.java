package com.shui.headfirstdesignpatterns.chapter2;

import java.util.Observable;
import java.util.Observer;

/**
 * @author shui.
 * @date 2021/7/8.
 * @time 11:57.
 */
public abstract class ObserverImpl implements Observer, DisplayElement {
    private Observable observable;

    public ObserverImpl(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
}

//public abstract class ObserverImpl implements Observer, DisplayElement {
//
//    private WeatherData weatherData;
//
//    public ObserverImpl(WeatherData weatherData) {
//        this.weatherData = weatherData;
//        weatherData.registerObserver(this);
//    }
//}
