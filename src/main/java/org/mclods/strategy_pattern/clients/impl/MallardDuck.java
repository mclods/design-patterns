package org.mclods.strategy_pattern.clients.impl;

import org.mclods.strategy_pattern.behaviors.flyBehaviors.impl.FlyWithWings;
import org.mclods.strategy_pattern.behaviors.quackBehaviors.impl.Quack;
import org.mclods.strategy_pattern.clients.Duck;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a Mallard Duck!");
    }
}
