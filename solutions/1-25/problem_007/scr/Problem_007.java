/**
 * <b>Problem 7: 10001st Prime</b><br>
 * Finds the 10001st prime number.<br>
 * TODO: Optimize using new sieve method.
 * @author Sam Beckmann
 */
public class Problem_007
{
    public static void main(String [] args)
    {

        final int numberPrimes = 10001;
        int[] primes;
        primes = new int[numberPrimes];
        int possiblePrime = 3; // array is initialized with 2, so start at next number
        boolean testPrime;

        primes[0] = 2;

        for (int primeCounter = 1; primeCounter < numberPrimes;)
        {

            testPrime = false;
            possiblePrime += 2; // only need to check odd numbers

            for (int compare = 0; compare < primeCounter; compare++)
            {
                if(possiblePrime % primes[compare] == 0) testPrime = true;
            }
            if (!testPrime)
            {
                primes[primeCounter] = possiblePrime;
                primeCounter++;
            }

        }

        System.out.println("" + numberPrimes + "th Prime: " + primes[(numberPrimes-1)]); // Display the found prime
    }
}
