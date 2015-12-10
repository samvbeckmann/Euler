/**
 * <b>Problem 3: Largest Prime Factor</b><br>
 * Finds the prime factors of a number.
 * @author Sam Beckmann
  */
public class Problem_003
{
	public static void main(String [] args)
	{

		long compare = 600851475143L;
		
		for (long testNum = 2; testNum < compare; testNum++) // This can increment every time. It won't find all the factors, but it will find the highest one.
		{
			if(compare % testNum == 0)
			{
				System.out.println("Factor Found: " + testNum);
				compare = compare / testNum;
			}
		}
		System.out.println("Final Factor found: "+ compare);
	}
}
