package org.mclods.strategy_pattern.behaviors.flyBehaviors.impl;

import org.mclods.strategy_pattern.behaviors.flyBehaviors.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
