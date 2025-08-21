package org.mclods.strategy_pattern.clients.impl;

import org.mclods.strategy_pattern.behaviors.flyBehaviors.impl.FlyNoWay;
import org.mclods.strategy_pattern.behaviors.quackBehaviors.impl.Squeak;
import org.mclods.strategy_pattern.clients.Duck;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I am a Rubber Duck!");
    }
}
