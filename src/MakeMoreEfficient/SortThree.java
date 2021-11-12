/*

 */
package MakeMoreEfficient;

import java.util.Scanner;

public class SortThree {
     
public static int [] array1; 
public static int counter;
    
    public static void main(String[] args) throws Exception {
        array1 = new int [3];
        System.out.println ("Enter 3 numbers..");
        Scanner number = new Scanner(System.in); 
        
        for(int i=0; i<array1.length; i++) { //Prompt as many times as the array size
        array1[i] = number.nextInt();
        }
        
       loopmin();
    }
    
    public static void loopmin(){
        
        int n = array1.length;
        int newArray[]= new int[n];
        int i;
        for (i = 0; i < n; i++) {        
            System.out.println(" ");
            System.out.println("The loopmin count is.. " + counter);
            
            
            newArray[i] = findmin(array1);
            counter = counter + 1;
            System.out.println(" ");
            System.out.println("The number stored in array slot " + i + " is " + newArray[i]);
           
            
            
        }
         //System.out.println(newArray[0]);
         //System.out.println(newArray[1]);  
        // System.out.println(newArray[2]); 
         
    }
            
    public static int findmin (int [] array){ 

        int min = array[counter];//Needs to start at the next element. Not 0. Needs like a global counter.  
        System.out.println(" ");
        System.out.println("The findmin setting is " + min);
        for (int i = counter; i < array.length; i++) {
               System.out.println("The findmin i loop is.." +i);
               System.out.println("The number to be compared is " + array[i]);
               System.out.println("It is being compared to " + min);
               if (array[i] <= min){
               
               min = array[i];
               System.out.println("The if looped min is " + min);
               
               
               }          
              // else {
                  //min = min; } //not entierly needed, but helps my brain. 
                  //System.out.println("The else looped min is " + min);
        }
               return min;
         
    }

}