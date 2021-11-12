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
public class MultipleVariableMethods {
    public static void main(String args[])
    {  
        int i = 5;
        String s = "test";
        char c = 'c';
        
        multiTest(s, i, c);
        
    }  
    
    private static void multiTest(String s, int i, char c)
    {
        System.out.println(s + i + c);
    }
    
}
