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
public class CodeFix {
    public static void main(String[] args) 
    {
        Translator translator = new Translator();
        System.out.println(translator.translate());
    }

    public static /* abstract */ class Translator 
    {
        public String translate() {
            return "I translate from Russian";
        }
    }
 
}
