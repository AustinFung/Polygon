import java.util.*;
public class Triangle extends AbstractPolygon 
{
    public Triangle()
    {
        super("Triangle", 3);
    }
    public void readSideLengths(Scanner s) {
    	System.out.println("You are required to enter the lengths of the sides of your triangle."); 
    	System.out.println("The length of any side in a triangle\n" + 
    							"is less than the sum of the lengths of the other two sides.");
    	super.readSideLengths(s);
    	double[] side = getSideLengths();
    	if (side[0] == side[getNumberOfSides()-1]) 
    		specialiseName("Equilateral Triangle"); }
	public double area() // computed according to Heron’s formula 
	{
		double[] side = getSideLengths();
		double p = perimeter()/2;
		double value = p*(p-side[0])*(p-side[1])*(p-side[2]); 
		return Math.sqrt(value);
	} 
}