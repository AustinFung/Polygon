import java.util.*;

public abstract class AbstractPolygon implements Polygon {
	private String name;
	private int numberOfSides; private double[] sideLengths;
	
	public AbstractPolygon(String name, int numberOfSides) 
	{
		this.name = name;
		this.numberOfSides = numberOfSides; sideLengths = new double[numberOfSides];
	}
	
	public String getName()
	{
		return name; 
	}
	
	public int getNumberOfSides() 
	{
		return numberOfSides; 
	}
	
	public double[] getSideLengths() 
	{
		return sideLengths;
	}
	
	public double perimeter()
	{
	    double perimeterLength = 0;
	    for (int i = 0; i < sideLengths.length; i++)
	        perimeterLength += sideLengths[i];
	    return perimeterLength;
	}
	
	public void readSideLengths(Scanner s) 
	{
		System.out.println("Please enter " + numberOfSides + " side lengths in ascending order and press ENTER"); 
		for (int i=0; i < numberOfSides; i++)
			sideLengths[i] = s.nextDouble(); s.nextLine();
	}
	
	public void specialiseName(String preciseName) 
	{ 
		name = preciseName; 
	} 
	
	public abstract double area();
	
	public String toString() 
	{
		String s = name + ": [";
	    for (int i=0; i < numberOfSides; i++)
	    if (i != numberOfSides - 1)
	        s = s + sideLengths[i] + ", ";
	    else
	        s = s + sideLengths[i];
	    s = s + "]";
	    return s;
	}
}