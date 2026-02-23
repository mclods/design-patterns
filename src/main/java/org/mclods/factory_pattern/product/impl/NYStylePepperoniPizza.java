package org.mclods.factory_pattern.product.impl;

import org.mclods.factory_pattern.product.Pizza;

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
