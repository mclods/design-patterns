package org.mclods.abstract_factory_pattern.ingredients;

public abstract class Veggie {
    protected final String name;

    protected Veggie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
