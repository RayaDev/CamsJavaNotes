/*
Okay maybe im getting the hang of it..
 */
package Level4;

/**
 *
 * @author Cam
 */
public class CatCount {
       private static int catCount = 0;

    public static void setCatCount(int thiscatCount) {
        catCount = thiscatCount;
    }

    public static void main(String[] args) {
        setCatCount(5);              // Just calling a method without setting it to a variable is okay. 
        System.out.println(catCount);
        

    }
}
