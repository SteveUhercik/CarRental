package cz.muni.fi.pv168.carRental;

import java.util.List;

/**
 * CustomerManager.
 */
public interface CustomerManager
{
    Customer create(Customer customer);

    List<Customer> findAll();

    Customer findById(long id);

    void update(Customer customer);

    void delete(Customer customer);
}
