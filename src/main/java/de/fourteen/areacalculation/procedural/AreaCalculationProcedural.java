package de.fourteen.areacalculation.procedural;

final class AreaCalculationProcedural {
    double calculateArea(final String shapeName, final Double[] sizeConfiguration) {
        switch (shapeName) {
            case "rectangle":
                double width = sizeConfiguration[0];
                double height = sizeConfiguration[1];
                return width * height;
            case "square":
                double length = sizeConfiguration[0];
                return length * length;
            case "circle":
                double radius = sizeConfiguration[0];
                return Math.PI * radius * radius;
            default:
                throw new IllegalArgumentException("no such shape");
        }
    }
}