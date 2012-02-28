package cz.muni.fi.pv168.carRental;

/**
 * Representation of a price.
 */
public class Price
{
    private long value;

    private boolean nonNegative;

    public long getValue()
    {
        return (nonNegative ? 1 : -1) * value;
    }

    public void setValue(long value)
    {
        this.value = Math.abs(value);

        this.nonNegative = value >= 0;
    }

    public String toString()
    {
        return (nonNegative ? "" : "-") + (value / 100) + "." + (value % 100) + "\u20AC"; // EUR sign
    }
}
