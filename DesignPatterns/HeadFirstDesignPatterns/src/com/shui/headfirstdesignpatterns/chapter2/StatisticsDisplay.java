package com.shui.headfirstdesignpatterns.chapter2;

import java.util.Observable;

/**
 * @author shui.
 * @date 2021/7/8.
 * @time 11:55.
 */
public class StatisticsDisplay extends ObserverImpl {

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;

    public StatisticsDisplay(Observable observable) {
        super(observable);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            float temp = weatherData.getTemperature();
            tempSum += temp;
            numReadings++;
            if (temp > maxTemp) {
                maxTemp = temp;
            }
            if (temp < minTemp) {
                minTemp = temp;
            }
            display();
        }
    }
}

//public class StatisticsDisplay extends ObserverImpl {
//
//    private float maxTemp = 0.0f;
//    private float minTemp = 200;
//    private float tempSum = 0.0f;
//    private int numReadings;
//
//    public StatisticsDisplay(WeatherData weatherData) {
//        super(weatherData);
//    }
//
//    @Override
//    public void display() {
//        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
//    }
//
//    @Override
//    public void update(float temp, float humidity, float pressure) {
//        tempSum += temp;
//        numReadings++;
//        if (temp > maxTemp) {
//            maxTemp = temp;
//        }
//        if (temp < minTemp) {
//            minTemp = temp;
//        }
//        display();
//    }
//}
