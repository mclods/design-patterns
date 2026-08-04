package org.mclods.abstract_factory_pattern.ingredients;

public abstract class Pepperoni {
    protected final String name;

    protected Pepperoni(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
