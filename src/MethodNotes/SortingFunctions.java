/*

Notes on:
Colections Sorting functions.
Sorting Strings with Collections.

Diffrent algorythms and methods that are actualy used inside sorting functions for integers. 


 */
package MethodNotes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cam
 */
public class SortingFunctions {
    
   public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("String Sort = 1, Integer Sort = 2");
        
        int i = sc.nextInt();        
        if(i == 1)
        {
        StringSorting.runStringSort();
        }
        
        if(i ==2)
        {
        IntegerSorting.runIntegerSort();
        }
                
    }  

public static class IntegerSorting {
    
    
    public static void runIntegerSort()
    {
        int[] array = buildArray();
        printArray(array);
        
        bubbleSort(array);
        insertionSort(array);
        
              
    }
    
    public static int[] buildArray()
    {
        int[] array = new int[10];
        Random r = new Random();
        //int i = r.nextInt(1000);
        
        for (int k = 0; k < array.length; k++)
        {
            int i = r.nextInt(1000);
            array[k] = i;
        }
        
        return array;
    }
    
    public static void bubbleSort(int[] array)
    {
        boolean sorted = false;
        int temp;
        
        while(!sorted) 
        {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) 
            {
                if (array[i] > array[i+1]) 
                {
                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                sorted = false;
                }
            }
        }
        System.out.println("Bubble Sorted array");
        System.out.println("______________");
        
        printArray(array);
    }
    
    public static void insertionSort(int[] array) 
    {
        for (int i = 1; i < array.length; i++) 
        {
            int current = array[i];
            int j = i - 1;
        
            while(j >= 0 && current < array[j]) 
            {
            array[j+1] = array[j];
            j--;
            }
            
            // at this point we've exited, so j is either -1
            // or it's at the first element where current >= a[j]
            array[j+1] = current;
        }
        
        System.out.println("Insertion Sort array");
        System.out.println("______________");
        
        printArray(array);
    }
    
    public static void printArray(int[] a)
    {
        System.out.println();
        System.out.println("Printing number array");
        System.out.println("______________________");
        
        for (int i : a)
        {
            System.out.println(i);
        }
    }
}


public static class StringSorting {
   
    private static final HashMap<String, Integer> alphabet = new HashMap();
    
    static {
        //Keys and values should be swapped, keys are unique, values are not. 
        //But this way actually makes it easier to sort alphbetically. 
        
        //Used for generating random Strings. 
        alphabet.put("a",1);
        alphabet.put("b",2);
        alphabet.put("c",3);
        alphabet.put("d",4);
        alphabet.put("e",5);
        alphabet.put("f",6);
        alphabet.put("g",7);
        alphabet.put("h",8);
        alphabet.put("i",9);
        alphabet.put("j",10);
        alphabet.put("k",11);
        alphabet.put("l",12);
        alphabet.put("m",13);
        alphabet.put("n",14);
        alphabet.put("o",15);
        alphabet.put("p",16);
        alphabet.put("q",17);
        alphabet.put("r",18);
        alphabet.put("s",19);
        alphabet.put("t",20);
        alphabet.put("u",21);
        alphabet.put("v",22);
        alphabet.put("w",23);
        alphabet.put("x",24);
        alphabet.put("y",25);
        alphabet.put("z",26);          
    } 
    
    public static void runStringSort()
    {
        ArrayList<String> wordList = generateStringArray();
        
        System.out.println("Orignal List");
        System.out.println("______________");
        
        for (String s : wordList)
        {
            System.out.println(s);
        }
        
        ascendingSort(wordList);
        
        descendingSort(wordList);
    }
    
    
    public static void ascendingSort(ArrayList<String> list)
    {
        
        System.out.println("");     
        System.out.println("Sorted List: Ascending");
        System.out.println("______________");
        
        Collections.sort(list); //Regular sort function call from Collections. You can right click for show java doc.  
                
        for (String s : list)
        {
            System.out.println(s);
        }
    }
    
    public static void descendingSort(ArrayList<String> list)
    {
        
        System.out.println("");     
        System.out.println("Sorted List: Descending");
        System.out.println("______________");
        
        
       Collections.sort(list, Collections.reverseOrder());
                
        for (String s : list)
        {
            System.out.println(s);
        }
    }
    
    
    public static ArrayList<String> generateStringArray()
    {
        
        ArrayList<String> wordList = new ArrayList<>();
        
        for (int i = 0; i < 10; i++)
        {
            String word = generateRandomString();
            wordList.add(word);
        }
        
        return wordList;
    }
    
    public static String generateRandomString()
    {      
        //So I guess you have to iterate through all the keys.. becuase values are not always unqiue!
        //Would be better to set the numbers as the keys, and the values as the letters ;[
        Random r = new Random();
           
        String word = "";
        int k = 0;
        int i = 10;
        while (k < i)
        {          
            String letter = "";
            int j = r.nextInt(25) + 1;
                        
            for (Map.Entry<String, Integer> value : alphabet.entrySet()) 
            {
                       
            if (value.getValue().equals(j)) 
                {  //Just plug in the value you want to check for here.  
                
                letter = value.getKey();
                //System.out.println(letter); 
                //System.out.println(j);
                
                }            
            }
            word = word + letter;
            k++;           
            
        } 
        
       // System.out.println(word);
        return word;
    }    
    
    //Trying to fiure out how to sort Strings with my own code. 
    /* public static void convertToInt (ArrayList<String> list)
    {
        for (String s : list)
        {
            
          //Split string into char, use the char as key values, convert them into ints
            //add them together then sort words by largest to smallest value
            //Convert them back to strings. 
            
            //But wait..don't characters allready have an bscis value.. how to use that? 
        }
    } */
    }
}
