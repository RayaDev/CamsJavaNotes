/*
1. In the Solution class, create the public static Idea class
2. In the Idea class, declare a public String getDescription() method that returns any non-empty string
3. In the Solution class, create a static public void printIdea(Idea idea) method 
that will display a description of the idea (what the getDescription method returns)

 */
package MethodNotes;

/**
 *
 * @author Cam
 */

//Start with this and just play around with it. Construct and call variables ext.    
    
public class ClassMethodCalling        
{
    public static class Idea {
         public String getDescription()
         {
             String s = "Live a good life.";
             return s;
         }
     }
     public static void printIdea(Idea idea)
     {
         String s1 = idea.getDescription();
         System.out.println(s1);
     }
    public static void main(String[] args) {
        
        Idea idea1 = new Idea();
        
        printIdea(idea1);
    }
}



/* Step one, when the program is started the main() method is called.

Step 2: In the main method printIdea() is called with the argument new Idea() (a new Idea object)

Step 3: Code goes to the method printIdea, which accepts as an argument (Idea idea) (an Idea object to be referred to as idea in the subsequent code)

Step 4: inside the printIdea() method, the println() method is called with an argument of (idea.getDescription()), which is the method getDescription defined in Idea class that is called on the object 'idea'

Step 5: code goes to the getDescription() method, which returns a string "s". This method concludes

Step 6: code returns to the printIdea() method and the argument inside the println() method now equals "s", this is output to screen. Method concludes

Step 7: Code returns to the main method, where no more code exists to run, program ends */