package org.mclods.factory_pattern.product.impl;

import org.mclods.factory_pattern.product.Pizza;

public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        name = "NY Style Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "White Sauce";

        toppings.add("Freshly Chopped Clams");
        toppings.add("Mozzarella Cheese");
        toppings.add("Chopped Parsley");
        toppings.add("Dried Oregano");
    }
}
