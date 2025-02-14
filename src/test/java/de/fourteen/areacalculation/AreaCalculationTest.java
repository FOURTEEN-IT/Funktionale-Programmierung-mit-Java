package de.fourteen.areacalculation;

import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;

import static org.assertj.core.api.Assertions.assertThat;

public interface AreaCalculationTest {

    BiFunction<String, Double[], Double> sut();

    @Test
    default void rectangle() {
        String shapeName = "rectangle";
        Double[] sizeConfiguration = {3.0, 4.0};

        double actualArea = sut().apply(shapeName, sizeConfiguration);

        assertThat(actualArea).isEqualTo(12);
    }

    @Test
    default void square() {
        String shapeName = "square";
        Double[] sizeConfiguration = {2.0};

        double actualArea = sut().apply(shapeName, sizeConfiguration);

        assertThat(actualArea).isEqualTo(4);
    }

    @Test
    default void circle() {
        String shapeName = "circle";
        Double[] sizeConfiguration = {2.0};

        double actualArea = sut().apply(shapeName, sizeConfiguration);

        assertThat(actualArea).isEqualTo(12.566370614359172);
    }
}