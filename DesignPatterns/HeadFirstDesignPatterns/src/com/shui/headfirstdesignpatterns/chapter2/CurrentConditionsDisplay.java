package com.shui.headfirstdesignpatterns.chapter2;

import java.util.Observable;

public class CurrentConditionsDisplay extends ObserverImpl {

    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        super(observable);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            temperature = weatherData.getTemperature();
            humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}

//public class CurrentConditionsDisplay extends ObserverImpl {
//
//    private float temperature;
//    private float humidity;
//
//    public CurrentConditionsDisplay(WeatherData weatherData) {
//        super(weatherData);
//    }
//
//    @Override
//    public void display() {
//        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
//    }
//
//    @Override
//    public void update(float temp, float humidity, float pressure) {
//        this.temperature = temp;
//        this.humidity = humidity;
//        display();
//    }
//}
