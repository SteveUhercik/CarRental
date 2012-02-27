package cz.muni.fi.pv168.carRental;

/**
 * Representation of a price.
 */
public class Price
{
    private long value;

    public long getValue()
    {
        return value;
    }

    public void setValue(long value)
    {
        this.value = value;
    }

    public String toString()
    {
        return (value / 100) + "." + (value % 100) + "\u20AC"; // EUR sign
    }
}
