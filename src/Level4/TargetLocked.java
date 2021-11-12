/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level4;

import java.util.Scanner;


public class TargetLocked {
    
    public static void main(String[] args) throws Exception {
        
    
        Scanner sc = new Scanner(System.in); 
  
        // String input 
        int a = sc.nextInt(); 
        int b = sc.nextInt();
        
        if (a > 0 && b > 0) {
            System.out.println(1);
        }
        if (a < 0 && b > 0) {
            System.out.println(2);          
        }
        if (a < 0 && b < 0) {
            System.out.println(3);
        }
        if (a > 0 && b < 0) {
            System.out.println(4);
        }
    }
}
