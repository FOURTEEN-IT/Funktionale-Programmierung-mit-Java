package de.fourteen.areacalculation.functional;

import java.util.function.BiFunction;

import static de.fourteen.areacalculation.functional.AreaOfShapeCalculation.AREA;
import static de.fourteen.areacalculation.functional.ShapeCreation.SHAPE;

interface AreaCalculationFunctional extends BiFunction<String, Double[], Double> {
    AreaCalculationFunctional CALCULATED_AREA = (shapeName, sizeConfiguration) ->
            AREA.apply(SHAPE.apply(shapeName).apply(sizeConfiguration));
}
