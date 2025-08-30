package org.mclods.observer_pattern;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class WeatherStationTest {
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
    @DisplayName("Test WeatherStation works with custom implementation as expected")
    void testWeatherStationWorksWithCustomImplementationAsExpected() {
        String expectedOutput = """
                Current conditions: 30.000000 °C, 65.000000 humidity, 30.400000 hPa
                Average conditions: 30.000000 °C, 65.000000 humidity, 30.400000 hPa
                Current conditions: 28.000000 °C, 70.000000 humidity, 29.200000 hPa
                Average conditions: 29.000000 °C, 67.500000 humidity, 29.800000 hPa
                """;

        WeatherStation.runCustomImpl();

        assertThat(getConsoleOutput()).isEqualTo(expectedOutput);
    }

    @Test
    @DisplayName("Test WeatherStation works with builtin implementation as expected")
    void testWeatherStationWorksWithBuiltInImplementationAsExpected() {
        WeatherStation.runBuiltInImpl();

        assertThat(getConsoleOutput()).contains("Average conditions: 43.000000 °C, 67.000000 humidity, 32.100000 hPa");
        assertThat(getConsoleOutput()).contains("Average conditions: 34.350000 °C, 78.500000 humidity, 30.650000 hPa");
        assertThat(getConsoleOutput()).contains("Current conditions: 43.000000 °C, 67.000000 humidity, 32.100000 hPa");
        assertThat(getConsoleOutput()).contains("Current conditions: 25.700000 °C, 90.000000 humidity, 29.200000 hPa");
    }
}
