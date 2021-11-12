/*
Calling and returning methods, pay attention to the type of method being called
 */
package Level2;

/**
 *
 * @author Cam
 */
public class Methodman3
{
   public static void main(String[] args)
   {
      int a = 5, b = 7;
      int m = min(a, b);
      System.out.println("The minimum is "+ m);
   }

   public static int min(int c, int d)
   {
      int m2;
      if (c < d)
           m2 = c;
      else
           m2 = d;

      return m2;
   }
}