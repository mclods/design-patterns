package org.mclods.abstract_factory_pattern.ingredient_factories.impl;

import org.mclods.abstract_factory_pattern.ingredient_factories.PizzaIngredientFactory;
import org.mclods.abstract_factory_pattern.ingredients.*;
import org.mclods.abstract_factory_pattern.ingredients.impl.*;

public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new VeryThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new BruschettaSauce();
    }

    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        return new Veggie[] {new ArtichokeHeart(), new RedPepper(), new Arugula()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new ItalianSalumi();
    }

    @Override
    public Clam createClam() {
        return new PacificOyster();
    }
}
