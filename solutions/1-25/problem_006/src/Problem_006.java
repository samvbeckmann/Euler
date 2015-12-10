/**
 * <b>Problem 6: Sum Square Difference</b><br>
 * Finds the difference between the sum of the squares and the square of the sums of a series
 * @author Sam Beckmann
  */
public class Problem_006
{
	public static void main(String [] args)
	{
		
		double sumSquares = 0;
		double squareSums = 0;
		for (int num1 = 1; num1 <= 100; num1++)
		{
			sumSquares += (Math.pow(num1, 2));
		}
		
		for (int num2 = 1; num2 <= 100; num2++)
		{
			squareSums += num2;
		}
		squareSums = Math.pow(squareSums, 2);
		
		System.out.println("Sum Squares: " + sumSquares);
		System.out.printf("Square Sums: %f\n", squareSums);
		System.out.printf("Difference: %f\n", (squareSums - sumSquares));
	}
}
