package org.mclods.simple_factory.product;

public abstract class Pizza {
    protected String name;

    public void prepare() {
        System.out.printf("Preparing %s...\n", name);
    }

    public void bake() {
        System.out.printf("Baking %s...\n", name);
    }

    public void cut() {
        System.out.printf("Cutting %s...\n", name);
    }

    public void box() {
        System.out.printf("Boxing %s...\n\n", name);
    }

    @Override
    public String toString() {
        return String.format("Here's your %s :)", name);
    }
}