package de.fourteen.areacalculation.procedural;

import de.fourteen.areacalculation.AreaCalculationTest;
import org.junit.jupiter.api.BeforeEach;

import java.util.function.BiFunction;

final class AreaCalculationProceduralTest implements AreaCalculationTest {

    private AreaCalculationProcedural sut;

    @BeforeEach
    void setUp() {
        sut = new AreaCalculationProcedural();
    }

    @Override
    public BiFunction<String, Double[], Double> sut() {
        return sut::calculateArea;
    }
}