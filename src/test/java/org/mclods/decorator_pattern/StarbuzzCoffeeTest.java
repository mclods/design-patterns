package org.mclods.decorator_pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class StarbuzzCoffeeTest {
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
    @DisplayName("Test make espresso works as expected")
    void testMakeEspressoWorksAsExpected() {
        String expectedOutput = "Espresso $3.76\n";

        StarbuzzCoffee.makeEspresso();

        assertThat(getConsoleOutput()).isEqualTo(expectedOutput);
    }

    @Test
    @DisplayName("Test make dark roast double mocha whip works as expected")
    void testMakeDarkRoastDoubleMochaWhipWorksAsExpected() {
        String expectedOutput = "Dark Roast Coffee, Mocha, Mocha, Whip $4.47\n";

        StarbuzzCoffee.makeDarkRoastDoubleMochaWhip();

        assertThat(getConsoleOutput()).isEqualTo(expectedOutput);
    }

    @Test
    @DisplayName("Test make house blend soy mocha whip works as expected")
    void testMakeHouseBlendSoyMochaWhipWorksAsExpected() {
        String expectedOutput = "House Blend Coffee, Soy, Mocha, Whip $9.94\n";

        StarbuzzCoffee.makeHouseBlendSoyMochaWhip();

        assertThat(getConsoleOutput()).isEqualTo(expectedOutput);
    }
}
