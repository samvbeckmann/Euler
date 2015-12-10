/**
 * <b>Problem 2: Even Fibonacci Numbers</b><br>
 * Finds the sum of all even numbers in the Fibonacci Sequence.
 * TODO: Solve this recursively
 * @author Sam Beckmann
 */
public class Problem_002
{
	public static void main(String [] args)
	{
		int temp,
			small = 1,
			large = 2,
			sum = 0;

		while (large < 4000000) //Want Fib #s less then 4 M
		{
			if(large % 2 == 0) //only add even numbers
			{
				sum += large;
			}

			temp = small + large; //getting next Fibonacci number
			small = large;
			large = temp;
		}
		
		System.out.println("Sum: " + sum);
	}
}
