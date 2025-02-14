package de.fourteen.books;

import java.util.Objects;

final class YearOfPublication {
    private final int yearOfPublication;

    YearOfPublication(final int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YearOfPublication that = (YearOfPublication) o;
        return yearOfPublication == that.yearOfPublication;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(yearOfPublication);
    }
}
