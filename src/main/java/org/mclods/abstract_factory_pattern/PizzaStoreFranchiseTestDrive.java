package org.mclods.abstract_factory_pattern;

import org.mclods.abstract_factory_pattern.creators.PizzaStore;
import org.mclods.abstract_factory_pattern.creators.impl.CaliforniaPizzaStore;
import org.mclods.abstract_factory_pattern.creators.impl.ChicagoPizzaStore;
import org.mclods.abstract_factory_pattern.creators.impl.NYPizzaStore;
import org.mclods.abstract_factory_pattern.products.Pizza;

import java.util.Optional;

public class PizzaStoreFranchiseTestDrive {
    public static Optional<Pizza> makeNYStyleCheesePizza() {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        return nyPizzaStore.orderPizza("cheese");
    }

    public static Optional<Pizza> makeNYStyleClamPizza() {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        return nyPizzaStore.orderPizza("clam");
    }

    public static Optional<Pizza> makeNYStylePepperoniPizza() {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        return nyPizzaStore.orderPizza("pepperoni");
    }

    public static Optional<Pizza> makeNYStyleVeggiePizza() {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        return nyPizzaStore.orderPizza("veggie");
    }

    public static Optional<Pizza> makeChicagoStyleCheesePizza() {
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        return chicagoPizzaStore.orderPizza("cheese");
    }

    public static Optional<Pizza> makeChicagoStyleClamPizza() {
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        return chicagoPizzaStore.orderPizza("clam");
    }

    public static Optional<Pizza> makeChicagoStylePepperoniPizza() {
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        return chicagoPizzaStore.orderPizza("pepperoni");
    }

    public static Optional<Pizza> makeChicagoStyleVeggiePizza() {
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        return chicagoPizzaStore.orderPizza("veggie");
    }

    public static Optional<Pizza> makeCaliforniaStyleCheesePizza() {
        PizzaStore californiaPizzaStore = new CaliforniaPizzaStore();
        return californiaPizzaStore.orderPizza("cheese");
    }

    public static Optional<Pizza> makeCaliforniaStyleClamPizza() {
        PizzaStore californiaPizzaStore = new CaliforniaPizzaStore();
        return californiaPizzaStore.orderPizza("clam");
    }

    public static Optional<Pizza> makeCaliforniaStylePepperoniPizza() {
        PizzaStore californiaPizzaStore = new CaliforniaPizzaStore();
        return californiaPizzaStore.orderPizza("pepperoni");
    }

    public static Optional<Pizza> makeCaliforniaStyleVeggiePizza() {
        PizzaStore californiaPizzaStore = new CaliforniaPizzaStore();
        return californiaPizzaStore.orderPizza("veggie");
    }

    public static Optional<Pizza> makeNothing() {
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        return chicagoPizzaStore.orderPizza("not a pizza");
    }
}
