package cz.muni.fi.pv168.carRental;

import java.util.List;

/**
 * CarManager.
 */
public interface CarManager
{
    Car add(Car car);

    List<Car> findAll();

    /**
     * Find all available cars.
     * @return list of all available cars.
     */
    List<Car> findAvailable();

    Car findById(long id);

    void update(Car car);

    void delete(Car car);
}
