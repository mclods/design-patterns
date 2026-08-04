package org.mclods.abstract_factory_pattern;

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
                Preparing NY Style Cheese Pizza
                Tossing Thin Crust Dough...
                Adding Marinara Sauce...
                Adding Reggiano Cheese...
                
                Baking for 25 minutes at 350
                
                Cutting the pizza into diagonal slices
                
                Placing pizza in official PizzaStore box
                
                """;

        String expectedPizza = """
                NY Style Cheese Pizza made with:
                * Thin Crust Dough
                * Marinara Sauce
                * Reggiano Cheese
                """;

        var pizza = PizzaStoreFranchiseTestDrive.makeNYStyleCheesePizza();
        assertThat(getConsoleOutput()).isEqualTo(expectedOutput);
        assertThat(pizza).isNotEmpty();
        assertThat(pizza.get()).hasToString(expectedPizza);
    }

    @Test
    @DisplayName("Test NY Style Clam Pizza can be created")
    void testMakeNYStyleClamPizza() {
        String expectedOutput = """
                Preparing NY Style Clam Pizza
                Tossing Thin Crust Dough...
                Adding Marinara Sauce...
                Adding Reggiano Cheese...
                Adding Reggiano Cheese...
                
                Baking for 25 minutes at 350
                
                Cutting the pizza into diagonal slices
                
                Placing pizza in official PizzaStore box
                
                """;

        String expectedPizza = """
                NY Style Clam Pizza made with:
                * Thin Crust Dough
                * Marinara Sauce
                * Reggiano Cheese
                * Fresh Clams from Long Island Sound
                """;

        var pizza = PizzaStoreFranchiseTestDrive.makeNYStyleClamPizza();
        assertThat(getConsoleOutput()).isEqualTo(expectedOutput);
        assertThat(pizza).isNotEmpty();
        assertThat(pizza.get()).hasToString(expectedPizza);
    }

    @Test
    @DisplayName("Test NY Style Pepperoni Pizza can be created")
    void testMakeNYStylePepperoniPizza() {
        String expectedOutput = """
                Preparing NY Style Pepperoni Pizza
                Tossing Thin Crust Dough...
                Adding Marinara Sauce...
                Adding Reggiano Cheese...
                Adding Sliced Pepperoni...

                Baking for 25 minutes at 350

                Cutting the pizza into diagonal slices

                Placing pizza in official PizzaStore box
                
                """;

        String expectedPizza = """
                NY Style Pepperoni Pizza made with:
                * Thin Crust Dough
                * Marinara Sauce
                * Reggiano Cheese
                * Sliced Pepperoni
                """;

        var pizza = PizzaStoreFranchiseTestDrive.makeNYStylePepperoniPizza();
        assertThat(getConsoleOutput()).isEqualTo(expectedOutput);
        assertThat(pizza).isNotEmpty();
        assertThat(pizza.get()).hasToString(expectedPizza);
    }

    @Test
    @DisplayName("Test NY Style Veggie Pizza can be created")
    void testMakeNYStyleVeggiePizza() {
        String expectedOutput = """
                Preparing NY Style Veggie Pizza
                Tossing Thin Crust Dough...
                Adding Marinara Sauce...
                Adding Reggiano Cheese...
                Adding veggies...
                * Garlic
                * Onion
                * Mushroom
                * Red Pepper

                Baking for 25 minutes at 350

                Cutting the pizza into diagonal slices

                Placing pizza in official PizzaStore box
                
                """;

        String expectedPizza = """
                NY Style Veggie Pizza made with:
                * Thin Crust Dough
                * Marinara Sauce
                * Reggiano Cheese
                * Garlic
                * Onion
                * Mushroom
                * Red Pepper
                """;

        var pizza = PizzaStoreFranchiseTestDrive.makeNYStyleVeggiePizza();
        assertThat(getConsoleOutput()).isEqualTo(expectedOutput);
        assertThat(pizza).isNotEmpty();
        assertThat(pizza.get()).hasToString(expectedPizza);
    }

    @Test
    @DisplayName("Test Chicago Style Cheese Pizza can be created")
    void testMakeChicagoStyleCheesePizza() {
        String expectedOutput = """
                Preparing Chicago Deep Dish Cheese Pizza
                Tossing Extra Thick Crust Dough...
                Adding Plum Tomato Sauce...
                Adding Shredded Mozzarella Cheese...

                Baking for 25 minutes at 350

                Cutting the pizza into diagonal slices

                Placing pizza in official PizzaStore box
                
                """;

        String expectedPizza = """
                Chicago Deep Dish Cheese Pizza made with:
                * Extra Thick Crust Dough
                * Plum Tomato Sauce
                * Shredded Mozzarella Cheese
                """;

        var pizza = PizzaStoreFranchiseTestDrive.makeChicagoStyleCheesePizza();
        assertThat(getConsoleOutput()).isEqualTo(expectedOutput);
        assertThat(pizza).isNotEmpty();
        assertThat(pizza.get()).hasToString(expectedPizza);
    }

    @Test
    @DisplayName("Test Chicago Style Clam Pizza can be created")
    void testMakeChicagoStyleClamPizza() {
        String expectedOutput = """
                Preparing Chicago Deep Dish Clam Pizza
                Tossing Extra Thick Crust Dough...
                Adding Plum Tomato Sauce...
                Adding Shredded Mozzarella Cheese...
                Adding Shredded Mozzarella Cheese...

                Baking for 25 minutes at 350

                Cutting the pizza into diagonal slices

                Placing pizza in official PizzaStore box
                
                """;

        String expectedPizza = """
                Chicago Deep Dish Clam Pizza made with:
                * Extra Thick Crust Dough
                * Plum Tomato Sauce
                * Shredded Mozzarella Cheese
                * Frozen Clams from Chesapeake Bay
                """;

        var pizza = PizzaStoreFranchiseTestDrive.makeChicagoStyleClamPizza();
        assertThat(getConsoleOutput()).isEqualTo(expectedOutput);
        assertThat(pizza).isNotEmpty();
        assertThat(pizza.get()).hasToString(expectedPizza);
    }

    @Test
    @DisplayName("Test Chicago Style Pepperoni Pizza can be created")
    void testMakeChicagoStylePepperoniPizza() {
        String expectedOutput = """
                Preparing Chicago Deep Dish Pepperoni Pizza
                Tossing Extra Thick Crust Dough...
                Adding Plum Tomato Sauce...
                Adding Shredded Mozzarella Cheese...
                Adding Sliced Pepperoni...

                Baking for 25 minutes at 350

                Cutting the pizza into diagonal slices

                Placing pizza in official PizzaStore box
                
                """;

        String expectedPizza = """
                Chicago Deep Dish Pepperoni Pizza made with:
                * Extra Thick Crust Dough
                * Plum Tomato Sauce
                * Shredded Mozzarella Cheese
                * Sliced Pepperoni
                """;

        var pizza = PizzaStoreFranchiseTestDrive.makeChicagoStylePepperoniPizza();
        assertThat(getConsoleOutput()).isEqualTo(expectedOutput);
        assertThat(pizza).isNotEmpty();
        assertThat(pizza.get()).hasToString(expectedPizza);
    }

    @Test
    @DisplayName("Test Chicago Style Veggie Pizza can be created")
    void testMakeChicagoStyleVeggiePizza() {
        String expectedOutput = """
                Preparing Chicago Deep Dish Veggie Pizza
                Tossing Extra Thick Crust Dough...
                Adding Plum Tomato Sauce...
                Adding Shredded Mozzarella Cheese...
                Adding veggies...
                * Black Olive
                * Spinach
                * Eggplant

                Baking for 25 minutes at 350

                Cutting the pizza into diagonal slices

                Placing pizza in official PizzaStore box
                
                """;

        String expectedPizza = """
                Chicago Deep Dish Veggie Pizza made with:
                * Extra Thick Crust Dough
                * Plum Tomato Sauce
                * Shredded Mozzarella Cheese
                * Black Olive
                * Spinach
                * Eggplant
                """;

        var pizza = PizzaStoreFranchiseTestDrive.makeChicagoStyleVeggiePizza();
        assertThat(getConsoleOutput()).isEqualTo(expectedOutput);
        assertThat(pizza).isNotEmpty();
        assertThat(pizza.get()).hasToString(expectedPizza);
    }

    @Test
    @DisplayName("Test California Style Cheese Pizza can be created")
    void testMakeCaliforniaStyleCheesePizza() {
        String expectedOutput = """
                Preparing California Style Cheese Pizza
                Tossing Very Thin Crust Dough...
                Adding Bruschetta Sauce...
                Adding Goat Cheese and Smoked Gouda...

                Baking for 25 minutes at 350

                Cutting the pizza into diagonal slices

                Placing pizza in official PizzaStore box
                
                """;

        String expectedPizza = """
                California Style Cheese Pizza made with:
                * Very Thin Crust Dough
                * Bruschetta Sauce
                * Goat Cheese and Smoked Gouda
                """;

        var pizza = PizzaStoreFranchiseTestDrive.makeCaliforniaStyleCheesePizza();
        assertThat(getConsoleOutput()).isEqualTo(expectedOutput);
        assertThat(pizza).isNotEmpty();
        assertThat(pizza.get()).hasToString(expectedPizza);
    }

    @Test
    @DisplayName("Test California Style Clam Pizza can be created")
    void testMakeCaliforniaStyleClamPizza() {
        String expectedOutput = """
                Preparing California Style Clam Pizza
                Tossing Very Thin Crust Dough...
                Adding Bruschetta Sauce...
                Adding Goat Cheese and Smoked Gouda...
                Adding Goat Cheese and Smoked Gouda...

                Baking for 25 minutes at 350

                Cutting the pizza into diagonal slices

                Placing pizza in official PizzaStore box
                
                """;

        String expectedPizza = """
                California Style Clam Pizza made with:
                * Very Thin Crust Dough
                * Bruschetta Sauce
                * Goat Cheese and Smoked Gouda
                * Pacific Oyster
                """;

        var pizza = PizzaStoreFranchiseTestDrive.makeCaliforniaStyleClamPizza();
        assertThat(getConsoleOutput()).isEqualTo(expectedOutput);
        assertThat(pizza).isNotEmpty();
        assertThat(pizza.get()).hasToString(expectedPizza);
    }

    @Test
    @DisplayName("Test California Style Pepperoni Pizza can be created")
    void testMakeCaliforniaStylePepperoniPizza() {
        String expectedOutput = """
                Preparing California Style Pepperoni Pizza
                Tossing Very Thin Crust Dough...
                Adding Bruschetta Sauce...
                Adding Goat Cheese and Smoked Gouda...
                Adding Italian Salumi...

                Baking for 25 minutes at 350

                Cutting the pizza into diagonal slices

                Placing pizza in official PizzaStore box
                
                """;

        String expectedPizza = """
                California Style Pepperoni Pizza made with:
                * Very Thin Crust Dough
                * Bruschetta Sauce
                * Goat Cheese and Smoked Gouda
                * Italian Salumi
                """;

        var pizza = PizzaStoreFranchiseTestDrive.makeCaliforniaStylePepperoniPizza();
        assertThat(getConsoleOutput()).isEqualTo(expectedOutput);
        assertThat(pizza).isNotEmpty();
        assertThat(pizza.get()).hasToString(expectedPizza);
    }

    @Test
    @DisplayName("Test California Style Veggie Pizza can be created")
    void testMakeCaliforniaStyleVeggiePizza() {
        String expectedOutput = """
                Preparing California Style Veggie Pizza
                Tossing Very Thin Crust Dough...
                Adding Bruschetta Sauce...
                Adding Goat Cheese and Smoked Gouda...
                Adding veggies...
                * Artichoke Heart
                * Red Pepper
                * Arugula

                Baking for 25 minutes at 350

                Cutting the pizza into diagonal slices

                Placing pizza in official PizzaStore box
                
                """;

        String expectedPizza = """
                California Style Veggie Pizza made with:
                * Very Thin Crust Dough
                * Bruschetta Sauce
                * Goat Cheese and Smoked Gouda
                * Artichoke Heart
                * Red Pepper
                * Arugula
                """;

        var pizza = PizzaStoreFranchiseTestDrive.makeCaliforniaStyleVeggiePizza();
        assertThat(getConsoleOutput()).isEqualTo(expectedOutput);
        assertThat(pizza).isNotEmpty();
        assertThat(pizza.get()).hasToString(expectedPizza);
    }

    @Test
    @DisplayName("Test invalid pizza type is handled")
    void testInvalidPizzaTypeIsHandled() {
        var pizza = PizzaStoreFranchiseTestDrive.makeNothing();
        assertThat(getConsoleOutput()).isEqualTo("");
        assertThat(pizza).isEmpty();
    }
}
