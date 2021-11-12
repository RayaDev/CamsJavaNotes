/*

Weird bug with parsing to int. 

 */
package GoodCode;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cam
 */
public class GeneratoRandomTicketNumber {
    
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many digits should the ticket number be?");
        int digits = sc.nextInt();
        
        int[] TicketNumber = generateNumber(digits);
        //System.out.println(TicketNumber.length);
        
        printArray(TicketNumber);
        
        //System.out.println(createInt(TicketNumber));
        int i = Integer.parseInt(createInt(TicketNumber));
        System.out.println(i);
        
    }
    
    public static String createInt(int[] array)
    {
        String ticketNum = "";
        
        //create String from array, and parse to int.
        
        for (int i = 0; i < array.length; i++)
        {
            String num = Integer.toString(array[i]);
            ticketNum = ticketNum + num;
            System.out.println(ticketNum);
        }
        
        //int i = Integer.parseInt(ticketNum);
        
        return ticketNum;
    }
    
    public static int[] generateNumber(int number)
    {
        Random r = new Random();
        
        int[] array = new int[number];
        
        for (int i= 0; i < array.length; i++)
        {
            array[i] = r.nextInt(10);
        }
        
        
        return array;
    }
     
    public static void printArray(int[] array)
    {
         for (int i = 0; i <array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
     
}
