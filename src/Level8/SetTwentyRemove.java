/*
 Create a set of numbers (Set<Integer>) and add 20 different numbers to it.
Remove from the set all numbers greater than 10 .
 
*/
package Level8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Cam
 */
public class SetTwentyRemove {

    public static void main(String[] args) 
    {
        HashSet<Integer> set = new HashSet<>();
        Input(set);
        PrintSet(set);         
        removeAllNumbersGreaterThan10(set);
        System.out.println("Edited set");
        PrintSet(set);
        
        
    }    
    
    public static void Input(Set<Integer> set)
    {
        Random r = new Random();
        
        
        for (int i = 0; i < 20; i++)
        {
           int num = r.nextInt(50);
           set.add(num);
        }
    }
    
    public static void removeAllNumbersGreaterThan10(Set<Integer> set)
    {
        Iterator<Integer> i = set.iterator();
        
        while(i.hasNext())
        {
            if(i.next()>10)
            {
                i.remove();
            }
        }
        
    }
    
    public static void PrintSet(Set<Integer> set)
    {
        for (int i : set)
        {
            System.out.println(i);
        }
    }
}

/*

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;



public class Solution {
    public static HashSet<Integer> createSet() {
        // write your code here
        HashSet<Integer> set=new HashSet<Integer>();

       set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        set.add(16);
        set.add(17);
        set.add(18);
        set.add(19);
        set.add(20);
      //  removeAllNumbersGreaterThan10(set);
        return set;

    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        // write your code here
      //  HashSet<Integer> setA = Solution.createSet();

        for (Iterator<Integer> iterator = set.iterator(); iterator.hasNext();){
            Integer r =  iterator.next();
            if(r>10)
                iterator.remove();
        }

        return set;

    }

    public static void main(String[] args) {

    }
}
*/