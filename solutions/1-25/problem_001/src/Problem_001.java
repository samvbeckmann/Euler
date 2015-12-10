/**
 * <b>Problem 1: Multiples of Three and Five</b><br>
 * Finds the sum of all multiples of three or five below 1000.<br>
 * @author Sam Beckmann
 */
public class Problem_001
{
    public static void main(String [] args)
    {
        int sum = 0;

        for (int i=0; i < 1000; i++)
        {
            if ((i % 3) == 0 || (i%5) == 0)
                sum += i;
        }

        System.out.println(sum);
    }
}
