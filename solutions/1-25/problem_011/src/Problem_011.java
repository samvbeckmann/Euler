import java.io.*;

/**
 * <b>Problem 11: Largest Product in a Grid</b><br>
 * Finds the largest product of multiplying 4 adjacent numbers in a 20 by 20 grid.
 * @author Sam Beckmann
 */
public class Problem_011
{
    public static final String FILE_PATH = "data/data_p011.txt";

	public static void main(String [] args) throws IOException
	{

		BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
		
		String line;
		int[] array;
		array = new int[400];
		int count;
		long highest;
		
		for (int lineNum = 0; lineNum < 20; lineNum++)
		{
			line = reader.readLine();
			String[] parts = line.split(" ");
			count = 0;
			for (String part : parts)
			{
				array[count + (20 * lineNum)] = Integer.valueOf(part);
				count++;
			}
		}

		highest = highLine(array);
		if (highColumn(array) > highest) highest = highColumn(array);
		if (highRightDiagonol(array) > highest) highest = highRightDiagonol(array);
		if (highLeftDiagonol(array) > highest) highest = highLeftDiagonol(array);
		
		System.out.println("Highest product: " + highest);
		
		reader.close();
		
	}
	
	public static long highLine(int[] line) // Finds the highest product of 4 consecutive numbers in a row
	{
		long holder,
			currentHighest = 0;
		for (int lineTested = 0; lineTested < 400; lineTested += 20)
		{
			for(int count = 0; count < 17; count++) // better way to do this loop? Clean up holder line?
			{
				holder = line[lineTested + count] *
						line[lineTested + count + 1] *
						line[lineTested + count + 2] *
						line[lineTested + count + 3];
				if (currentHighest < holder) currentHighest = holder;
				
			}
		}
		
		return currentHighest;
	}
	
	public static long highColumn(int[] column) // Finds the highest product of 4 consecutive numbers in a column
	{
		long holder,
			currentHighest = 0;
		for (int columnTested = 0; columnTested < 340; columnTested += 20)
		{
			for (int count = 0; count < 20; count++) // better way to do this loop? Clean up holder line?
			{
				holder = column[columnTested + count] *
						column[columnTested + count + 20] *
						column[columnTested + count + 40] *
						column[columnTested + count + 60];
				if (currentHighest < holder) currentHighest = holder;
				
			}
		}
		
		return currentHighest;
	}
	
	public static long highRightDiagonol(int[] array) // Find the highest product of 4 numbers in a right diagonal.
	{
		long holder,
			currentHighest = 0;
		for(int column = 0; column < 340; column += 20) // Iterates through the rows that start the diagonal.
		{
			for (int row = 0; row < 17; row++)
			{
				holder = array[column + row] *
						array[column + row + 21] *
						array[column + row + 42] *
						array[column + row + 63];
				
				if (currentHighest < holder) currentHighest = holder;
			}
		}
		return currentHighest;
	}
	
	public static long highLeftDiagonol(int[] array) // Find the highest product of 4 numbers in a left diagonal.
	{
		long holder,
			currentHighest = 0;
		for(int column = 0; column < 340; column += 20) // Iterates through the rows that start the diagonal.
		{
			for (int row = 19; row > 2; row--)
			{
				holder = array[column + row] *
						array[column + row + 19] *
						array[column + row + 38] *
						array[column + row + 57];
				
				if (currentHighest < holder) currentHighest = holder;
			}
		}
		return currentHighest;
	}
}
