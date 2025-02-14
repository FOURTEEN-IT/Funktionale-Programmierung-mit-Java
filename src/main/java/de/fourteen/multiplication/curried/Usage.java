package de.fourteen.multiplication.curried;

import static de.fourteen.multiplication.curried.Doubling.DOUBLE;
import static de.fourteen.multiplication.curried.Multiplication.PRODUCT;

final class Usage {
    public static void main(String[] args) {
        double answer = PRODUCT.apply(2.0).apply(21.0);
        double sameAnswer = DOUBLE.apply(21.0);
    }
}
