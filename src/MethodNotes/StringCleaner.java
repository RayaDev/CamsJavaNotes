/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodNotes;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

/**
 *
 * @author Cam
 */
public class StringCleaner {
    public static void main(String[] args) throws Exception 
    {             
        ArrayList<Character> charArray = readFile();
        //System.out.println(charArray);
        
        ArrayList<String> wordList = stringCleaner(charArray);
        
       /* for (String s : wordList)
        {
            System.out.println(s);
        } */
        
        writeCleanString(wordList);
        
    }   
    
    public static ArrayList<Character> readFile() throws FileNotFoundException, IOException
    {
        FileInputStream inputStream = new FileInputStream("C:\\Users\\Cam\\Desktop\\CodeGymTasks\\testout1.txt");     
        BufferedInputStream buffReader = new BufferedInputStream(inputStream);
        
        ArrayList<Character> inputText = new ArrayList<>();
        
        int i=0;
        while((i=buffReader.read())!=-1)
        {
            char letter = (char)i;
            inputText.add(letter);
            
            //System.out.print(letter);
        }
        
        buffReader.close();
        inputStream.close();                
         
        /*String returnString = "";
        for (char c : inputText)
        {
            String s = Character.toString(c); //Converts char to String
            returnString += c;
        } */
        
       // System.out.println(returnString);
        
        return inputText;
    }
    
    public static ArrayList<String> stringCleaner(ArrayList<Character> stringS)
    {
        ArrayList<String> wordList = new ArrayList<>();
        
        //ASCII 97 to 122 is lower case a to z
        String word = "";
        for (char allChar : stringS)
        {
            
           /* int castASCII = c;
            System.out.println(castASCII);*/
            char c = Character.toLowerCase(allChar);
                      
            if (c >= 97 && c <= 122 && c != 32)
            {
                String charToString = Character.toString(c);
                word += charToString;
            }
            
            if( c == 32)
            {
                wordList.add(word);
                word = "";
            }
            
            // How to add word if input starts with < and ends with >.. 
        }
        
        return wordList;
    }
    
    public static void writeCleanString(ArrayList<String> wordArray) throws IOException
    {
        String destinationFileName = "C:\\Users\\Cam\\Desktop\\CodeGymTasks\\testout2.txt";
        OutputStream fileOutputStream = getOutputStream(destinationFileName);
        
        for (String word : wordArray)
        {
            char[] charArray = new char[word.length()];  
            // Copy character by character into array 
            for (int i = 0; i < word.length(); i++) 
            { 
                charArray[i] = word.charAt(i); 
            } 
            
            for (char c : charArray)
            {
                fileOutputStream.write(c);
            }
            
            fileOutputStream.write(' ');
        }
    }
     
     public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }   
}
