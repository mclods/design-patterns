package org.mclods.simple_factory;

import org.mclods.simple_factory.product.Pizza;

import java.util.Optional;

public class PizzaStoreTestDrive {
    public static void makeCheesePizza() {
        PizzaStore ps = new PizzaStore();

        Optional<Pizza> op = ps.orderPizza("cheese");
        op.ifPresent(System.out::println);
    }

    public static void makeClamPizza() {
        PizzaStore ps = new PizzaStore();

        Optional<Pizza> op = ps.orderPizza("clam");
        op.ifPresent(System.out::println);
    }

    public static void makePepperoniPizza() {
        PizzaStore ps = new PizzaStore();

        Optional<Pizza> op = ps.orderPizza("pepperoni");
        op.ifPresent(System.out::println);
    }

    public static void makeVeggiePizza() {
        PizzaStore ps = new PizzaStore();

        Optional<Pizza> op = ps.orderPizza("veggie");
        op.ifPresent(System.out::println);
    }

    public static void makeNothing() {
        PizzaStore ps = new PizzaStore();

        Optional<Pizza> op = ps.orderPizza("not a pizza");
        op.ifPresent(System.out::println);
    }
}
