package org.mclods.observer_pattern.custom.observers.impl;

import org.mclods.observer_pattern.custom.observers.DisplayElement;
import org.mclods.observer_pattern.custom.observers.Observer;
import org.mclods.observer_pattern.custom.subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private double temperature;
    private double humidity;
    private double pressure;

    public CurrentConditionsDisplay(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("Current conditions: %f °C, %f humidity, %f hPa", temperature, humidity, pressure);
        System.out.println();
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }

    public void removeDisplay(Subject weatherData) {
        weatherData.removeObserver(this);
    }
}
