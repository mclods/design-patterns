package org.mclods.factory_method_pattern.products.impl;

import org.mclods.factory_method_pattern.products.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Pepperoni Pizza";
        dough = "Deep Dish Crust";
        sauce = "Crushed Tomato Sauce";

        toppings.add("Sliced Mozzarella");
        toppings.add("Pepperoni");
        toppings.add("Minced Garlic");
        toppings.add("Grated Parmesan");
    }
}
