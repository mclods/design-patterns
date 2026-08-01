package org.mclods.factory_method_pattern.products.impl;

import org.mclods.factory_method_pattern.products.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Crushed Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Thick Cut Onions");
        toppings.add("Chunky Green Bell Peppers");
        toppings.add("Black Olives");
    }
}
