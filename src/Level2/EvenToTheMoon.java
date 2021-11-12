/*
 Requirements:
•	The getWeight(int) method must be public and static.
•	The getWeight method must return a double.
•	The getWeight method should not display anything.
•	The getWeight method should correctly convert the Earth weight in newtons to the lunar weight, and then return this value.
 */
package Level2;

/**
 *
 * @author Cam
 */
public class EvenToTheMoon {
    
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
        double moonWeight = earthWeight * 0.17;
        
        return moonWeight;
    }
}
