import java.util.Scanner;

public class CircleTest
{
  public static void main(String[] args)
  {
    System.out.println ("\f");
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the radius: ");
    double r = scan.nextDouble();
    Circle circle = new Circle(r);
    double area = circle.getArea();
    double circumference = circle.getCircumference();
    System.out.println("circle1: radius = " + r + " area = " + area + 
                       "\ncircumference = " + circumference);
    System.out.println ();                   
    System.out.print ("Enter a new radius: ");
    r = scan.nextDouble();
    area = circle.getArea();
    circumference = circle.getCircumference();
    System.out.println("circle2: radius = " + r + " area = " + area + 
                       "\ncircumference = " + circumference);
  }
}
