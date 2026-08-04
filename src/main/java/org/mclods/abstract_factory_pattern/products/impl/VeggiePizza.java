package org.mclods.abstract_factory_pattern.products.impl;

import org.mclods.abstract_factory_pattern.ingredient_factories.PizzaIngredientFactory;
import org.mclods.abstract_factory_pattern.ingredients.Veggie;
import org.mclods.abstract_factory_pattern.products.Pizza;

public class VeggiePizza extends Pizza {
    private final PizzaIngredientFactory factory;

    public VeggiePizza(String name, PizzaIngredientFactory factory) {
        super(name);
        this.factory = factory;
    }

    @Override
    public void prepare() {
        dough = factory.createDough();
        sauce = factory.createSauce();
        cheese = factory.createCheese();
        veggies = factory.createVeggies();

        System.out.printf("Preparing %s\n", name);
        System.out.printf("Tossing %s...\n", dough.getName());
        System.out.printf("Adding %s...\n", sauce.getName());
        System.out.printf("Adding %s...\n", cheese.getName());
        System.out.println("Adding veggies...");
        for(Veggie veggie: veggies) {
            System.out.printf("* %s\n", veggie.getName());
        }
        System.out.println();
    }
}
