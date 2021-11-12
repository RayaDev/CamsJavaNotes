/*
Implement the 4 methods.
Each of them should return the list that is best suited for performing these operations 
(i.e. the list that can most quickly perform a large number of operations).
You don't need to measure anything.



ArrayList Pro and Cons
Quick for getting and setting elements. 

LinkedList
Slow at getting and setting, must go iterate through the entire list and back again.
Quick at inserting and element at abritry location.
Quick at removing elements. 

 */
package Level8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Cam
 */
public class MethodQuartet {
    public static List getListForGet() 
    {
        ArrayList<Object> list = new ArrayList<>();
        return list;

    }

    public static List getListForSet() 
    {
        ArrayList<Object> list = new ArrayList<>();
        return list;

    }

    public static List getListForAddOrInsert() 
    {
        LinkedList<Object> list = new LinkedList<>();
        return list;

    }

    public static List getListForRemove() 
    {
        LinkedList<Object> list = new LinkedList<>();
        return list;

    }

    public static void main(String[] args) 
    {

    }    
}
