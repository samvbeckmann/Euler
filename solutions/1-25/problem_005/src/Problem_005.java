/**
 * <b>Problem 5: Smallest Multiple</b><br>
 * Finds the lowest number evenly divisible by all numbers between 1 and 20.<br>
 * TODO: Clean up code of if statement, optimize.
 * @author Sam Beckmann
 */
public class Problem_005
{
	public static void main(String [] args)
	{
		int testNum = 20;
		while(true)
		{	
			if (
					testNum % 19 == 0 &&
					testNum % 18 == 0 &&
					testNum % 17 == 0 &&
					testNum % 16 == 0 &&
					testNum % 15 == 0 &&
					testNum % 14 == 0 &&
					testNum % 13 == 0 &&
					testNum % 12 == 0 &&
					testNum % 11 == 0)
			{
				System.out.println("Lowest Number: " + testNum);
				return;
			}
			testNum += 20;
			System.out.println("Currently testing: " + testNum);
		}
	}
}
