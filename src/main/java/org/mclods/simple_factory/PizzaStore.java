package org.mclods.simple_factory;

import org.mclods.simple_factory.product.Pizza;

import java.util.Optional;

public class PizzaStore {
    public Optional<Pizza> orderPizza(String type) {
        Optional<Pizza> op = SimplePizzaFactory.createPizza(type);

        op.ifPresent(pizza -> {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        });

        return op;
    }
}
