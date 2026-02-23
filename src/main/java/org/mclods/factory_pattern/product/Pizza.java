package org.mclods.factory_pattern.product;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings;

    public Pizza() {
        toppings = new ArrayList<>();
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings...");
        toppings.forEach(topping -> System.out.println("* " + topping));
        System.out.println();
    }

    public void bake() {
        System.out.println("Baking for 25 minutes at 350");
        System.out.println();
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
        System.out.println();
    }

    public void box() {
        System.out.println("Placing pizza in official PizzaStore box");
        System.out.println();
    }

    public String getName() {
        return name;
    }
}
