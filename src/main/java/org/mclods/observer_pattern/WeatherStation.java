package org.mclods.observer_pattern;

import org.mclods.observer_pattern.observers.impl.CurrentConditionsDisplay;
import org.mclods.observer_pattern.observers.impl.StatisticsDisplay;
import org.mclods.observer_pattern.subject.impl.WeatherData;

public class WeatherStation {
    public static void run() {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(30.0, 65.0, 30.4);
        weatherData.setMeasurements(28.0, 70.0, 29.2);
    }
}
