package org.mclods.strategy_pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class MiniDuckSimulatorTest {
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
    @DisplayName("Test MiniDuckSimulator works as expected")
    void testMiniDuckSimulatorWorksAsExpected() {
        String expectedOutput = """
                Quack! Quack!
                Flying with wings!
                Squeak! Squeak!
                I can't fly!
                """;

        MiniDuckSimulator.run();

        assertThat(getConsoleOutput()).isEqualTo(expectedOutput);
    }
}
