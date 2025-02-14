package de.fourteen.customersandorders.procedural;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

final class SpeedTestProcedural {

    @Test
    void fiveUsersWithTenOrdersInTotal_aSingleCustomerWithMostOrders() {
        Customer customerWithMostOrders = new Customer(3, 3);
        CustomerRepository customerRepository = new CustomerRepository(
                new Customer(0, 2),
                new Customer(1, 2),
                new Customer(2, 1),
                customerWithMostOrders,
                new Customer(4, 2));

        Collection<Customer> result = customerRepository.customersWithMostOrders();

        assertThat(result).containsExactly(customerWithMostOrders);
    }
}
