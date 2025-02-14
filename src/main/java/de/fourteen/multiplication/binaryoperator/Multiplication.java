package de.fourteen.multiplication.binaryoperator;

import java.util.function.BinaryOperator;

interface Multiplication extends BinaryOperator<Double> {
    Multiplication PRODUCT = (multiplier, multiplicand) -> multiplier * multiplicand;
}