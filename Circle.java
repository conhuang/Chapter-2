/**
 * This class represents a Circle object.
 * Circles know their radius and can calculate
 * their Area and Circumference.
 * 
 * @author Connie Huang 
 * @version August 29, 2017
 */
public class Circle
{
    //data section
    private double radius;
    
    //constructor section - constructs Circle object
    /**
     * Constructor method to create object.
     * @param r the radius of a circle
     */
    public Circle(double r)
    {
        radius = r;
    }

    //method section
    /**
     * Function to calculate the area of a circle
     * @return returns the area of a circle
     */
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
    
    /**
     * Function to calculate the circumference of a circle
     * @return returns the circumference of a circle
     */
    public double getCircumference()
    {
        return Math.PI * radius * 2.0;
    }
}
