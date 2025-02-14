package de.fourteen.customersandorders.procedural;

import java.util.Objects;

import static de.fourteen.funktionaleprogrammierunginjava.customersandorders.SlowDown.slowDown;

final class Customer {
    private final int id;
    private int numberOfOrders;

    Customer(final int id, final int numberOfOrders) {
        this.id = id;
        this.numberOfOrders = numberOfOrders;
    }

    int numberOfOrders() {
        slowDown();
        return numberOfOrders;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
