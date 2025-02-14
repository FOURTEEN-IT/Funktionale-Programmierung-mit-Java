package de.fourteen.numbermapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import static java.util.Map.entry;
import static java.util.Map.ofEntries;

final class DoNotDoThis {
    public static void main(String[] args) {
        Map<Integer, String> representations = new HashMap<>(ofEntries(
                entry(1, "one"),
                entry(2, "two")));

        Consumer<List<Integer>> printIntegers = ints -> ints.stream()
                .map(representations::get)
                .forEach(System.out::println);

        printIntegers.accept(List.of(1, 2, 3));

        representations.put(3, "three");

        printIntegers.accept(List.of(1, 2, 3));
    }
}
