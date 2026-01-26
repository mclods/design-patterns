package org.mclods.simple_factory.Pizza;

public abstract class Pizza {
    String name;

    public Pizza(String name) {
        this.name = name;
    }

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
        System.out.printf("Boxing %s...\n", name);
    }

    @Override
    public String toString() {
        return String.format("Here's your %s :)", name);
    }
}