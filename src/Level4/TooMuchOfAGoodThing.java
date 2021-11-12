/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level4;

import java.util.Scanner;
public class TooMuchOfAGoodThing {
    
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in); 
  
        // String input 
        String name = sc.nextLine(); 
        int number = sc.nextInt();
        
        while(number > 0) {
            
            System.out.println(name);
            number--;
        }    
    }
}
