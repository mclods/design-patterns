package org.mclods.abstract_factory_pattern.products;

import org.mclods.abstract_factory_pattern.ingredients.*;

public abstract class Pizza {
    protected final String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clam clam;
    protected Veggie[] veggies;

    protected Pizza(String name) {
        this.name = name;
    }

    public abstract void prepare();

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("%s made with:\n".formatted(name));

        if(dough != null) {
            sb.append("* %s\n".formatted(dough.getName()));
        }

        if(sauce != null) {
            sb.append("* %s\n".formatted(sauce.getName()));
        }

        if(cheese != null) {
            sb.append("* %s\n".formatted(cheese.getName()));
        }

        if(pepperoni != null) {
            sb.append("* %s\n".formatted(pepperoni.getName()));
        }

        if(clam != null) {
            sb.append("* %s\n".formatted(clam.getName()));
        }

        if(veggies != null) {
            for(Veggie veggie: veggies) {
                sb.append("* %s\n".formatted(veggie.getName()));
            }
        }

        return sb.toString();
    }
}
