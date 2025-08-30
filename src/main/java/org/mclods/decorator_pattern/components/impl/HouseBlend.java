package org.mclods.decorator_pattern.components.impl;

import org.mclods.decorator_pattern.components.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        super("House Blend Coffee");
    }

    @Override
    public double cost() {
        return 9.49;
    }
}
