/**
 * This is the driver program to create Circle objects from the 
 * Circle class.
 * 
 * @author Connie Huang 
 * @version August 29, 2017
 */
import java.util.Scanner;

public class CircleTest
{
  public static void main(String[] args)
  {
    //Start Scanner object
    Scanner scan = new Scanner(System.in);
    
    /*prompt user for radius then create 
     * first circle object. Calculate area and print.
     */
    System.out.print("\fEnter Circle 1 radius: ");
    double r = scan.nextDouble();
    Circle circle = new Circle(r);
    double area = circle.getArea();
    double circumference = circle.getCircumference();
    System.out.println("Circle 1: radius = " + r + " area = " + area + 
                       " sq.units \ncircumference = " + circumference + " units");
    
    /*prompt user for radius then create 
     * second circle object. Calculate area and print.
     */
    System.out.print ("\nEnter Circle 2 radius: ");
    double r2 = scan.nextDouble();
    Circle c2 = new Circle (r2);
    area = c2.getArea();
    circumference = c2.getCircumference();
    System.out.println("Circle 2: radius = " + r2 + " area = " + area + 
                       " sq.unit\ncircumference = " + circumference + " units");
    
     /*prompt user for radius then create 
     * second circle object. Calculate area and print.
     */
    System.out.print ("\nEnter Circle 3 radius: ");
    double r3 = scan.nextDouble();
    Circle c3 = new Circle (r3);
    area = c3.getArea();
    circumference = c3.getCircumference();
    System.out.println("Circle 3: radius = " + r3 + " area = " + area + 
                       " sq.units\ncircumference = " + circumference + " units");
  }
}
