package org.mclods.factory_pattern.creator.impl;

import org.mclods.factory_pattern.creator.PizzaStore;
import org.mclods.factory_pattern.product.Pizza;
import org.mclods.factory_pattern.product.impl.ChicagoStyleCheesePizza;
import org.mclods.factory_pattern.product.impl.ChicagoStyleClamPizza;
import org.mclods.factory_pattern.product.impl.ChicagoStylePepperoniPizza;
import org.mclods.factory_pattern.product.impl.ChicagoStyleVeggiePizza;

import java.util.Optional;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    public Optional<Pizza> createPizza(String type) {
        return Optional.ofNullable(
                switch (type.toLowerCase()) {
                    case "cheese" -> new ChicagoStyleCheesePizza();
                    case "clam" -> new ChicagoStyleClamPizza();
                    case "pepperoni" -> new ChicagoStylePepperoniPizza();
                    case "veggie" -> new ChicagoStyleVeggiePizza();
                    default -> null;
                });
    }
}
