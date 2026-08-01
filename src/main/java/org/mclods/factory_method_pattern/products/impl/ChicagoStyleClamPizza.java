package org.mclods.factory_method_pattern.products.impl;

import org.mclods.factory_method_pattern.products.Pizza;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        name = "Chicago Style Clam Pizza";
        dough = "Deep Dish Crust";
        sauce = "Creamy Garlic White Sauce";

        toppings.add("Sliced Mozzarella");
        toppings.add("Chopped Sea Clams");
    }
}
