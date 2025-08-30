package org.mclods.observer_pattern.builtin.observers.impl;

import org.mclods.observer_pattern.builtin.observers.DisplayElement;
import org.mclods.observer_pattern.builtin.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private double temperature;
    private double humidity;
    private double pressure;

    public CurrentConditionsDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData weatherData) {
            temperature = weatherData.getTemperature();
            humidity = weatherData.getHumidity();
            pressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.printf("Current conditions: %f °C, %f humidity, %f hPa", temperature, humidity, pressure);
        System.out.println();
    }
}
