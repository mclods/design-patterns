package org.mclods.abstract_factory_pattern.ingredients;

public abstract class Cheese {
    protected final String name;

    protected Cheese(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
