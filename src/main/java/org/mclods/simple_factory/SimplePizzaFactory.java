package org.mclods.simple_factory;

import org.mclods.simple_factory.product.Pizza;
import org.mclods.simple_factory.product.impl.CheesePizza;
import org.mclods.simple_factory.product.impl.ClamPizza;
import org.mclods.simple_factory.product.impl.PepperoniPizza;
import org.mclods.simple_factory.product.impl.VeggiePizza;

import java.util.Optional;

public class SimplePizzaFactory {
    public static Optional<Pizza> createPizza(String type) {
        return Optional.ofNullable(
                switch (type.toLowerCase()) {
                    case "cheese" -> new CheesePizza();
                    case "pepperoni" -> new PepperoniPizza();
                    case "clam" -> new ClamPizza();
                    case "veggie" -> new VeggiePizza();
                    default -> null;
                });
    }
}
