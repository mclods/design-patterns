package org.mclods.abstract_factory_pattern.ingredient_factories;

import org.mclods.abstract_factory_pattern.ingredients.*;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggie[] createVeggies();
    Pepperoni createPepperoni();
    Clam createClam();
}
