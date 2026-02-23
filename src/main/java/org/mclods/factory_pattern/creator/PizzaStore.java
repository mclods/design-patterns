package org.mclods.factory_pattern.creator;

import org.mclods.factory_pattern.product.Pizza;

public abstract class PizzaStore {
    public final Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
