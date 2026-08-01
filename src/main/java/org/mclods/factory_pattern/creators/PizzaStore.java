package org.mclods.factory_pattern.creators;

import org.mclods.factory_pattern.products.Pizza;

import java.util.Optional;

public abstract class PizzaStore {
    public final Optional<Pizza> orderPizza(String type) {
        Optional<Pizza> op = createPizza(type);

        op.ifPresent(pizza -> {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        });

        return op;
    }

    public abstract Optional<Pizza> createPizza(String type);
}
