package de.fourteen.books;

final class Author {
    private final String name;

    Author(final String name) {
        this.name = name;
    }

    boolean nameStartsWith(final String prefix) {
        return name.startsWith(prefix);
    }
}
