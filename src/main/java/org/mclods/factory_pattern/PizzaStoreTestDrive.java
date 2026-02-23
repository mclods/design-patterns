package org.mclods.factory_pattern;

import org.mclods.factory_pattern.creator.PizzaStore;
import org.mclods.factory_pattern.creator.impl.ChicagoStylePizzaStore;
import org.mclods.factory_pattern.creator.impl.NYStylePizzaStore;

public class PizzaStoreTestDrive {
    public static void run() {
        PizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        nyStylePizzaStore.orderPizza("pepperoni");

        PizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();
        chicagoStylePizzaStore.orderPizza("clam");
    }
}
