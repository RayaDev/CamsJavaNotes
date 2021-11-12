/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodNotes;

import static MethodNotes.WideningPrint.print;

/**
 *
 * @author Cam
 */
public class LablesAsGoto {

    public static void main(String[] args)
    {
        int i = 0;
        outer: //Label used for controlling loops. Functions as a goto. Fairly rare usage.
                // Loop must occur on the very next line of code. 
        for(; true ; )//Another way to code an infinte loop
        {
            inner:
        
            for(; i < 10; i++)
            {
                print("i = " + i);
                if(i == 2)
                {
                    print("continue");
                    continue;
                }
                if(i == 3)
                {
                    print("break");
                    i++; //Otherwise i never gets incremented
                }
                if(i == 7)
                {
                    print("continue outer");
                    i++;
                    continue outer; /*Jumps back to the outer loop? In which case i = 8 at this point. 
                                    Doesn't get incremineted by the inner for loop, goes to 
                                    the next if statement and breaks the outer loop. */
                }
                if(i == 8)
                {
                    print("break outer");
                    break outer; //Ends the whole loop, by breaking the outer.  
                }
                for(int k = 0; k < 5; k++)
                {
                    print("continue inner");
                    continue inner;
                }
            }
        }
}
}
