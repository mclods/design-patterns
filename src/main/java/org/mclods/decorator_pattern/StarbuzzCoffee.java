package org.mclods.decorator_pattern;

import org.mclods.decorator_pattern.components.Beverage;
import org.mclods.decorator_pattern.components.decorators.impl.Mocha;
import org.mclods.decorator_pattern.components.decorators.impl.Soy;
import org.mclods.decorator_pattern.components.decorators.impl.Whip;
import org.mclods.decorator_pattern.components.impl.DarkRoast;
import org.mclods.decorator_pattern.components.impl.Espresso;
import org.mclods.decorator_pattern.components.impl.HouseBlend;

public class StarbuzzCoffee {
    private static void getDisplay(Beverage beverage) {
        System.out.printf("%s $%.2f%n", beverage.getDescription(), beverage.cost());
    }

    public static void makeEspresso() {
        Beverage beverage = new Espresso();

        getDisplay(beverage);
    }

    public static void makeDarkRoastDoubleMochaWhip() {
        Beverage beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);

        getDisplay(beverage);
    }

    public static void makeHouseBlendSoyMochaWhip() {
        Beverage beverage = new HouseBlend();
        beverage = new Soy(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);

        getDisplay(beverage);
    }
}
