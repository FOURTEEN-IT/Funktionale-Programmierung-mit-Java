package de.fourteen.numbermapping;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

final class OrThis {
    public static void main(String[] args) {
        Function<Integer, String> oneTwo = number -> switch (number) {
            case 1 -> "one";
            case 2 -> "two";
            default -> null;
        };

        Function<Function<Integer, String>, Consumer<List<Integer>>> printIntegers =
                map -> ints -> ints.stream()
                        .map(map::apply)
                        .forEach(System.out::println);

        printIntegers.apply(oneTwo).accept(List.of(1, 2, 3));

        Function<Integer, String> oneTwoThree = number -> switch (number) {
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            default -> null;
        };

        printIntegers.apply(oneTwoThree).accept(List.of(1, 2, 3));
    }
}
