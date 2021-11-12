/*
 
Study Jave garabage collector. It cleans memory of unused objects., but specifically does it work
Use finalize method to manual invoke gc.

Finalize method deltes objects. 

 */
package MethodNotes;

import java.util.logging.Level;
import java.util.logging.Logger;

/*

Using finalize() to detect an object that hasn't been properly cleaned up. 
 */
public class FinalizeNotes {

    public static void main(String[] args)
    {
        Book novel = new Book(true);
        //Proper clean up
        novel.checkIn();
        //Drop the reference and forget to clean up
        new Book(true);
        //Force garbage collection & finalization 
        System.gc();
    }

    
    
public static class Book 
{
    boolean checkedOut = false;
        
    public Book (boolean checkOut)
    {
        checkedOut = checkOut;
    }
    
    void checkIn()
    {
        checkedOut = false;
    }
    
    @Override
    protected void finalize() 
    {
        if(checkedOut)
        {
           System.out.println("Error: checked out");
        }
        
        try
        {
        super.finalize();
        //Normally you also call the orignal finalize method like so to clean it up for real. 
        }
        /*catch (Exception e)
        {
          System.out.println(e);  
        } */
        catch (Throwable ex) {
            Logger.getLogger(FinalizeNotes.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        } 
        
    }
    }
}
