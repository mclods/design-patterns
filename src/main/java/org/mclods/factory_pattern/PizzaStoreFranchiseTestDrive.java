package org.mclods.factory_pattern;

import org.mclods.factory_pattern.creator.PizzaStore;
import org.mclods.factory_pattern.creator.impl.ChicagoStylePizzaStore;
import org.mclods.factory_pattern.creator.impl.NYStylePizzaStore;

public class PizzaStoreFranchiseTestDrive {
    public static void makeNYStyleCheesePizza() {
        PizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        nyStylePizzaStore.orderPizza("cheese");
    }

    public static void makeNYStyleClamPizza() {
        PizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        nyStylePizzaStore.orderPizza("clam");
    }

    public static void makeNYStylePepperoniPizza() {
        PizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        nyStylePizzaStore.orderPizza("pepperoni");
    }

    public static void makeNYStyleVeggiePizza() {
        PizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        nyStylePizzaStore.orderPizza("veggie");
    }

    public static void makeChicagoStyleCheesePizza() {
        PizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();
        chicagoStylePizzaStore.orderPizza("cheese");
    }

    public static void makeChicagoStyleClamPizza() {
        PizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();
        chicagoStylePizzaStore.orderPizza("clam");
    }

    public static void makeChicagoStylePepperoniPizza() {
        PizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();
        chicagoStylePizzaStore.orderPizza("pepperoni");
    }

    public static void makeChicagoStyleVeggiePizza() {
        PizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();
        chicagoStylePizzaStore.orderPizza("veggie");
    }

    public static void makeNothing() {
        PizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();
        chicagoStylePizzaStore.orderPizza("not a pizza");
    }
}
