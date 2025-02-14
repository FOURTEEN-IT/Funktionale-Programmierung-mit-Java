package de.fourteen.customersandorders.functional;

import java.util.function.BinaryOperator;

import static de.fourteen.customersandorders.functional.CombinedCustomerCollection.COMBINED;

interface CustomersWithMostOrdersReduction extends BinaryOperator<Tuple> {
    CustomersWithMostOrdersReduction TO_CUSTOMERS_WITH_MOST_ORDERS =
            (tuple1, tuple2) -> {
                if (tuple1.numberOfOrders() > tuple2.numberOfOrders()) return tuple1;
                if (tuple2.numberOfOrders() > tuple1.numberOfOrders()) return tuple2;
                return new Tuple(
                        COMBINED.apply(tuple1.customers()).apply(tuple2.customers()),
                        tuple1.numberOfOrders()
                );
            };
}
