package cz.muni.fi.pv168.carRental;

import java.util.List;

/**
 * RentalManager.
 */
public interface RentalManager
{
    Rental add(Rental rental);

    List<Rental> findAll();

    /**
     * Find all active rentals.
     * @return list of all active rentals.
     */
    List<Rental> findAllActive();

    Rental findById(long id);

    void update(Rental rental);

    void delete(Rental rental);
}
