import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * <b>Problem 13: Large Sum</b><br>
 * Sums 100 50-digit numbers.
 * @author Sam Beckmann
 */
public class Problem_013
{
    public static final String FILE_PATH = "data/data_p013.txt";

    public static void main(String [] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));

        String line;
        String[] ar;
        ar = new String[100];

        for (int lineNum = 0; lineNum < 100; lineNum++)
        {
            line = reader.readLine();
            ar[lineNum] = line;
        }
        int carryOver = 0;

        for (int charNum = 49; charNum >= 0; charNum--)
        {
            int lineTotal = 0;
            for (int i = 0; i < 100; i++)
            {
                lineTotal += Character.getNumericValue(ar[i].charAt(charNum));
            }
            lineTotal += carryOver;

            carryOver = lineTotal / 10;
            int remainder = lineTotal % 10;
            System.out.print(remainder + " ");
        }
        System.out.print(carryOver);
    }
}
