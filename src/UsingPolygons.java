import java.util.*;
public class UsingPolygons
{
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         Triangle t = new Triangle();
         t.readSideLengths(sc);
         System.out.println(t);
         System.out.println("perimeter: " + t.perimeter());
         System.out.println("area: " + t.area());
         Rectangle r = new Rectangle();
         r.readSideLengths(sc);
         System.out.println(r);
         System.out.println("perimeter: " + r.perimeter());
         System.out.println("area: " + r.area());
     } 
}