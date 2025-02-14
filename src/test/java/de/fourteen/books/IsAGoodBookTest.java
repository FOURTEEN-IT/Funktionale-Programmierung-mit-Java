package de.fourteen.books;

import org.junit.jupiter.api.Test;

import static de.fourteen.books.IsAGoodBook.IS_A_GOOD_BOOK;
import static org.assertj.core.api.Assertions.assertThat;

final class IsAGoodBookTest {

    @Test
    void thisIsAGoodBook() {
        Book aGoodBook = new Book(
                new Author("Andreas Jürgensen"),
                new Title("Funktionale Programmierung mit Java"),
                new YearOfPublication(2025));

        boolean result = IS_A_GOOD_BOOK.test(aGoodBook);

        assertThat(result).isTrue();
    }
}
