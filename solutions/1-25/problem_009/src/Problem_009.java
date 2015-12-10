/**
 * <b>Problem 9: Pythagorean Triplet</b><br>
 * Finds a Pythagorean triplet where a + b + c = 1000.
 * @author Sam Beckmann
 */
public class Problem_009
{
	public static void main(String [] args)
	{
		double z;
		for(double x =  1; x < 1000; x++)
		{
			for (double y = 1; y < 1000; y++)
			{
				z = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
				if(x + y + z == 1000)
				{
					System.out.println("Found triplet: " + x + "," + y + "," + z);
					System.out.println("Product abc: " + x*y*z);
				}
			}
		}
	}
}
