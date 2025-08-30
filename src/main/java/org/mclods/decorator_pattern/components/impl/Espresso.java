package org.mclods.decorator_pattern.components.impl;

import org.mclods.decorator_pattern.components.Beverage;

public class Espresso extends Beverage {
    public Espresso() {
        super("Espresso");
    }

    @Override
    public double cost() {
        return 3.76;
    }
}
