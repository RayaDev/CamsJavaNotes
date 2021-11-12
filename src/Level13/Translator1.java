/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level13;

/**
 *
 * @author Cam
 */
public class Translator1 {
    public static void main(String[] args) 
    {
        RussianTranslator russianTranslator = new RussianTranslator();
        System.out.println(russianTranslator.translate());
    }

    public static abstract class Translator 
    {
        public abstract String getLanguage();

        public String translate() {
            return "I translate from " + getLanguage();
        }
    }
    
    public static class RussianTranslator extends Translator{

        @Override
        public String getLanguage() {
            return "Russian";
        }
        
    }
}
