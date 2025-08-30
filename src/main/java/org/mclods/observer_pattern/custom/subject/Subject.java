package org.mclods.observer_pattern.custom.subject;

import org.mclods.observer_pattern.custom.observers.Observer;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
