/*
Enter 10 strings from the keyboard and count the number of different letters in them 
for the 26 lowercase letters of the English alphabet). Display the results on the screen in alphabetical order.
 */
package GoodCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Cam
 */
public class NumberOfLetters {
    
    private static String abc = "abcdefghijklmnopqrstuvwxyz";
    private static char[] abcArray = abc.toCharArray();
    private static ArrayList<Character> alphabet = new ArrayList<>();
       
    public static void main(String[] args) throws Exception 
    {
          
        populateAlphabet();
        
        ArrayList<String> StringList = new ArrayList<>();
        StringList = writeStrings();
        
        System.out.println("Letter count for each string:");
        SingleStringLetterCount(StringList);
        
        System.out.println("Rolling total letter count for all strings:");
        RollingTotal(StringList);
                                      
    } 
    
    private static void populateAlphabet()
    {
        for (char letter : abcArray) 
        {
            alphabet.add(letter);
        }
    }
        
    private static ArrayList<String> writeStrings()
    {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 2; i++) 
        {
            String s = sc.nextLine();
            list.add(s.toLowerCase());
        }
        
        return list;
    }
    
    private static void SingleStringLetterCount (ArrayList<String> StringList)
    {
        HashMap<Character, Integer> ACount = new HashMap<>();
        
        for (String s : StringList)
        {
            char [] checking = s.toCharArray();        
        
            for (char letter : abcArray)
            {
                int count = 0;
            
                for (char letter1 : checking)
                {
                    if (letter == letter1)
                    {
                    count++;
                    }
                }
            
            ACount.put(letter, count);
           
            } 
            
            printHashMap(ACount); 
            System.out.println("_____________");
            System.out.println(" ");
        }
        
    }
        
    private static void RollingTotal(ArrayList<String> list)
    {
        HashMap<Character, Integer> ACount = new HashMap<>();
        for (char letter: abcArray)
        {
            int count1 = 0;
            ACount.put(letter,count1);
        
            for (String s : list)      
            {
                char[] checking = s.toCharArray();
            
                for (char StringCharacter : checking)
                {
                    if (StringCharacter == letter)
                    {
                    ACount.put(letter, ACount.get(letter)+1);
                    }              
                }          
            }        
        }
        
        printHashMap(ACount);
        
    }
    
    private static void printHashMap(HashMap<Character, Integer> map)
    {
        Iterator ir = map.entrySet().iterator();
        
        while (ir.hasNext())
        {
            Map.Entry mapElement = (Map.Entry)ir.next();
            int count = (int)mapElement.getValue();
            char letter = (char)mapElement.getKey();
            
            System.out.println(letter + " " + count);
        }
    }
    
}
