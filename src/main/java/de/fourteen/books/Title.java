package de.fourteen.books;

final class Title {
    private final String title;

    Title(final String title) {
        this.title = title;
    }

    boolean isLength(final int length) {
        return title.length() == length;
    }
}
