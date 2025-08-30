package org.mclods.decorator_pattern.components.impl;

import org.mclods.decorator_pattern.components.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        super("Dark Roast Coffee");
    }

    @Override
    public double cost() {
        return 3.97;
    }
}
