
/**
 * This program simulates the result of two dice and their total output.
 *
 * @author Connie Huang
 * @version August 31, 2017
 */
public class Dice
{
    public static void main (String[] args)
    {
        int roll1 = (int)(7 * Math.random());
        int roll2 = (int)(7 * Math.random());
        System.out.println ("\fFirst Roll: " + roll1 + "\nSecond Roll: " +
                            roll2 + "\nTotal Roll: " + (roll1 + roll2));
    }
}