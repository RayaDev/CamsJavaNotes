/*
Write a program that reads a string from the keyboard.
The program should display two lines:
1. The first line contains only the vowels from the entered string.
2. The second contains only the consonants and punctuation marks from the entered string.
The letters should be separated by a space, each line must end with a space.

 */
package Level9;

import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.stream.events.Characters;

/**
 *
 * @author Cam
 */
public class VowelsAndConsonants {

   public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        
        char [] TextChar;        
        TextChar = text.toCharArray();
        
        ArrayList<Character> vowelCheck = new ArrayList<>();       
        ArrayList<Character> Consonants = new ArrayList<>();
                
        for(char c: TextChar)
        {
            boolean check = isVowel(c);
            if (check == true)
            {
               vowelCheck.add(c); 
            }
            else
            {
                
                if (c == ' ')
                {
                   continue; 
                }
                
                else
                {
                Consonants.add(c);
                }
            }
        }
        
        for (char c : vowelCheck)
        {
            System.out.print(c + " ");
        }
        
        System.out.println();
        
        for (char c: Consonants)
        {            
                  
            System.out.print(c+ " ");
            
        }
        
    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // Convert to lowercase

        for (char d : vowels)   // Look for vowels in the array
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
