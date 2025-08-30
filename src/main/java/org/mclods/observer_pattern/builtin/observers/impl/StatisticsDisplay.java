package org.mclods.observer_pattern.builtin.observers.impl;

import org.mclods.observer_pattern.builtin.observers.DisplayElement;
import org.mclods.observer_pattern.builtin.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private double avgTemperature = 0,
            avgHumidity = 0,
            avgPressure = 0;

    private int numTemperatureReadings = 0,
            numHumidityReadings = 0,
            numPressureReadings = 0;

    public StatisticsDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData weatherData) {
            double temperature = weatherData.getTemperature();
            double humidity = weatherData.getHumidity();
            double pressure = weatherData.getPressure();

            avgTemperature = (avgTemperature * numTemperatureReadings + temperature) / (++numTemperatureReadings);
            avgHumidity = (avgHumidity * numHumidityReadings + humidity) / (++numHumidityReadings);
            avgPressure = (avgPressure * numPressureReadings + pressure) / (++numPressureReadings);

            display();
        }
    }

    @Override
    public void display() {
        System.out.printf("Average conditions: %f °C, %f humidity, %f hPa", avgTemperature, avgHumidity, avgPressure);
        System.out.println();
    }
}
