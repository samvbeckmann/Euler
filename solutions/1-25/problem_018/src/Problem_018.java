import java.io.*;
import java.util.Scanner;

/**
 * <b>Problem 18: Maximum path sum I</b><br>
 * Moves up a triangle to calculate the theoretical maximum route down.<br>
 * <i>Note: Also solves problem 67.</i>
 * @author Sam Beckmann
 */
public class Problem_018
{
    public static final int NUM_LINES = 15;
    public static int[][] ar = new int[NUM_LINES][NUM_LINES];
    public static final String FILE_PATH = "data_p018.txt";

    public static void main(String [] args) throws IOException
    {

        File file = new File(FILE_PATH);
        Scanner reader = new Scanner(file);

        // Fill the array
        for (int x = 0; x < NUM_LINES; x++)
        {
            for (int y = 0; y < x + 1; y++)
                ar[x][y] = reader.nextInt();
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
