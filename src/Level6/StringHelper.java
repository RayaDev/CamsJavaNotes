/*

Make the StringHelper class, which will have 2 static methods:
String multiply(String s, int count) - returns a string that has been repeated count times.
String multiply(String s) - returns a string that has been repeated 5 times.

For example:
Amigo -> AmigoAmigoAmigoAmigoAmigo

*/
package Level6;

/**
 *
 * @author Cam
 */
public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        //result = s; 
        //write your code here
        for (int i = 0; i < 5; i++) {
            result += s; //Whats the +=  mean? 
            
            //+= means take the variable before + current value 
            //and add what is on the right of the equals sign to the current value of what is before the + sign
        }
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        //result = s;
        //write your code here
        while (count > 0){
            result += s;
            count--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiply("Amigo", 8));
        System.out.println(multiply("Amigo"));
    }
}