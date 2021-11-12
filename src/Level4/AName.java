/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level4;

import java.io.IOException;
import java.util.Scanner;

public class AName {
     public static void main(String[] args) throws IOException  {
            Scanner sc = new Scanner(System.in); 
            
            String name = sc.nextLine(); 
             int year = sc.nextInt();
            int month = sc.nextInt(); 
            int day = sc.nextInt();
           
            
            System.out.println("My name is " + name);
            System.out.println("I was born on " + month + "/" + day  + "/" + year);
       }
}
