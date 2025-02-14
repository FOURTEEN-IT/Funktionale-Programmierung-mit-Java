package de.fourteen.customersandorders.functional;

import java.util.Collection;
import java.util.List;
import java.util.function.UnaryOperator;

import static de.fourteen.customersandorders.functional.CustomersWithMostOrdersReduction.TO_CUSTOMERS_WITH_MOST_ORDERS;

interface CustomersWithMostOrders extends UnaryOperator<Collection<Customer>> {
    CustomersWithMostOrders CUSTOMERS_WITH_MOST_ORDERS = allCustomers ->
            allCustomers
                    .stream()
//                    .parallel()
                    .map(customer ->
                            new Tuple(List.of(customer), customer.numberOfOrders()))
                    .reduce(TO_CUSTOMERS_WITH_MOST_ORDERS)
                    .map(Tuple::customers)
                    .orElse(List.of());
}