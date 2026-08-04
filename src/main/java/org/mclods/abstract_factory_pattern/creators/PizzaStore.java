package org.mclods.abstract_factory_pattern.creators;

import org.mclods.abstract_factory_pattern.products.Pizza;

import java.util.Optional;

public abstract class PizzaStore {
    public abstract Optional<Pizza> createPizza(String type);

    public Optional<Pizza> orderPizza(String type) {
        Optional<Pizza> op = createPizza(type);

        op.ifPresent(pizza -> {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        });

        return op;
    }
}
