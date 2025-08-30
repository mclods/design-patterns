package org.mclods.decorator_pattern.components.decorators;

import org.mclods.decorator_pattern.components.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public CondimentDecorator(String description) {
        super(description);
    }
}
