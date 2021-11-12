/*
 Calls a method twice!


Use a return statement to return the result from the convertEurToUsd method. Example: return 123*435;
Call the convertEurToUsd method twice in the main method with any arguments.
Display the results, each time on a new line.

Hint:
The result is calculated using the following formula: US dollars = euros * exchange rate

Requirements:
•	The convertEurToUsd method must multiply the euro amount by the exchange rate and return the result.
•	The main method must call the convertEurToUsd method twice with any arguments.
•	The main method should display the result of the calls, each time on a new line.
•	The convertEurToUsd method should not display anything.
  

 */
package Level3;

/**
 *
 * @author Cam
 */
public class CurrencyExchange {
    public static void main(String[] args) {
        int eur = 200;
        double exchangeRate = 0.91;
        double USD = convertEurToUsd(eur , exchangeRate);
        System.out.println(USD);
        
        int eur1 = 300;
        double exchangeRate1 = 0.91;
        double USD1 = convertEurToUsd(eur1 , exchangeRate1);
        System.out.println(USD1);
        
   
    }
 
    public static double convertEurToUsd(int eur, double exchangeRate) {
        double USD = eur * exchangeRate;
        return USD;
    }
}
