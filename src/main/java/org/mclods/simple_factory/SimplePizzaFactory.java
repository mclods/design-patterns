package org.mclods.simple_factory;

import org.mclods.simple_factory.product.Pizza;
import org.mclods.simple_factory.product.impl.CheesePizza;
import org.mclods.simple_factory.product.impl.ClamPizza;
import org.mclods.simple_factory.product.impl.PepperoniPizza;
import org.mclods.simple_factory.product.impl.VeggiePizza;

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
