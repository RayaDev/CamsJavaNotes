/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodNotes;

/**
 *
 * @author Cam
 */
public class WideningPrint {
    public static void main (String[] args) 
    {
        int i = 0;
        String s = "sexxx";
        boolean t = true;
        
        print(i+34 + "yup");
        print(s + i + "heyyy");
        print(t);
    }
    
    public static void print(Object o) 
    {
        System.out.println(o);
    }
}
