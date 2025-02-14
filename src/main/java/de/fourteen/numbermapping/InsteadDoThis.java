package de.fourteen.numbermapping;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

import static java.util.Map.entry;
import static java.util.Map.ofEntries;

final class InsteadDoThis {
    public static void main(String[] args) {
        Map<Integer, String> representations = ofEntries(
                entry(1, "one"),
                entry(2, "two"));

        Function<Map<Integer, String>, Consumer<List<Integer>>> printIntegers =
                map -> ints -> ints.stream()
                        .map(map::get)
                        .forEach(System.out::println);

        printIntegers.apply(representations).accept(List.of(1, 2, 3));

        Map<Integer, String> representationsContainingThree = ofEntries(
                entry(1, "one"),
                entry(2, "two"),
                entry(3, "three"));

        printIntegers.apply(representationsContainingThree).accept(List.of(1, 2, 3));
    }
}
