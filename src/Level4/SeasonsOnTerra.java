/*
Write the checkSeason method. Based on a number representing a month, the method should determine and display the season (winter, spring, summer, autumn).

Example for number 2:
winter

Example for number 5:
spring

Hint: the numbers 12, 1, and 2 are winter months; 3, 4, and 5 are spring,
 */
package Level4;

/**
 *
 * @author Cam
 */
public class SeasonsOnTerra {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        if (month < 3){
        System.out.println("winter");
        }
        if (month >= 3 && month < 6) {
        System.out.println("spring");
        }
        if (month >= 6 && month < 9) {
        System.out.println("summer");
        }
        if (month >= 9 && month <= 11) {
        System.out.println("autumn");
        }
        if (month == 12) {
        System.out.println("winter");
        }          
    }    
}
