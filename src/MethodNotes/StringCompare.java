/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodNotes;

import java.util.Scanner;

/**
 *
 * @author Cam
 */
public class StringCompare {

    
    public static void main(String[] args) 
    {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to go to South America?");
        System.out.println("Say Yes!");
        
        String yes = sc.nextLine();
        
      //  boolean test = yes.equals("yes");
          
        
      
        if (yes.equals("yes"))
        {          
            System.out.println("You're awesome..lets do ittt!");            
        }
        
        else {
                     
            System.out.println("come onnnn!");          
        }
    }
}
       

