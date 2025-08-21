package org.mclods.strategy_pattern;

import org.mclods.strategy_pattern.clients.Duck;
import org.mclods.strategy_pattern.clients.impl.MallardDuck;
import org.mclods.strategy_pattern.clients.impl.RubberDuck;

public class MiniDuckSimulator {
    public static void run() {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.performQuack();
        rubberDuck.performFly();
    }
}
