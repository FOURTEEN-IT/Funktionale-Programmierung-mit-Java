package de.fourteen.areacalculation.functional;

import de.fourteen.areacalculation.AreaCalculationTest;
import org.junit.jupiter.api.BeforeEach;

import java.util.function.BiFunction;

final class AreaCalculationFunctionalTest implements AreaCalculationTest {

    private AreaCalculationFunctional sut;

    @BeforeEach
    void setUp() {
        sut = AreaCalculationFunctional.CALCULATED_AREA;
    }

    @Override
    public BiFunction<String, Double[], Double> sut() {
        return sut;
    }
}