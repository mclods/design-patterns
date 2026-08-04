package org.mclods.abstract_factory_pattern.creators.impl;

import org.mclods.abstract_factory_pattern.creators.PizzaStore;
import org.mclods.abstract_factory_pattern.ingredient_factories.PizzaIngredientFactory;
import org.mclods.abstract_factory_pattern.ingredient_factories.impl.CaliforniaPizzaIngredientFactory;
import org.mclods.abstract_factory_pattern.products.Pizza;
import org.mclods.abstract_factory_pattern.products.impl.CheesePizza;
import org.mclods.abstract_factory_pattern.products.impl.ClamPizza;
import org.mclods.abstract_factory_pattern.products.impl.PepperoniPizza;
import org.mclods.abstract_factory_pattern.products.impl.VeggiePizza;

import java.util.Optional;

public class CaliforniaPizzaStore extends PizzaStore {
    private final PizzaIngredientFactory factory = new CaliforniaPizzaIngredientFactory();

    @Override
    public Optional<Pizza> createPizza(String type) {
        return Optional.ofNullable(
                switch (type.toLowerCase()) {
                    case "cheese" -> new CheesePizza("California Style Cheese Pizza", factory);
                    case "veggie" -> new VeggiePizza("California Style Veggie Pizza", factory);
                    case "pepperoni" -> new PepperoniPizza("California Style Pepperoni Pizza", factory);
                    case "clam" -> new ClamPizza("California Style Clam Pizza", factory);
                    default -> null;
                }
        );
    }
}
