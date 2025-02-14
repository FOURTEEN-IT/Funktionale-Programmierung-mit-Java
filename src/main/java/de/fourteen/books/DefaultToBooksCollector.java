package de.fourteen.books;

import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

final class DefaultToBooksCollector implements ToBooksCollector {
    @Override
    public Supplier<Books> supplier() {
        return () -> new Books(List.of());
    }

    @Override
    public BiConsumer<Books, Book> accumulator() {
        return (books, book) -> books.add(book);
    }

    @Override
    public BinaryOperator<Books> combiner() {
        return (someBooks, otherBooks) -> {
            someBooks.addAll(otherBooks);
            return someBooks;
        };
    }

    @Override
    public Function<Books, Books> finisher() {
        return books -> books;
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Set.of();
    }
}
