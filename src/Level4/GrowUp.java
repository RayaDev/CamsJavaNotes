/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level4;

import java.io.*;


public class GrowUp {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
         
        String name = reader.readLine();
        
        String age = reader.readLine(); 
        int age1 = Integer.parseInt(age);
        
        if (age1 < 18 ){
            System.out.println("Grow up a little more");
        }
    }
}
