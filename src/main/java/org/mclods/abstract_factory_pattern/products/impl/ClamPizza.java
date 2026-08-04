package org.mclods.abstract_factory_pattern.products.impl;

import org.mclods.abstract_factory_pattern.ingredient_factories.PizzaIngredientFactory;
import org.mclods.abstract_factory_pattern.products.Pizza;

public class ClamPizza extends Pizza {
    private final PizzaIngredientFactory factory;

    public ClamPizza(String name, PizzaIngredientFactory factory) {
        super(name);
        this.factory = factory;
    }

    @Override
    public void prepare() {
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
        clam = factory.createClam();

        System.out.printf("Preparing %s\n", name);
        System.out.printf("Tossing %s...\n", dough.getName());
        System.out.printf("Adding %s...\n", sauce.getName());
        System.out.printf("Adding %s...\n", cheese.getName());
        System.out.printf("Adding %s...\n", cheese.getName());
        System.out.println();
    }
}
