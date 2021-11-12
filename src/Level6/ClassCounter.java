/*
Declare a static int variable catCount in the Cat class. 
Declare a constructor, i.e. public Cat(), that increases this variable by 1.
 */
package Level6;

import java.io.IOException;


public class ClassCounter {
     
    
static int catCount;

    public static void main(String[] args) throws IOException  
     {
         
     }
    public ClassCounter() 
    {
        catCount++;
    }
}
