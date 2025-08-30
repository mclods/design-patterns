package org.mclods.observer_pattern.custom.subject;

import org.mclods.observer_pattern.custom.observers.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
