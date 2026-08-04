package org.mclods.abstract_factory_pattern.products.impl;

import org.mclods.abstract_factory_pattern.ingredient_factories.PizzaIngredientFactory;
import org.mclods.abstract_factory_pattern.products.Pizza;

public class PepperoniPizza extends Pizza {
    private final PizzaIngredientFactory factory;

    public PepperoniPizza(String name, PizzaIngredientFactory factory) {
        super(name);
        this.factory = factory;
    }

    @Override
    public void prepare() {
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
        pepperoni = factory.createPepperoni();

        System.out.printf("Preparing %s\n", name);
        System.out.printf("Tossing %s...\n", dough.getName());
        System.out.printf("Adding %s...\n", sauce.getName());
        System.out.printf("Adding %s...\n", cheese.getName());
        System.out.printf("Adding %s...\n", pepperoni.getName());
        System.out.println();
    }
}
