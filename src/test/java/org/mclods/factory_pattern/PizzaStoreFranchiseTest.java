package org.mclods.factory_pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class PizzaStoreFranchiseTest {
    private final ByteArrayOutputStream testOutputStream = new ByteArrayOutputStream();
    private final PrintStream originalOutputStream = System.out;

    @BeforeEach
    void beforeEach() {
        System.setOut(new PrintStream(testOutputStream));
    }

    @AfterEach
    void afterEach() {
        System.setOut(originalOutputStream);
    }

    private String getConsoleOutput() {
        return testOutputStream.toString().replaceAll(System.lineSeparator(), "\n");
    }

    @Test
    @DisplayName("Test NY Style Cheese Pizza can be created")
    void testMakeNYStyleCheesePizza() {
        String expectedOutput = """
                Preparing NY Style Sauce and Cheese Pizza
                Tossing dough...
                Adding sauce...
                Adding toppings...
                * Grated Reggiano Cheese
                
                Baking for 25 minutes at 350
                
                Cutting the pizza into diagonal slices
                
                Placing pizza in official PizzaStore box
                
                """;

        PizzaStoreFranchiseTestDrive.makeNYStyleCheesePizza();

        assertThat(getConsoleOutput()).isEqualTo(expectedOutput);
    }

    @Test
    @DisplayName("Test NY Style Clam Pizza can be created")
    void testMakeNYStyleClamPizza() {
        String expectedOutput = """
                Preparing NY Style Clam Pizza
                Tossing dough...
                Adding sauce...
                Adding toppings...
                * Freshly Chopped Clams
                * Mozzarella Cheese
                * Chopped Parsley
                * Dried Oregano
                
                Baking for 25 minutes at 350
                
                Cutting the pizza into diagonal slices
                
                Placing pizza in official PizzaStore box
                
                """;

        PizzaStoreFranchiseTestDrive.makeNYStyleClamPizza();

        assertThat(getConsoleOutput()).isEqualTo(expectedOutput);
    }

    @Test
    @DisplayName("Test NY Style Pepperoni Pizza can be created")
    void testMakeNYStylePepperoniPizza() {
        String expectedOutput = """
                Preparing NY Style Pepperoni Pizza
                Tossing dough...
                Adding sauce...
                Adding toppings...
                * Pepperoni
                * Parmesan Cheese
                * Dried Oregano
                
                Baking for 25 minutes at 350
                
                Cutting the pizza into diagonal slices
                
                Placing pizza in official PizzaStore box
                
                """;

        PizzaStoreFranchiseTestDrive.makeNYStylePepperoniPizza();

        assertThat(getConsoleOutput()).isEqualTo(expectedOutput);
    }

    @Test
    @DisplayName("Test NY Style Veggie Pizza can be created")
    void testMakeNYStyleVeggiePizza() {
        String expectedOutput = """
                Preparing NY Style Veggie Pizza
                Tossing dough...
                Adding sauce...
                Adding toppings...
                * Mozzarella Cheese
                * Yellow Onions
                * Thin Sliced Bell Peppers
                * Sliced Black Olives
                
                Baking for 25 minutes at 350
                
                Cutting the pizza into diagonal slices
                
                Placing pizza in official PizzaStore box
                
                """;

        PizzaStoreFranchiseTestDrive.makeNYStyleVeggiePizza();

        assertThat(getConsoleOutput()).isEqualTo(expectedOutput);
    }

    @Test
    @DisplayName("Test Chicago Style Cheese Pizza can be created")
    void testMakeChicagoStyleCheesePizza() {
        String expectedOutput = """
                Preparing Chicago Style Deep Dish Cheese Pizza
                Tossing dough...
                Adding sauce...
                Adding toppings...
                * Shredded Mozzarella Cheese
                
                Baking for 25 minutes at 350
                
                Cutting the pizza into square slices
                
                Placing pizza in official PizzaStore box
                
                """;

        PizzaStoreFranchiseTestDrive.makeChicagoStyleCheesePizza();

        assertThat(getConsoleOutput()).isEqualTo(expectedOutput);
    }

    @Test
    @DisplayName("Test Chicago Style Clam Pizza can be created")
    void testMakeChicagoStyleClamPizza() {
        String expectedOutput = """
                Preparing Chicago Style Clam Pizza
                Tossing dough...
                Adding sauce...
                Adding toppings...
                * Sliced Mozzarella
                * Chopped Sea Clams
                
                Baking for 25 minutes at 350
                
                Cutting the pizza into diagonal slices
                
                Placing pizza in official PizzaStore box
                
                """;

        PizzaStoreFranchiseTestDrive.makeChicagoStyleClamPizza();

        assertThat(getConsoleOutput()).isEqualTo(expectedOutput);
    }

    @Test
    @DisplayName("Test Chicago Style Pepperoni Pizza can be created")
    void testMakeChicagoStylePepperoniPizza() {
        String expectedOutput = """
                Preparing Chicago Style Pepperoni Pizza
                Tossing dough...
                Adding sauce...
                Adding toppings...
                * Sliced Mozzarella
                * Pepperoni
                * Minced Garlic
                * Grated Parmesan
                
                Baking for 25 minutes at 350
                
                Cutting the pizza into diagonal slices
                
                Placing pizza in official PizzaStore box
                
                """;

        PizzaStoreFranchiseTestDrive.makeChicagoStylePepperoniPizza();

        assertThat(getConsoleOutput()).isEqualTo(expectedOutput);
    }

    @Test
    @DisplayName("Test Chicago Style Veggie Pizza can be created")
    void testMakeChicagoStyleVeggiePizza() {
        String expectedOutput = """
                Preparing Chicago Style Veggie Pizza
                Tossing dough...
                Adding sauce...
                Adding toppings...
                * Shredded Mozzarella Cheese
                * Thick Cut Onions
                * Chunky Green Bell Peppers
                * Black Olives
                
                Baking for 25 minutes at 350
                
                Cutting the pizza into diagonal slices
                
                Placing pizza in official PizzaStore box
                
                """;

        PizzaStoreFranchiseTestDrive.makeChicagoStyleVeggiePizza();

        assertThat(getConsoleOutput()).isEqualTo(expectedOutput);
    }

    @Test
    @DisplayName("Test invalid pizza type is handled")
    void testInvalidPizzaTypeIsHandled() {
        PizzaStoreFranchiseTestDrive.makeNothing();

        assertThat(getConsoleOutput()).isEqualTo("");
    }
}
