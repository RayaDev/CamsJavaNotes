/*
 
Needs work. Not working as expected. 


 */
package Level15;

import java.util.Scanner;

/**
 *
 * @author Cam
 */
public class Task_15_22 {

public interface Planet 
{
    static String SUN = "sun";
    static String MOON = "moon";
    static String EARTH = "earth";
} 
    
    
    public static void main(String[] args) {
        readKeyFromConsoleAndInitPlanet();
    }

    public static Planet thePlanet;

    // Add static block here

    public static void readKeyFromConsoleAndInitPlanet() {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        
        assignPlanet(userInput);
        if (thePlanet instanceof Moon)
        {
            System.out.println("The planet is a sun.");
        }
    }  
    
    public static void assignPlanet(String input)
    {
        if (input.equals("sun"))
        {
            thePlanet = new Sun();
        }
        
        if (input.equals("moon"))
        {
            thePlanet = new Moon();
        }
        
        if (input.equals("earth"))
        {
            thePlanet = new Earth();
        }
        
        else
        {
            System.out.println("Not a planet.");
        }
    }
 
public static class Sun implements Planet{

    private static Sun instance;
    
    private Sun(){}
    
    //static block initialization for exception handling
    static{
        try{
            instance = new Sun();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    
    public static Sun getInstance(){
        return instance;
    }
}

public static class Moon implements Planet{

    private static Moon instance;
    
    private Moon(){}
    
    //static block initialization for exception handling
    static{
        try{
            instance = new Moon();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    
    public static Moon getInstance(){
        return instance;
    }
}

public static class Earth implements Planet{

    private static Earth instance;
    
    private Earth(){}
    
    //static block initialization for exception handling
    static{
        try{
            instance = new Earth();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    
    public static Earth getInstance(){
        return instance;
    }
}






}
