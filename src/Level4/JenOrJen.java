/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level4;

import java.util.Scanner;


public class JenOrJen {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in); 
    
        String name1 = sc.nextLine(); 
        String name2 = sc.nextLine(); 
        
        int var1 = name1.compareTo(name2);
        //System.out.println(var1);
        
        if (var1 == 0){
            System.out.println("The names are identical");
        }
        else if (name1.length()==name2.length()) {
            System.out.println("The names are the same length");     
        }
    }
}
