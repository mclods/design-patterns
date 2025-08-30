package org.mclods.decorator_pattern.components.decorators.impl;

import org.mclods.decorator_pattern.components.Beverage;
import org.mclods.decorator_pattern.components.decorators.CondimentDecorator;

public class Soy extends CondimentDecorator {
    private final Beverage beverage;

    public Soy(Beverage beverage) {
        super(beverage.getDescription() + ", Soy");
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }
}
