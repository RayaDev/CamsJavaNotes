/*


Study this one!!!

 */
package Level9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Cam
 */
public class Task_9_30 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
         String tmp;

        // sort numbers
        for (int i = 0; i < array.length - 1; i++) {
            if(!isNumber(array[i])) {
                continue;
            }
            for (int j = i+1; j < array.length; j++) {
                if(!isNumber(array[j])) {
                    continue;
                }
                if(isGreaterThan(array[j], array[i])) {
                    tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }

        // sort strings
        for (int i = 0; i < array.length - 1; i++) {
            if(isNumber(array[i])) {
                continue;
            }
            for (int j = i+1; j < array.length; j++) {
                if(isNumber(array[j])) {
                    continue;
                }
                if(isGreaterThan(array[i], array[j])) {
                    tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
    }

    // String comparison method: 'a' is greater than 'b'
    public static boolean isGreaterThan(String a, String b) {
        if(isNumber(a)) {
            return Integer.parseInt(a) > Integer.parseInt(b);
        }
        return a.compareTo(b) > 0;
        
       
    }


    // Is the passed string a number?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // The string contains a hyphen
                    || (!Character.isDigit(c) && c != '-') // or is not a number and doesn't start with a hyphen
                    || (i == 0 && c == '-' && chars.length == 1)) // or is a single hyphen
            {
                return false;
            }
        }
        return true;
    }
}


/*
Code gym written algo!

In the sort method:
1. Make a for(int i = 0; i < array.length - 1; i++)
2. check if the array[i] is number. If it is -> Step 3, else -> Step 7.
3. Make a for(int j = i + 1; j < array.length; j++)
4. Check if array[j] is number. If it is, Step 5, else Step 6
5. Make 2 int variables and convert the array[i] and array[j] to ints and compare them. Wen you make the swap, make between the strings, not between the ints.
6. Do nothing.(else { })
7. Because the array[i] is not number, we iterate over j to check if is not number as well: for(int j = i + 1; j < array.length; j++).
8. Check if array[j] is not number. If it is not, compare array[i] and array[j] with isGreaterThan method and swap them. If array[j] is number -> step 9
9. Do nothing.
Hope this helps you. This is the easiest way for me. I didn't provide the code so you can put yourselves. :P
If you need any assistance, please let me know. Good luck!

*/