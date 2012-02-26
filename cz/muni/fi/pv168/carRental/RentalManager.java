package cz.muni.fi.pv168.carRental;

import java.util.List;

/**
 * RentalManager.
 */
public interface RentalManager
{
    Rental create(Rental rental);

    List<Rental> findAll();

    Rental findById(long id);

    void update(Rental rental);

    void delete(Rental rental);
}
