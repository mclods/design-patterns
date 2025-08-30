package org.mclods.decorator_pattern.components.decorators.impl;

import org.mclods.decorator_pattern.components.Beverage;
import org.mclods.decorator_pattern.components.decorators.CondimentDecorator;

public class Whip extends CondimentDecorator {
    private final Beverage beverage;

    public Whip(Beverage beverage) {
        super(beverage.getDescription() + ", Whip");
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
