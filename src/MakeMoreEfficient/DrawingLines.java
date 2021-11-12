/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MakeMoreEfficient;

import java.util.Scanner;

/**
 *
 * @author Cam
 */
public class DrawingLines {
    public static void main(String[] args) {  
         Scanner sc = new Scanner(System.in); 
         int m = sc.nextInt(); 
         int n = sc.nextInt(); 
        for (int y =0; y < n*2; y++){ //The *2 thing.. whattt?
         
            for (int x = 0; x < m; x++) { //How many 8's to add to the horizontal
             System.out.print(8);
            }
         y++;
         System.out.println(" ");
        
        }
      
    }   
}
    