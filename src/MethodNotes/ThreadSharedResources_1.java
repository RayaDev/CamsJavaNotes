/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodNotes;

import static CamsUsefulMethods.printAll.printP;

/**
 *
 * @author Cam
 */
public class ThreadSharedResources_1 {

    public static void main(String[] args)
    {
        String s = "Cam";
        String s1 = "Woolf";
        String e = "Pro at English...";
        String s2 = "Llil";
        String s3 = "Cyr";
        String e1 = "Okay at English?....";
        
        Printer p = new Printer(s , s1, e);
        Printer p1 = new Printer(s2, s3, e1);
        
        Thread t = new Thread(p);
        Thread t1 = new Thread(p1);
        
        t.start();
        t1.start();
        
        
    }
    
    private static class Printer implements Runnable
    {
        String text;
        String text1;
        String text2;
        
        Printer(String text, String text1, String text2)
        {
            this.text = text;
            this.text1 = text1;
            this.text2 = text2;
        }
                

        @Override
        public void run() 
        {
            printString(text, text1, text2); 
            
        }
    }

    public static void printString(String text, String text1, String text2) //This method is a shared resource between the threads. 
    {
        printP(text);
        printP(text1);
        printP(text2);
                
    }
    
    /*With the above method, we would expect the ouput in order, but it alternates if its not synched. 
        
       
     
    
    */
}
