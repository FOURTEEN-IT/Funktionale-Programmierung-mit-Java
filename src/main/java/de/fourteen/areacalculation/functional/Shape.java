package de.fourteen.areacalculation.functional;

sealed interface Shape permits Rectangle, Square, Circle {
}

record Rectangle(double length, double width) implements Shape {
}

record Square(double length) implements Shape {
}

record Circle(double radius) implements Shape {
}
