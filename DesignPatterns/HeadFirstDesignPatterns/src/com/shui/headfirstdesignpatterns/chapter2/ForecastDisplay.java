package com.shui.headfirstdesignpatterns.chapter2;

import java.util.Observable;

/**
 * @author shui.
 * @date 2021/7/8.
 * @time 13:40.
 */
public class ForecastDisplay extends ObserverImpl {

    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        super(observable);
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
}

//public class ForecastDisplay extends ObserverImpl {
//
//    private float currentPressure = 29.92f;
//    private float lastPressure;
//
//    public ForecastDisplay(WeatherData weatherData) {
//        super(weatherData);
//    }
//
//    @Override
//    public void display() {
//        System.out.print("Forecast: ");
//        if (currentPressure > lastPressure) {
//            System.out.println("Improving weather on the way!");
//        } else if (currentPressure == lastPressure) {
//            System.out.println("More of the same");
//        } else if (currentPressure < lastPressure) {
//            System.out.println("Watch out for cooler, rainy weather");
//        }
//    }
//
//    @Override
//    public void update(float temp, float humidity, float pressure) {
//        lastPressure = currentPressure;
//        currentPressure = pressure;
//        display();
//    }
//}
