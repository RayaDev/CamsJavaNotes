/*
1. Enter 20 numbers from the keyboard, save them in a list, and then sort them to three other lists:
Numbers divisible by 3 (x%3==0), numbers divisible by 2 (x%2==0), and all other numbers.
Numbers simultaneously divisible by 3 and 2 (for example 6) go into both lists.
The order in which the lists are declared is very important.
2. The printList method should display each list item on a new line.
3. Using the printList method, display these three lists. First, the list for x%3, then the list for x%2, and then the last list.

*/
package GoodCode;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class JavaRella {

private static ArrayList<Integer> list = new ArrayList<>();
private static ArrayList<Integer> divide3 = new ArrayList<>();
private static ArrayList<Integer> divide2 = new ArrayList<>();
private static ArrayList<Integer> Notdivide23 = new ArrayList<>();
    
    public static void main(String[] args) throws Exception 
    {          
        Input();
        Sort();
        printList(list);
        printList(divide3);
        printList(divide2);
        printList(Notdivide23);
    }
    
    private static void Input()
    {
        //Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        for (int i = 0; i < 20; i++)
        {           
            //int num = sc.nextInt();
            int num = rand.nextInt(100);
            list.add(num);             
        }        
    }
    
    private static void Sort()
    {
        for (int i = 0; i < list.size(); i++)
        {
            int num = list.get(i);
            if (num % 2 == 0 && num % 3 == 0)
            {
                divide2.add(num);
                divide3.add(num);
            }
            else if (num % 2 == 0 )
            {
                divide2.add(num);
            }
            else if (num % 3 == 0)
            {
                divide3.add(num);
            }
            else
            {
                Notdivide23.add(num);
            }
        }
    }
    
    private static void printList (ArrayList<Integer> list1)
    {
        for (int i = 0; i < list1.size(); i++)
        {
           System.out.println(list1.get(i));
        }
        System.out.println("______________________");
    }
}
