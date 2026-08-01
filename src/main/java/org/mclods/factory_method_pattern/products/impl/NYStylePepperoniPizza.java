package org.mclods.factory_method_pattern.products.impl;

import org.mclods.factory_method_pattern.products.Pizza;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        name = "NY Style Pepperoni Pizza";
        dough = "Thin Crust Dough";
        sauce = "NY Style Red Sauce";

        toppings.add("Pepperoni");
        toppings.add("Parmesan Cheese");
        toppings.add("Dried Oregano");
    }
}
