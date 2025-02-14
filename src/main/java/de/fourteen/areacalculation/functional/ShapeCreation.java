package de.fourteen.areacalculation.functional;

import java.util.function.Function;

interface ShapeCreation extends Function<String, Function<Double[], Shape>> {
    ShapeCreation SHAPE = shape -> switch (shape) {
        case "rectangle" -> RectangleCreation.RECTANGLE::apply;
        case "square" -> SquareCreation.SQUARE::apply;
        case "circle" -> CircleCreation.CIRCLE::apply;
        default -> throw new IllegalArgumentException("no such shape");
    };
}

interface RectangleCreation extends Function<Double[], Rectangle> {
    RectangleCreation RECTANGLE = sizeConfiguration ->
            new Rectangle(sizeConfiguration[0], sizeConfiguration[1]);
}

interface SquareCreation extends Function<Double[], Square> {
    SquareCreation SQUARE = sizeConfiguration -> new Square(sizeConfiguration[0]);
}

interface CircleCreation extends Function<Double[], Circle> {
    CircleCreation CIRCLE = sizeConfiguration -> new Circle(sizeConfiguration[0]);
}

