/*
 
/* arr[]  ---> Input Array 
        data[] ---> Temporary array to store current combination 
        start & end ---> Staring and Ending indexes in arr[] 
        index  ---> Current index in data[] 
        r ---> Size of a combination to be printed */


//      replace index with all possible elements. The condition 
            // "end-i+1 >= r-index" makes sure that including one element 
            // at index will make a combination with remaining elements 
            // at remaining positions 



 
package GoodCode;

import static CamsUsefulMethods.printA.printA;
import static CamsUsefulMethods.printAll.printP;
import static CamsUsefulMethods.printAll.printST;

/**
 *
 * @author Cam
 */
public class ArrayCombos {

    public static void main(String[] args)
    {
        
        int[] array = {1,2,3,4};
        int start = 0;
        int end = array.length;
        
        int comboSize = 2;        
        int[] data = new int[comboSize];
        int index = 0;
        
        //combos(array, start, end, comboSize, data, index);
        
       /* productTest(3);
        printP("End of stack.. moving down main method. ");
        printST(Thread.currentThread());*/
       
        arrayProductTest(array, index);
  
        
        
    }
    
    public static void combos(int[] a, int start, int end, int comboSize, int[] data, int index)
    {
        if(index == data.length) 
        {
            printA(data); //Prints the data[] array and current combo.. Could simply add it to a list? 
            return; //Ends this stack and returns back to the previous call of "combo". 
        }
        
        
    }
    
    public static void productTest(int i)
    {
        int product = 0;
        
        
        product = i * 2;
        if(product > 100)
        {
            
            return;
        }
        
        else
        {   
            printST(Thread.currentThread());
  
            printP(product + "_1");
            productTest(product);
            printP(product + "_2");
            printST(Thread.currentThread());
            /*Looks like you don't really need a return function here.. The stack just unwinds by itself back to main 
            but clearly you would want a return to direct you back to the right place. 
            */
  
        }      
    }
    
    public static void arrayProductTest(int[] array, int product)
    {
        /*
        if(product > 1000)
        {
            catchProduct(product);
            return;
        }
        
        for (int i = 0; i < array.length; i++)
        {
            product += array[i];
            //arrayProductTest(array, product);
            //printP(product);
            
        }
        
        arrayProductTest(array, product);
        printP("Unwinding Stack..." + product);
        
        */
        
        //Could accomplish the same task with a while loop like this.
        
        while (product < 1000)
        {
            for(int i = 0; i < array.length; i++)
            {
                product += array[i];
                printP(product);
            }
        }
        
        printP("Final product.." + product);
    }
    
    public static int catchProduct(int i)
    {
        printP("Max is: " + i);
        return i;
    }
}
