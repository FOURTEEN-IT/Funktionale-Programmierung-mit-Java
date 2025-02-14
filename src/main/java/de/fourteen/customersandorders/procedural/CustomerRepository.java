package de.fourteen.customersandorders.procedural;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class CustomerRepository {

    private final Collection<Customer> allCustomers /* = ... */;

    CustomerRepository(final Collection<Customer> allCustomers) {
        this.allCustomers = allCustomers;
    }

    CustomerRepository(Customer... customers) {
        this(List.of(customers));
    }

    Collection<Customer> customersWithMostOrders() {
        Collection<Customer> customersWithMostOrders = new ArrayList<>();
        int mostOrders = 0;
        for (Customer customer : this.allCustomers) {
            int numberOfOrdersByThisCustomer = customer.numberOfOrders();
            if (numberOfOrdersByThisCustomer > mostOrders) {
                customersWithMostOrders = new ArrayList<>(List.of(customer));
                mostOrders = numberOfOrdersByThisCustomer;
            } else if (numberOfOrdersByThisCustomer == mostOrders) {
                customersWithMostOrders.add(customer);
            }
        }
        return customersWithMostOrders;
    }
}
