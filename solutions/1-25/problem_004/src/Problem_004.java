/**
 * <b>Problem 4: Largest Palindrome Product</b><br>
 * Finds the largest palindrome that's the product of two three-digit numbers.
 * @author Sam Beckmann
 */
public class Problem_004
{
	public static void main(String [] args)
	{
		int testNum,
			currentValue = 0;
		String forward, reverse;
		
		for(int num1 = 999; num1 > 0; num1--)
		{
			for(int num2 = 999; num2 > 0; num2--)
			{
				testNum = num1 * num2;
				forward = Integer.toString(testNum);
				reverse = new StringBuilder(forward).reverse().toString();
				if (forward.equals(reverse))
				{
					if(currentValue < testNum) currentValue = testNum;
				}
			}
		}
		
		System.out.println("Highest palindrome: " + currentValue);
	}
}
