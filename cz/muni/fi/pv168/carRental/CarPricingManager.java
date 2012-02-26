package cz.muni.fi.pv168.carRental;

import java.util.List;

/**
 * CarPricingManager.
 */
public interface CarPricingManager
{
    CarPricing create(CarPricing carPricing);

    List<CarPricing> findAll();

    CarPricing findById(long id);

    void update(CarPricing carPricing);

    void delete(CarPricing carPricing);
}
