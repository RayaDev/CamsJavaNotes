/*
 This program succesfully uses the return function. How??
 */
package Level2;

/**
 *
 * @author Cam
 */
    
public class OurFirstConverter {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(56));
        
    }

    public static double convertCelsiusToFahrenheit(int celsius) {
        double CtoF = (9.0/5.0)*celsius+32;
        //System.out.println(CtoF);

        return CtoF;
    }
}