package org.mclods.factory_method_pattern.products.impl;

import org.mclods.factory_method_pattern.products.Pizza;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        name = "NY Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Uncooked, Herb-Seasoned Red Sauce";

        toppings.add("Mozzarella Cheese");
        toppings.add("Yellow Onions");
        toppings.add("Thin Sliced Bell Peppers");
        toppings.add("Sliced Black Olives");
    }
}
