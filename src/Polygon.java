import java.util.*;

public interface Polygon
{
	String getName();
    int getNumberOfSides();
    double[] getSideLengths();
    double perimeter();
    double area();
    void readSideLengths(Scanner s);
    void specialiseName(String preciseName);
}