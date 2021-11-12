/*
1. Create an array of 15 integers.
2. Populate it with values ​​from the keyboard.
3. Let the array index represent the house number. The array value at a particular index represents the number of people living in the corresponding house.
Houses with odd numbers are located on one side of the street. Those with even numbers are on the other side. Find out which side of the street has more people living on it.
4. Display the following message: "Odd-numbered houses have more residents." or "Even-numbered houses have more residents."

Note:
the house at index 0 is considered even.
 */
package Level7;

import java.util.Scanner;
import java.util.Random;

public class EvenOddHouses {
   
private static int houses[] = new int[15];
private static int EvenSum = 0;
private static int OddSum= 0;

    public static void main(String[] args) throws Exception 
    {
        Input();
        EvenOddCount();
        
        if (EvenSum > OddSum)
        {
            System.out.println("Even-numbered houses have more residents.");           
        }
        else 
        {
            System.out.println("Odd-numbered houses have more residents.");
        }       
    }
    
    private static void Input()
    {
        //Scanner sc = new Scanner(System.in);
        Random rand = new Random();
       
        for(int i = 0; i < houses.length; i++)
        {
            //int num = sc.nextInt();
            int n = rand.nextInt();
            houses[i] = n;
        }
    }
    
    private static void EvenOddCount()
    {               
        for (int i = 0; i < houses.length; i++)
        {
            if (i % 2 == 0)
            {
                EvenSum = EvenSum + houses[i];
            }
            else 
            {
                OddSum = OddSum + houses[i];
            }
        }
    }
}
