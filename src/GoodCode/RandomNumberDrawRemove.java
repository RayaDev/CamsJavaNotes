/*
 
Creates a random lottery where each number can only be drawn once.
No more duplicates, but won't populate the entire Set if a duplicate does occur. 
Yesss finallyyy solvied itttttt...


Now add an option to select a winner from their ticket number.
So randomly generate a ticket number, and return the person assoicated with it.
Use a HashMap.

Still an issue with the draw method. Pulling dupes. 
Fixed it!


Add functionality where each ticket number is assocaited with a random String "name"

That way you can link the ticket number with the String. 

 */
package GoodCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;


public class RandomNumberDrawRemove {

    public static void main(String[] args) 
    { 
       Set <Integer> Lottery = createLottery();
       System.out.println("Printing all contestants");
       printSet(Lottery);
       
       Set<Integer> Winners = DrawLottery(Lottery);
       printSet(Winners);
      
    }
    
    private static Set<Integer> createLottery()
    {
       Set <Integer> Lottery = new HashSet<>();       
       Scanner sc = new Scanner(System.in);
       Random r = new Random();
       
       
       System.out.println("How many people should be put into the drawing?");
       int people = sc.nextInt();
       
       
       System.out.println("How big should the range of ticket numbers be?");      
       int input = sc.nextInt();
           
       int i = 0;
       while (i < people)
       {
           
           int range = r.nextInt(input);
           
           Lottery.add(range); //If add was succesful, go to the next line, otherwise loop back and keep trying. Becuase a Set does not allow duplicates. 
           i = Lottery.size();
       }
             
     
       return Lottery;
    }
        
    private static Set <Integer> DrawLottery(Set<Integer> list)
    {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        
        ArrayList<Integer> ConvertSet = new ArrayList<>();
        Set <Integer> Winners = new HashSet<>();
        
        System.out.println("How many winners should there be?");
        int winners = sc.nextInt();
               
        for (int i : list)
        {
            ConvertSet.add(i);           
        }
        
        int i = 0;
        while (i < winners)
        {
            int A_Winner = ConvertSet.get(r.nextInt(ConvertSet.size()));
            Winners.add(A_Winner);
            i = Winners.size();
        
        }
        
       /* ArrayList<Integer> Winners1 = new ArrayList<>();
        
        for (int j : Winners)
        {
            Winners1.add(j);
        } */
        return Winners;
    }
    private static void printSet(Set <Integer> list)
    {
        int j = 0;
        for (int i : list)
        {
            

            //System.out.println("Person " + list.indexOf(i)+ " has number " + i + " on their ticket");
            
            //System.out.println(list.indexOf(i) + " : " + i); //Set does not support index functions. 
            
            System.out.println(j + " : " + i);
            
            j++;
        }
    }
    
    private static void printList(ArrayList <Integer> list)
    {
        int j = 0;
        for (int i : list)
        {
            

            //System.out.println("Person " + list.indexOf(i)+ " has number " + i + " on their ticket");
            
            //System.out.println(list.indexOf(i) + " : " + i); //Set does not support index functions. 
            
            System.out.println(j + " : " + i);
            
            j++;
        }
    }
       
}
