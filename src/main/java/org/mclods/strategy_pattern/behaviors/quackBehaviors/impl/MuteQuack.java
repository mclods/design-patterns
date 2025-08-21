package org.mclods.strategy_pattern.behaviors.quackBehaviors.impl;

import org.mclods.strategy_pattern.behaviors.quackBehaviors.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I can't quack!");
    }
}
