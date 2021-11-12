/*
In the Cat class constructor, i.e. public Cat(), increment the cat counter (the Cat class's static variable catCount) by 1. 
Decrement it by 1 in the finalize method.
 */
package Level6;

/**
 *
 * @author Cam
 */
public class CatCounter {
    public static int catCount = 0;

    //write your code here

    public static void main(String[] args) 
    {

    }
    protected void finalize() throws Throwable 
    {
        catCount = catCount - 1;
    }    
    public CatCounter() {
        catCount = catCount + 1;
    }
}
