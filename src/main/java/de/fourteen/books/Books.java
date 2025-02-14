package de.fourteen.books;

import java.util.ArrayList;
import java.util.Collection;

import static de.fourteen.books.IsAGoodBook.IS_A_GOOD_BOOK;

final class Books {

    private final Collection<Book> books;
    private final IsAGoodBook isAGoodBook;
    private final ToBooksCollector toBooks;

    Books(final Collection<Book> books, final IsAGoodBook isAGoodBook, final ToBooksCollector toBooks) {
        this.books = new ArrayList<>(books);
        this.isAGoodBook = isAGoodBook;
        this.toBooks = toBooks;
    }

    Books(final Collection<Book> books) {
        this(books, IS_A_GOOD_BOOK, new DefaultToBooksCollector());
    }

    Books goodBooks() {
        return books.stream().filter(isAGoodBook).collect(toBooks);
    }

    void add(final Book book) {
        books.add(book);
    }

    void addAll(final Books books) {
        this.books.addAll(books.books);
    }
}
