package de.fourteen.multiplication.curried;

import java.util.function.Function;
import java.util.function.UnaryOperator;

interface Multiplication extends Function<Double, UnaryOperator<Double>> {
    Multiplication PRODUCT = multiplier -> multiplicand -> multiplier * multiplicand;
}