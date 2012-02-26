package cz.muni.fi.pv168.carRental;

import java.util.List;

/**
 * CarManager.
 */
public interface CarManager
{
    Car create(Car car);

    List<Car> findAll();

    Car findById(long id);

    void update(Car car);

    void delete(Car car);
}
