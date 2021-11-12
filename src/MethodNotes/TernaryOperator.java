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
public class TernaryOperator {
    public static void main (String[] args) 
    {
        System.out.println(ternary(9));
        System.out.println(ternary(10));
        System.out.println(standardIfElse(9));
        System.out.println(standardIfElse(10));
    }
    
    static int ternary(int i) //A more compatic ifElse statement. Careful not to use too much, creating unreadalbe code. 
    {
        return i < 10 ? i*100 : i * 10;
    }
    
    static int standardIfElse(int i)
    {
        if (i < 10)
        {
            return (i*100);
        }
        else 
        {
            return (i*10);
        }
    }
    
}
