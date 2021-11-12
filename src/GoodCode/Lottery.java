/*
 
Creates a random lottery where each number can only be drawn once.


Uses Set to prevent duplicates!
Usse a HashMap to assign contestants to lottery numbers. 


Program has the following features.
Every contestant has a unqiue lottery number. No duplicates.
Draws a lottery number, checks it with the cotestants numbers, and displays a winner.
Loops through and counts the number of times the lottery was ran. 

 */
package GoodCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;


public class Lottery {

    public static int lottoNumberRange;
    
    public static void main(String[] args) 
    { 
       Set <Integer> Lottery = createLottery(); //Using set prevents any duplicate lottery numbers
       HashMap<Integer, Integer> Lottery_1 = createHashMap(Lottery); //HashMap ties the numbers to a specific person.
       System.out.println("Printing all contestants");   
       printHashMap(Lottery_1);
       
       drawByLotteryNum(Lottery_1);
       
      /* HashMap<Integer, Integer> Winners = drawByContestant(Lottery_1);
       System.out.println("The winners are...");
       printHashMap(Winners); */
    
    }
    
    private static Set<Integer> createLottery()
    {
       Set <Integer> Lottery = new HashSet<>();       
       Scanner sc = new Scanner(System.in);
       Random r = new Random();
       
       
       System.out.println("How many people should be put into the drawing?");
       int people = sc.nextInt();
       
       
       System.out.println("How big should the range of ticket numbers be?");      
       lottoNumberRange = sc.nextInt();
           
       int i = 0;
       while (i < people)
       {
           
           int range = r.nextInt(lottoNumberRange);
           
           Lottery.add(range); //If add was succesful, go to the next line, otherwise loop back and keep trying. 
           i = Lottery.size();
       }
             
     
       return Lottery;
    }
        
    private static HashMap<Integer,Integer> createHashMap (Set<Integer> set)
    {
        HashMap<Integer, Integer> Lottery = new HashMap<>();
        
        int i = 0;
        for (int num : set)
        {
            Lottery.put(i,num);
            i++;
        }
        
        return Lottery;
    }
   
    private static HashMap<Integer, Integer> drawByContestant (HashMap<Integer, Integer> map)
    {
        //This just draws a winner based off their contestant number. Which is what we want in the SpanishApp. 
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        HashMap<Integer, Integer> Winners = new HashMap<>();       
        ArrayList<Integer> keysAsArray = new ArrayList<>(map.keySet()); //Used for selecting a random key.
        
        System.out.println("How many winners should there be?");
        int numberOfWinners = sc.nextInt();
        
        int  i = 0;        
        while (i < numberOfWinners)
        {
        
        int randomNum = r.nextInt(keysAsArray.size()); //for selecting the index of a random element in the array
        int ContestantNum = keysAsArray.get((randomNum)); //finds the key from the list                
        int LotteryNum = map.get(ContestantNum); //pulls that found key from the actual map
               
        Winners.put(ContestantNum, LotteryNum);
        i++;
        
        }
        
        return Winners;
    }
    
    private static void drawByLotteryNum (HashMap<Integer, Integer> map)
    {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
                                               
        
        int runAgain = 1;
        int drawCount = 0;
        
        while (runAgain==1)
        {       
            
            int winnercheck = 0;
            int LotteryNum = r.nextInt(lottoNumberRange);
            //System.out.println("The winning number is: " + LotteryNum);
        
            for (Map.Entry<Integer, Integer> LottoMap : map.entrySet()) 
            {
            
                if (LottoMap.getValue().equals(LotteryNum)) 
                {  //Just plug in the value you want to check for here.  
            
                System.out.println("The winner is contestant " + LottoMap.getKey() + " with lotto number " + LotteryNum);
                
                
                winnercheck = 1;
                runAgain = 0;
                
                break;
                }  
                
                
            }    
            
            drawCount++;
            
            if (winnercheck == 0)
            {
                //System.out.println("No winner this time..");
               
            }
        
           /* System.out.println("Run the lottery again? 1 = Yes, 2 = No");
            runAgain = sc.nextInt(); */
        
        }
        System.out.println("The lotto ran " + drawCount + " times before a winner was drawn");
            
    }
    
           
    private static void printHashMap (HashMap <Integer, Integer > map)
    {
                
        Iterator ir = map.entrySet().iterator();
        while (ir.hasNext())
        {
            Map.Entry mapElement = (Map.Entry)ir.next(); //gets the mapElement String:Integer from the HashMap
            int LotteryNum = (int)mapElement.getValue(); //gets the specific value of the got mapElemenet, and casts it to an int
            int Contestant = (int)mapElement.getKey(); //gets the specific key of the got maElemenet. 
            
            System.out.println(Contestant + " : " + LotteryNum);
        }
    }      
}
