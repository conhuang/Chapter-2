/**
 * Purpose: Determine how much paint is needed to paint the walls
 * of a room given its length, width, and height
 *
 * @author Connie Huang
 * @version August 29, 2017
 */
import java.util.Scanner;
public class Paint
{
    public static void main(String[] args)
    {
        System.out.println ("\f");
        final int COVERAGE = 350;  //paint covers 350 sq ft/gal
        int length, width, height;
        double totalSqFt;
        double paintNeeded;
        Scanner scan = new Scanner (System.in);

        System.out.print ("What is the length of the room? ");
        length = scan.nextInt();
        
        System.out.print ("What is the width of the room? ");
        width = scan.nextInt();

        System.out.print ("What is the height of the room? ");
        height = scan.nextInt();
        
        System.out.print ("How many windows are in the room? ");
        int windows = scan.nextInt();
        
        System.out.print ("How many doors are in the room? ");
        int doors = scan.nextInt();

        totalSqFt = 2*length*height + 2*width*height - 15*windows - 20*doors;

        paintNeeded = totalSqFt/COVERAGE;

        System.out.println ("\nLength = " + length + " ft\nWidth = "
                             + width + " ft\nHeight = " + height +
                             " ft\nGallons of paint needed to paint the walls: " + paintNeeded + 
                             " gal");
                            
    }
}
