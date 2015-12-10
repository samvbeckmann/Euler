import java.util.Arrays;

/**
 * Euler, class made on 2015-11-03
 *
 * @author Sam Beckmann
 */
public class CSet
{
    private long[] collatzSet;

    public CSet()
    {
        collatzSet = new long[1000000];
        Arrays.fill(collatzSet, 0);
        collatzSet[0] = 1;
    }

    public long getLength(long value)
    {
        if (value <= 1000000)
        {
            long length = collatzSet[(int) value - 1];
            if (length == 0)
                return collatzSet[(int) value - 1] = 1 + getLength(getNextValue(value));
            else
                return length;
        }
        else
            return 1 + getLength(getNextValue(value));
    }

    static long getNextValue(long value)
    {
        if (value % 2 == 0)
            return value / 2;
        else
            return 3 * value + 1;
    }
}
