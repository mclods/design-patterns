package org.mclods.factory_pattern.creator.impl;

import org.mclods.factory_pattern.creator.PizzaStore;
import org.mclods.factory_pattern.product.Pizza;
import org.mclods.factory_pattern.product.impl.NYStyleCheesePizza;
import org.mclods.factory_pattern.product.impl.NYStyleClamPizza;
import org.mclods.factory_pattern.product.impl.NYStylePepperoniPizza;
import org.mclods.factory_pattern.product.impl.NYStyleVeggiePizza;

import java.util.Optional;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    public Optional<Pizza> createPizza(String type) {
        return Optional.ofNullable(
                switch (type.toLowerCase()) {
                    case "cheese" -> new NYStyleCheesePizza();
                    case "clam" -> new NYStyleClamPizza();
                    case "pepperoni" -> new NYStylePepperoniPizza();
                    case "veggie" -> new NYStyleVeggiePizza();
                    default -> null;
                });
    }
}
