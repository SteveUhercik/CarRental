package cz.muni.fi.pv168.carRental;

import java.util.List;

/**
 * CarManager.
 */
public interface CarManager
{
    Car createCar(Car car);

    List<Car> findAll();

    Car findCarById(long id);

    void updateCar(Car car);

    void deleteCar(Car car);
}
