/*
 Mostly just writing to a file from the console.

 */
package MethodNotes;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReadWriteAddLine {
    public static void main(String[] args) throws IOException 
    {
        
        AddNewLine();
              
    }
    
    public static void AddNewLine() throws IOException
    {
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
       // String fileName = userInput.readLine(); //Just for postarity.. 
        String fileName = "C:\\Users\\Cam\\Desktop\\CodeGymTasks\\testout.txt";
                     
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true)); //Appends the file and keeps it open. 
         
        String line = "run";
        while (!"exit".equals(line))
        {
            
            line = userInput.readLine();      
            bw.append(" ");
            bw.append(line);       
        
        }
       
        bw.close();
    }
    
}
