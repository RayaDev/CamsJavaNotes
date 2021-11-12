/*
Completed!! But clean it up. Seems pretty inefficient. 


Polymorphism Task

1. Read data from the console until the word "exit" is entered.
2. For each value (except "exit"), call the print method. If the value:
2.1. contains a period ("."), then call the print method for Double;
2.2. is greater than zero, but less than 128, then call the print method for short;
2.3. less than or equal to zero or greater than or equal to 128, then call the print method for Integer;
2.4. otherwise, call the print method for String.


 */
package Level15;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Cam
 */
public class Task_15_19 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        while (!"exit".equals(input))
        {
            
            
            if (isDouble(input))
            {
                               
                double value = Double.parseDouble(input);
                print(value);
                input = sc.nextLine();
                                              
            }
            
            else if (isShort(input))
            {
                              
                short value = Short.parseShort(input);
                print (value);
                input = sc.nextLine();
                
                
            }
            
            else if (isInteger(input))
            {
                
            
                int value = Integer.parseInt(input);
                print(value);
                input = sc.nextLine();
                
                
            }
            
            else  //This goes last.Just prints the String.
            {
                print(input);
                input = sc.nextLine();
            }
            
        }
                    
    }
        
    
    private static boolean isDouble (String input)
    {
        if (input.contains(".")) //No parsing function here, so it doens't bug out. 
        {
            try 
            {
                double value = Double.parseDouble(input);
            }
            
            catch (Exception e)
            {
                System.out.println("Double exception caught. ");
                return false;
            }
            
            return true;
        }
        
        else 
        {
            return false;
        }
    }
    
    private static boolean isShort (String input)
    {
        
        try {
        short value = Short.parseShort(input); //Bug is occuring here. Try catch fixes it. 
        if (value > 0 && value < 128)
        {
            return true;
        }
        
        else
        {
            return false;
        }
        
        }
        catch (Exception e)
                {
                   
                    System.out.println("Short exception caught.");
                    return false; 
                }
    }
    
    private static boolean isInteger (String input)
    {
        
        try {
        int value = Integer.parseInt(input);
        if (value <= 0 || value >= 128 )
        {
            return true;
        }
        else
        {
            return false;
        }
        
        }
        catch (Exception e) 
                {
                    
                    System.out.println("Integer exception caught.");
                    return false;
                }
    }
    
    private static void print(Double value) {
        System.out.println("This is a Double. Value: " + value);
    }

    private static void print(String value) {
        System.out.println("This is a String. Value: " + value);
    }

    private static void print(short value) {
        System.out.println("This is a short. Value: " + value);
    }

    private static void print(Integer value) {
        System.out.println("This is an Integer. Value: " + value);
    }
}
