import java.util.*;

public class Rectangle extends AbstractPolygon 
{
    public Rectangle()
    {
        super("Rectangle", 4);
    }
    public void readSideLengths(Scanner s) 
    {
    	System.out.println("You are required to enter the lengths of the sides of your rectangle."); 
    	System.out.println("A well defined rectangle has two pairs " + "of sides of equal lengths."); 
    	super.readSideLengths(s);
    	double[] side = getSideLengths();
    	if (side[0] == side[getNumberOfSides()-1]) 
    		specialiseName("Square"); }
    public double area()
    {
    	double[] side = getSideLengths();
        return side[0]*side[3];
    }
}