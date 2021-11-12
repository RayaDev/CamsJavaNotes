/*
Bufferred readers and writers are a best practice.. This file does not use them!

class ReadingAFile does use a buffered reader. 
 */
package MethodNotes;

/**

 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;  
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IOBasics {  
     
    public static void main(String args[])
    {    
       
        //ReadFirstChar();
        ReadAllChar();
        
        WriteOverNewLine();
      
        
        AddNewLine();
        ReadAllChar();
        
    }   
    
    public static void ReadFirstChar()
    {
        
        
        try
        {    
            FileInputStream fin=new FileInputStream("C:\\Users\\Cam\\Desktop\\testout.txt");    
            int i=fin.read();  
            
            System.out.println((char)i);    
  
            fin.close();    
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }    
    }
    
    public static void ReadAllChar()
    {
         try
         {    
            FileInputStream fin=new FileInputStream("C:\\Users\\Cam\\Desktop\\testout.txt");    
            int i=0;    
            while((i=fin.read())!=-1)
            {    
            System.out.print((char)i);    
            }    
            fin.close();              
            }
            catch(Exception e)
            {
            System.out.println(e);
            }
        
         System.out.println();
               
    }   
    
    public static void WriteOverNewLine()
    {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        try
        {    
           FileWriter fw = new FileWriter("C:\\Users\\Cam\\Desktop\\testout.txt");    
           fw.write(line);    
           fw.close();    
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }    
            System.out.println("Success...");    
    }  
    
    public static void AddNewLine()
    {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        File f = new File("C:\\Users\\Cam\\Desktop\\testout.txt");
                  
        try 
        {
            BufferedWriter bw = new BufferedWriter(new FileWriter(f, true)); //Appends the file and keeps it open. 
            bw.append(" ");
            bw.append(line);
            bw.close();
        } 
        catch (IOException e) 
        {
            System.out.println(e.getMessage());
        }
    }
}

     
