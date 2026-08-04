package org.mclods.factory_method_pattern.creators.impl;

import org.mclods.factory_method_pattern.creators.PizzaStore;
import org.mclods.factory_method_pattern.products.Pizza;
import org.mclods.factory_method_pattern.products.impl.ChicagoStyleCheesePizza;
import org.mclods.factory_method_pattern.products.impl.ChicagoStyleClamPizza;
import org.mclods.factory_method_pattern.products.impl.ChicagoStylePepperoniPizza;
import org.mclods.factory_method_pattern.products.impl.ChicagoStyleVeggiePizza;

import java.util.Optional;

public class ChicagoPizzaStore extends PizzaStore {

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
