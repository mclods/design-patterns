package org.mclods.strategy_pattern.behaviors.flyBehaviors.impl;

import org.mclods.strategy_pattern.behaviors.flyBehaviors.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying with wings!");
    }
}
