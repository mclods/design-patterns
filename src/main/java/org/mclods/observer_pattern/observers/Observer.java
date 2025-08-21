package org.mclods.observer_pattern.observers;

public interface Observer {
    public void update(double temperature, double humidity, double pressure);
}
