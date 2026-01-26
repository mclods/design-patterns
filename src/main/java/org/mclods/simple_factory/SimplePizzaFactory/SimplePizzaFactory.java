package org.mclods.simple_factory.SimplePizzaFactory;

import org.mclods.simple_factory.Pizza.Pizza;
import org.mclods.simple_factory.Pizza.impl.CheesePizza;
import org.mclods.simple_factory.Pizza.impl.ClamPizza;
import org.mclods.simple_factory.Pizza.impl.PepperoniPizza;
import org.mclods.simple_factory.Pizza.impl.VeggiePizza;

public class SimplePizzaFactory {
    public static Pizza createPizza(String type) {
        return switch (type.toLowerCase()) {
            case "cheese" -> new CheesePizza();
            case "pepperoni" -> new PepperoniPizza();
            case "clam" -> new ClamPizza();
            case "veggie" -> new VeggiePizza();
            default -> null;
        };
    }
}
