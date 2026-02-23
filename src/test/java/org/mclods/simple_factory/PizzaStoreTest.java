package org.mclods.simple_factory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class PizzaStoreTest {
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
    @DisplayName("Test Cheese Pizza can be created")
    void testMakeCheesePizza() {
        String expectedOutput = """
                Preparing Cheese Pizza...
                Baking Cheese Pizza...
                Cutting Cheese Pizza...
                Boxing Cheese Pizza...
                
                Here's your Cheese Pizza :)
                """;

        PizzaStoreTestDrive.makeCheesePizza();

        assertThat(getConsoleOutput()).isEqualTo(expectedOutput);
    }

    @Test
    @DisplayName("Test Clam Pizza can be created")
    void testMakeClamPizza() {
        String expectedOutput = """
                Preparing Clam Pizza...
                Baking Clam Pizza...
                Cutting Clam Pizza...
                Boxing Clam Pizza...
                
                Here's your Clam Pizza :)
                """;

        PizzaStoreTestDrive.makeClamPizza();

        assertThat(getConsoleOutput()).isEqualTo(expectedOutput);
    }

    @Test
    @DisplayName("Test Pepperoni Pizza can be created")
    void testMakePepperoniPizza() {
        String expectedOutput = """
                Preparing Pepperoni Pizza...
                Baking Pepperoni Pizza...
                Cutting Pepperoni Pizza...
                Boxing Pepperoni Pizza...
                
                Here's your Pepperoni Pizza :)
                """;

        PizzaStoreTestDrive.makePepperoniPizza();

        assertThat(getConsoleOutput()).isEqualTo(expectedOutput);
    }

    @Test
    @DisplayName("Test Veggie Pizza can be created")
    void testMakeVeggiePizza() {
        String expectedOutput = """
                Preparing Veggie Pizza...
                Baking Veggie Pizza...
                Cutting Veggie Pizza...
                Boxing Veggie Pizza...
                
                Here's your Veggie Pizza :)
                """;

        PizzaStoreTestDrive.makeVeggiePizza();

        assertThat(getConsoleOutput()).isEqualTo(expectedOutput);
    }

    @Test
    @DisplayName("Test invalid pizza type is handled")
    void testInvalidPizzaTypeIsHandled() {
        PizzaStoreTestDrive.makeNothing();

        assertThat(getConsoleOutput()).isEqualTo("");
    }
}
