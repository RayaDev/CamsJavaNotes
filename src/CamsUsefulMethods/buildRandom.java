/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CamsUsefulMethods;


import static CamsUsefulMethods.printAll.printP;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cam
 */
public class buildRandom {
    public static ArrayList<Integer> buildRandomIntList() //Example of my code style. 
    {              
        Scanner sc = new Scanner(System.in); //Import needed tools, class ect first. 
        Random r = new Random();
        
        ArrayList<Integer> randomIntList = new ArrayList<>();
        
        printP("How many elements do you want the list to have?");
        int i = sc.nextInt();
        
        printP("How wide should the random number range be? 0 to X");
        int j = sc.nextInt();
        
        while(randomIntList.size() < i)
        {
            randomIntList.add(r.nextInt(j));
        }
        
        //printAll(randomIntList);
        
        return randomIntList;
    }    
    
    public static char[] alphabetArray()
    {
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p',
        'q','r','s','t','u','v','w','x','y','z'};
        
        return alphabet;
                
    }
    
    public static String buildRandomString()
    {
            
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        
        printP("How big do you want the string to be?");
        int k = sc.nextInt();
            
        String s = "";
        
        for(int i = 0; i < k; i++)
        {
            char[] alphabet = alphabetArray();            
            int j = r.nextInt(alphabet.length);
            s += Character.toString(alphabet[j]);
        }
        
        return s;
    }
}
