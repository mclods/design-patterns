package org.mclods.simple_factory;

import org.mclods.simple_factory.Pizza.Pizza;
import org.mclods.simple_factory.SimplePizzaFactory.SimplePizzaFactory;

public class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = SimplePizzaFactory.createPizza(type);

        if(pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }

        return pizza;
    }

    public static void run() {
        PizzaStore ps = new PizzaStore();

        Pizza pizza = ps.orderPizza("clam");
        System.out.println(pizza);
    }
}
