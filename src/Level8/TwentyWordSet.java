/*
You need to create a Set<String> and add 20 words that start with the letter "L".
 */
package Level8;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Cam
 */
public class TwentyWordSet {
    
    static String string = "L";
    static String a = "a";

    public static Set<String> createSet() {
        Set<String> set = new HashSet<>();

        for(int i = 0; i<20; i++){
            set.add(string);
            addLetters();
        }

        return set;
    }

    public static void addLetters(){
        string += a;
    }


    public static void main(String[] args) {

    }   
}
