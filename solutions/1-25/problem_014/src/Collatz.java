/**
 * Euler, class made on 2015-11-03
 *
 * @author Sam Beckmann
 */
public class Collatz
{
    public static void main(String[] args)
    {
        CSet set = new CSet();
        int longest = 0;
        long longestChain = 0;
        for (int i = 1; i < 1000000; i++)
        {
            if (set.getLength(i) > longestChain)
            {
                longest = i;
                longestChain = set.getLength(i);
            }
        }

        System.out.printf("%d, %d", longest, longestChain);
    }
}
