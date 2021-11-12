/*
Implement the static double getDistance(x1, y1, x2, y2) method. It should calculate the distance between two points.
Use the double Math.sqrt(double a) method, which calculates the square root of the passed argument.
{\sqrt  (}(x_{2}-x_{1})^{2}+(y_{2}-y_{1})^{2}).
 */
package GoodCode;

import java.util.Scanner;

/**
 *
 * @author Cam
 */
public class DistanceBetweenPoints {
    public static double getDistance(int x1, int y1, int x2, int y2) 
    {
        int Xdist = x2 - x1;
        double Xdist2 = Xdist * Xdist;
        int Ydist = y2 - y1;
        double Ydist2 = Ydist * Ydist;
        double Dist = Xdist2 + Ydist2;
        double FinalDist = Math.sqrt(Dist);
        return FinalDist;
        
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        double distance = getDistance(x1,y1,x2,y2);
        System.out.println(distance);
    }
}
