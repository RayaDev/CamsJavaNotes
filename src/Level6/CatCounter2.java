/*
dd two static methods to the Cat class: int getCatCount()
and setCatCount(int), which you can use to get/change the number of cats (variable catCount).
 */
package Level6;

/**
 *
 * @author Cam
 */
public class CatCounter2 {
  
    private static int catCount = 0;

    public CatCounter2 () {
        catCount++;
    }

    public static int getCatCount() {
       
       return catCount;

    }

    public static void setCatCount(int catCount1) {
        
        catCount = catCount1;

    }

    public static void main(String[] args) {

    }
}  

