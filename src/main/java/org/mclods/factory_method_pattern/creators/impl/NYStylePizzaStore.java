package org.mclods.factory_method_pattern.creators.impl;

import org.mclods.factory_method_pattern.creators.PizzaStore;
import org.mclods.factory_method_pattern.products.Pizza;
import org.mclods.factory_method_pattern.products.impl.NYStyleCheesePizza;
import org.mclods.factory_method_pattern.products.impl.NYStyleClamPizza;
import org.mclods.factory_method_pattern.products.impl.NYStylePepperoniPizza;
import org.mclods.factory_method_pattern.products.impl.NYStyleVeggiePizza;

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
