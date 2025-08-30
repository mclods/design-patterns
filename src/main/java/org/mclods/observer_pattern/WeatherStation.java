package org.mclods.observer_pattern;

import org.mclods.observer_pattern.builtin.observers.impl.CurrentConditionsDisplay;
import org.mclods.observer_pattern.builtin.observers.impl.StatisticsDisplay;
import org.mclods.observer_pattern.builtin.subject.WeatherData;

public class WeatherStation {
    public static void run() {
        // Custom Observer Pattern Implementation
//        WeatherData weatherData = new WeatherData();
//
//        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//
//        weatherData.setMeasurements(30.0, 65.0, 30.4);
//        weatherData.setMeasurements(28.0, 70.0, 29.2);

        // Built-in Observer Pattern Implementation
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(43.0, 67.0, 32.1);
        weatherData.setMeasurements(25.7, 90.0, 29.2);
    }
}
