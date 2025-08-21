package org.mclods.observer_pattern.subject;

import org.mclods.observer_pattern.observers.Observer;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
