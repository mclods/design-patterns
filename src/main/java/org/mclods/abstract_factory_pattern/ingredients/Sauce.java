package org.mclods.abstract_factory_pattern.ingredients;

public abstract class Sauce {
    protected final String name;

    protected Sauce(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
