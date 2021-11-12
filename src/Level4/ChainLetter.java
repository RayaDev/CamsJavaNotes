/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level4;

import java.io.IOException;
import java.util.Scanner;


public class ChainLetter {
     public static void main(String[] args) throws IOException  {
    
    Scanner sc = new Scanner(System.in); 
    
    String name = sc.nextLine(); 
        
    for(int i = 0; i <= 9; i++){
            System.out.println(name + " loves me.");
        }
    }
}
