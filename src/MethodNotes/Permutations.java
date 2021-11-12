/*

A permutation of a set is a rearrangement of its elements. A set which consists of n elements has n! permutations.
Here n! is the factorial, which is the product of all positive integers smaller or equal to n.

[1,2,3] Permutation # = 3*2*1 = 6 possible combiations

Techniques
1) Recursion- Pros, Cons? 


 */
package MethodNotes;

import CamsUsefulMethods.buildRandom;
import static CamsUsefulMethods.printA.printA;

import static CamsUsefulMethods.printAll.printP;
import static CamsUsefulMethods.printAll.printST;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Cam
 */
public class Permutations {

    public static void main(String[] args)
    {
        Recursion.RecrusionTests();
        
    }

    
    
    public static class Recursion
    {
    
        public static void RecrusionTests()
        {
            //ArrayList<Integer> testList = buildRandom.buildRandomIntList();
           
        
            //Basic recursion concept
             basicRecurison(5);
            
            //all combos in an array with 
            //ArrayCombination a = new ArrayCombination();
            //a.startRecursion();
               
        }
        
        public static void basicRecurison(int test)
        {             
            if (test < 1)
            {
                return;
            }
                
            else 
            { 
            //System.out.printf("%d ", test);
                printP(test);
                printST(Thread.currentThread());
  
            // Statement 2 
                basicRecurison(test - 1); 
  
            //System.out.printf("%d ", test); 
                printP(test);
                printST(Thread.currentThread());
                
                return; 
            }     
        }
        
        
        
    public static class ArrayCombination { //Inside the Recursion class
        
        /* arr[]  ---> Input Array 
        data[] ---> Temporary array to store current combination 
        start & end ---> Staring and Ending indexes in arr[] 
        index  ---> Current index in data[] 
        r ---> Size of a combination to be printed */
        void combinationUtil(int arr[], int data[], int start, 
                                int end, int index, int r) 
        { 
            // Current combination is ready to be printed, print it 
            if (index == r) 
            { 
                
                for (int j=0; j<r; j++) 
                System.out.print(data[j]+" "); 
                System.out.println(""); 
               
                return; 
            } 
  
            // replace index with all possible elements. The condition 
            // "end-i+1 >= r-index" makes sure that including one element 
            // at index will make a combination with remaining elements 
            // at remaining positions 
            for (int i= start; i<=end && end-i+1 >= r-index; ) 
            { 
                
                data[index] = arr[i]; 
             
                combinationUtil(arr, data, i+1, end, index+1, r); 
                i++; //Just makes the loop easier to understand
                //Its the incramentation of start that moves up the array. 
                
                /*                
                
                Give [1,2,3,4,5], What happens to data[]..
                
                Key arguments... combinationUtil(start = i +1, end = array.length, index += 1)
                
                Orignal arguments below.
                combinationUtil(start = 0, end = 3, index = 0, combosize/r = 3)
                
                Evaluate loop statments....
                Loop 1: i = start = 0, (end-i+1 = 3 - 0 + 1 = 4),  (r-index) = 3 - 0 = 3,
                Is start <= end? Y, is (end-i+1) => (r-index)? Y, Incriment i?, N
                           
                data[0] = arr[0] = 1
                data = [1]                
                
                combinationUtil(start = 0, end = 3, index = 1)
                              
                Loop 2: i = start = 1
                start = 1 //At this point i++ has not happened yet..// end = 2, index = 1
                data[1] = arr[1] = 2
                data = [1,2]                
              
                combinationUtil(start = 0, end = 3, index = 2)
                
                Loop3: i =2 = start = 2, (end-i+1 = 2), (r - index) = 3-2 = 1
                Is start <= end? Y, is (end-i+1) => (r-index)? Y, Incriment i? N
                data[2] = arr[2] = 3
                data = [1,2,3]
                
                combinationUtil(start = 
                
               
                
                */
            } 
        } 
  
        // The main function that prints all combinations of size r 
        // in arr[] of size n. This function mainly uses combinationUtil() 
        void printCombination(int arr[], int end, int comboSize) 
        { 
            // A temporary array to store all combination one by one 
            int data[]=new int[comboSize]; 
  
            // Print all combination using temprary array 'data[]' 
            combinationUtil(arr, data, 0 /*starting index arr[]*/, end-1 /*ending index arr[]*/, 0 , comboSize); 
        } 
  
        /*Driver function to check for above function*/
        public void startRecursion() 
        { 
            int arr[] = {1, 2, 3, 4, 5}; 
            int comboSize = 3; 
            int end = arr.length; 
            printP("Orignal Array");
            printP(Arrays.toString(arr));
            printP("_____");
            printCombination(arr, end, comboSize); 
        } 

         
    } 
    
    }    
    
}

