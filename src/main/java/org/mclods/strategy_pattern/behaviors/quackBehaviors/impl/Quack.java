package org.mclods.strategy_pattern.behaviors.quackBehaviors.impl;

import org.mclods.strategy_pattern.behaviors.quackBehaviors.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack! Quack!");
    }
}
