/*
True flase boolean notes.
Default value of a boolean is False.
 
*/
package MethodNotes;

/**
 *
 * @author Cam
 */
public class BooleanMethod1 {
    
    public static void main(String[] args) throws Exception {
    
        System.out.println(isALessThenB(5,6));
        
    }
    //The most compact and correct boolean form.
    public static boolean isALessThenB (int a, int b) {
        return a < b;
    }
    //Slightly exapandedboolean
    public static boolean isALessThenB1 (int a, int b) {

        boolean m = (a < b);
        return m;
    }
    
    //Expanded code 
    public static boolean isALessThenB2 (int a, int b) {
          boolean m = (a < b);
    if (m) {
        return true; }
    else {
        return false; }
    }      
}
