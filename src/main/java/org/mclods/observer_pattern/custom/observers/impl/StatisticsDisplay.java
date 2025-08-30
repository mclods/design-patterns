package org.mclods.observer_pattern.custom.observers.impl;

import org.mclods.observer_pattern.custom.observers.DisplayElement;
import org.mclods.observer_pattern.custom.observers.Observer;
import org.mclods.observer_pattern.custom.subject.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {
    private double avgTemperature = 0,
            avgHumidity = 0,
            avgPressure = 0;

    private int numTemperatureReadings = 0,
            numHumidityReadings = 0,
            numPressureReadings = 0;

    public StatisticsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Average conditions: %f °C, %f humidity, %f hPa", avgTemperature, avgHumidity, avgPressure);
        System.out.println();
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        avgTemperature = (avgTemperature * numTemperatureReadings + temperature) / (++numTemperatureReadings);
        avgHumidity = (avgHumidity * numHumidityReadings + humidity) / (++numHumidityReadings);
        avgPressure = (avgPressure * numPressureReadings + pressure) / (++numPressureReadings);

        display();
    }

    public void removeDisplay(Subject weatherData) {
        weatherData.removeObserver(this);
    }
}
