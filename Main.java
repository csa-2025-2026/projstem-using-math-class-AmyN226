import java.util.Scanner;    // optional to use user input
 
public class Main
{
    public static void main(String[] args)
    {
        // You can optionally use the Scanner for user input
        
        

        
        printRandom3(15);


        System.out.println (calcSlope(3.9, 4.8, 5.1, 1.2));

        System.out.println (roundedDist(-4.5, 12.56));


    }
    
    public static void printRandom3(int num)
    {
        int lowerBound = 2;
        int upperBound = num + 2;
        System.out.println ( (int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound) );
        System.out.println ( (int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound) );
        System.out.println ( (int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound) );

    }
    
    public static double calcSlope(double x1, double y1, double x2, double y2)
    {
        
        double slope = (  (y2 - y1) / (x2 - x1) );
        return (slope);


    }
    
    public static int roundedDist(double a, double b)
    {
       int dist = (int)(Math.abs(a - b)); 
       return (dist);


    }
}
