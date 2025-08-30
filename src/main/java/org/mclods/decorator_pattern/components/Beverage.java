package org.mclods.decorator_pattern.components;

public abstract class Beverage {
    private final String description;

    public Beverage(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
