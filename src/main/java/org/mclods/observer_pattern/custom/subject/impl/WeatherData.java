package org.mclods.observer_pattern.custom.subject.impl;

import org.mclods.observer_pattern.custom.observers.Observer;
import org.mclods.observer_pattern.custom.subject.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private double temperature;
    private double humidity;
    private double pressure;
    private final ArrayList<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
