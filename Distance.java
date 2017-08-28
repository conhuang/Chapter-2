
/**
 * Computes the distance between two points
 *
 * @author Connie Huang
 * @version August 29, 2017
 */
import java.util.Scanner;

public class Distance
{
    public static void main (String[] args)
    {
        System.out.println ("\f");
        double x1, y1, x2, y2; // coordinates of two points
        double distance; // distance between the points
        Scanner scan = new Scanner(System.in);
        // Read in the two points
        System.out.print ("Enter the coordinates of the first point " +
                          "(put a space between them): ");
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        
        System.out.print ("Enter the coordinates of the second point: ");
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();
        
        distance = Math.sqrt((y2-y1)*(y2-y1) + (x2-x1)*(x2-x1));
        
        System.out.println ("Distance = " + distance);
    }
}