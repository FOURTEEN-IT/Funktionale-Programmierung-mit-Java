package de.fourteen.multiplication.curried;

import java.util.function.UnaryOperator;

import static de.fourteen.multiplication.curried.Multiplication.PRODUCT;

interface Doubling extends UnaryOperator<Double> {
    Doubling DOUBLE = PRODUCT.apply(2.0)::apply;
}
