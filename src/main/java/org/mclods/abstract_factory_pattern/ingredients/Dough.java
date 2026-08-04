package org.mclods.abstract_factory_pattern.ingredients;

public abstract class Dough {
    protected final String name;

    protected Dough(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
