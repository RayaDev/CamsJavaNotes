/*

Below are some examples of other peoples code that were much cleaner than mine ;)


Completed!! But clean it up. Seems pretty inefficient. 
w

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
public class Task_15_19_1 {
    public static void main(String[] args) throws IOException {
     
       while(true)
       {
           Scanner sc = new Scanner(System.in);
           
           String key = sc.nextLine();
           if(key.equals("exit")) break;

           try
           {
               if (key.contains("."))        
               {    
                   print(Double.parseDouble(key));               
               }
               
               else if (Integer.parseInt(key) > 0 && Integer.parseInt(key) < 128)   
               { 
                   print(Short.parseShort(key));               
               }
               
               else if (Integer.parseInt(key) <= 0 || Integer.parseInt(key) >= 128) 
               {                    
                   print(Integer.parseInt(key));              
               }
            }
          
           catch(NumberFormatException e)
           {
               print(key);
           }
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

/*


This one got the task to verify.


public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String s = r.readLine();
            if(s.equals("exit")) break;
            if(s.contains("."))
            {
                
                try{
                    Double d = Double.parseDouble(s);
                    print(d);
                }
                catch(NumberFormatException e){
                    print(s);
                }
                
            }
            else{
                try{
                    Integer i = Integer.parseInt(s);
                    if(i>0 && i<128){
                        short sh = i.shortValue();
                        print(sh);
                    }
                    else print(i);

                }
                catch(NumberFormatException e){
                    print(s);
                }
            }

        }
    }

*/
