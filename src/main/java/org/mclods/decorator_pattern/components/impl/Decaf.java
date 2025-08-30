package org.mclods.decorator_pattern.components.impl;

import org.mclods.decorator_pattern.components.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        super("Decaf Coffee");
    }

    @Override
    public double cost() {
        return 3.75;
    }
}
