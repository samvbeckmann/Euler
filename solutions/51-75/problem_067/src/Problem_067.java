import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * <b>Problem 67: Maximum path sum II</b><br>
 * Moves up a triangle to calculate the theoretical maximum route down.<br>
 * <i>Note: Also solves problem 18.</i>
 * @author Sam Beckmann
 */
public class Problem_067
{
    public static final int NUM_LINES = 100;
    public static long[][] ar = new long[NUM_LINES][NUM_LINES];
    public static final String FILE_NAME = "data_p067.txt";

    public static void main(String [] args) throws IOException
    {

        File file = new File(FILE_NAME);
        Scanner reader = new Scanner(file);

        // Fill the array
        for (int x = 0; x < NUM_LINES; x++)
        {
            for (int y = 0; y < x + 1; y++)
                ar[x][y] = reader.nextLong();
        }

        for (int currentLine = NUM_LINES-2; currentLine >= 0; currentLine--)
        {
            for (int place = 0; place <= currentLine; place++)
            {
                if (ar[currentLine+1][place] > ar[currentLine+1][place+1])
                    ar[currentLine][place] += ar[currentLine+1][place];

                else
                    ar[currentLine][place] += ar[currentLine+1][place+1];
            }
        }
        System.out.println(ar[0][0]);
    }
}
