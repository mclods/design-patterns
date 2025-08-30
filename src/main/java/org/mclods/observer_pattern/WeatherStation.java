package org.mclods.observer_pattern;

public class WeatherStation {
    public static void runCustomImpl() {
        // Custom Observer Pattern Implementation
        org.mclods.observer_pattern.custom.subject.impl.WeatherData weatherData =
                new org.mclods.observer_pattern.custom.subject.impl.WeatherData();

        org.mclods.observer_pattern.custom.observers.impl.CurrentConditionsDisplay currentDisplay =
                new org.mclods.observer_pattern.custom.observers.impl.CurrentConditionsDisplay(weatherData);
        org.mclods.observer_pattern.custom.observers.impl.StatisticsDisplay statisticsDisplay =
                new org.mclods.observer_pattern.custom.observers.impl.StatisticsDisplay(weatherData);

        weatherData.setMeasurements(30.0, 65.0, 30.4);
        weatherData.setMeasurements(28.0, 70.0, 29.2);
    }

    public static void runBuiltInImpl() {
        // Built-in Observer Pattern Implementation
        org.mclods.observer_pattern.builtin.subject.WeatherData weatherData =
                new org.mclods.observer_pattern.builtin.subject.WeatherData();

        org.mclods.observer_pattern.builtin.observers.impl.CurrentConditionsDisplay currentDisplay =
                new org.mclods.observer_pattern.builtin.observers.impl.CurrentConditionsDisplay(weatherData);
        org.mclods.observer_pattern.builtin.observers.impl.StatisticsDisplay statisticsDisplay =
                new org.mclods.observer_pattern.builtin.observers.impl.StatisticsDisplay(weatherData);

        weatherData.setMeasurements(43.0, 67.0, 32.1);
        weatherData.setMeasurements(25.7, 90.0, 29.2);
    }
}
