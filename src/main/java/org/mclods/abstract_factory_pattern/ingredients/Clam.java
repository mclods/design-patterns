package org.mclods.abstract_factory_pattern.ingredients;

public abstract class Clam {
    protected final String name;

    protected Clam(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
