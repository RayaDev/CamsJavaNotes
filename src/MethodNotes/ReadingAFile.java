/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodNotes;

import java.io.BufferedInputStream;
import java.io.FileInputStream;



/**
 *
 * @author Cam
 */
public class ReadingAFile {
    
    public static void main(String[] args) throws Exception 
    {             
        
        FileInputStream inputStream = new FileInputStream("C:\\Users\\Cam\\Desktop\\CodeGymTasks\\testout.txt");     
        BufferedInputStream buffReader = new BufferedInputStream(inputStream);
        
        int i=0;
        while((i=buffReader.read())!=-1)
        {
            char letter = (char)i; 
            
            System.out.print(letter);
        }
        
        buffReader.close();
        inputStream.close();                
                                          
        System.out.println();
               
    } 
}
