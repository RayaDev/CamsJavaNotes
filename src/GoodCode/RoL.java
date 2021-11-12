/*
1. Create a list of words and populate it yourself.
2. The fix method should:
2.1. remove all words containing the letter "r" from the list
2.2. duplicate all words containing the letter "l".
2.3. if a word contains both "r" and "l", then leave it unchanged.
2.4. don't do anything to other words.


Good work troubleshooting this one. 
 */
package GoodCode;



import java.util.ArrayList;

/* 
R or L

*/

public class RoL {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("lyre"); // 1
        list.add("love"); // 2
        list.add("myre");
        list.add("bank");
        list.add("karl");
        list.add("max"); 
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
       }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        
        ArrayList<String> list1= new ArrayList<String>();
        
        for(int i = 0; i < list.size(); i++){
           if(list.get(i).contains("r") && list.get(i).contains("l"))
           {
                list1.add(list.get(i));
           }

           else if(list.get(i).contains("r"))
            {
                continue;

            }
            else if(list.get(i).contains("l"))
           {
               list1.add(list.get(i));
               list1.add(list.get(i));

           }
            else if(!list.get(i).contains("r") && !list.get(i).contains("l")) //Cool doen't contain operator. 
            {
                list1.add(list.get(i));
            }
        
        }
        return list1;

    }


}
