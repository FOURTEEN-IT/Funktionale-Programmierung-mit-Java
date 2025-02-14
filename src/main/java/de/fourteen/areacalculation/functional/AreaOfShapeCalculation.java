package de.fourteen.areacalculation.functional;

import java.util.function.Function;

interface AreaOfShapeCalculation extends Function<Shape, Double> {
    AreaOfShapeCalculation AREA = shape -> switch (shape) {
        case Rectangle rectangle -> AreaOfRectangleCalculation.AREA_OF_RECTANGLE.apply(rectangle);
        case Square square -> AreaOfSquareCalculation.AREA_OF_SQUARE.apply(square);
        case Circle circle -> AreaOfCircleCalculation.AREA_OF_CIRCLE.apply(circle);
    };
}

interface AreaOfRectangleCalculation extends Function<Rectangle, Double> {
    AreaOfRectangleCalculation AREA_OF_RECTANGLE =
            rectangle -> rectangle.length() * rectangle.width();
}

interface AreaOfSquareCalculation extends Function<Square, Double> {
    AreaOfSquareCalculation AREA_OF_SQUARE =
            square -> square.length() * square.length();
}

interface AreaOfCircleCalculation extends Function<Circle, Double> {
    AreaOfCircleCalculation AREA_OF_CIRCLE =
            circle -> Math.PI * circle.radius() * circle.radius();
}