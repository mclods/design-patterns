package org.mclods.abstract_factory_pattern.creators.impl;

import org.mclods.abstract_factory_pattern.creators.PizzaStore;
import org.mclods.abstract_factory_pattern.ingredient_factories.PizzaIngredientFactory;
import org.mclods.abstract_factory_pattern.ingredient_factories.impl.ChicagoPizzaIngredientFactory;
import org.mclods.abstract_factory_pattern.products.Pizza;
import org.mclods.abstract_factory_pattern.products.impl.CheesePizza;
import org.mclods.abstract_factory_pattern.products.impl.ClamPizza;
import org.mclods.abstract_factory_pattern.products.impl.PepperoniPizza;
import org.mclods.abstract_factory_pattern.products.impl.VeggiePizza;

import java.util.Optional;

public class ChicagoPizzaStore extends PizzaStore {
    private final PizzaIngredientFactory factory = new ChicagoPizzaIngredientFactory();

    @Override
    public Optional<Pizza> createPizza(String type) {
        return Optional.ofNullable(
                switch (type.toLowerCase()) {
                    case "cheese" -> new CheesePizza("Chicago Deep Dish Cheese Pizza", factory);
                    case "veggie" -> new VeggiePizza("Chicago Deep Dish Veggie Pizza", factory);
                    case "pepperoni" -> new PepperoniPizza("Chicago Deep Dish Pepperoni Pizza", factory);
                    case "clam" -> new ClamPizza("Chicago Deep Dish Clam Pizza", factory);
                    default -> null;
                }
        );
    }
}
