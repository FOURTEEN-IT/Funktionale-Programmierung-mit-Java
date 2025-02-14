package de.fourteen.books;

final class Book {
    private final Author author;
    private final Title title;
    private final YearOfPublication yearOfPublication;

    Book(final Author author, final Title title, final YearOfPublication yearOfPublication) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
    }

    boolean authorNameStartsWith(final String prefix) {
        return author.nameStartsWith(prefix);
    }

    boolean isTitleLength(final int length) {
        return title.isLength(length);
    }

    boolean wasPublishedIn(final YearOfPublication year) {
        return yearOfPublication.equals(year);
    }
}
