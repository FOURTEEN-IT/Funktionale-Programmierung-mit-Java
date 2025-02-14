package de.fourteen.customersandorders.functional;

import static de.fourteen.customersandorders.SlowDown.slowDown;

record Customer(int id, long numberOfOrders) {
    @Override
    public long numberOfOrders() {
        slowDown();
        return numberOfOrders;
    }
}
