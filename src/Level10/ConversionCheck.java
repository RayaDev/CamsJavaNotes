/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level10;

/**
 *
 * @author Cam
 */
public class ConversionCheck {

    public static void main(String[] args) 
    {
        int i = 5;
        float f = 444.23f;
        String s = "17";
        Object o = f;                       // o stores a Float

        if (o instanceof  Integer)
        {
            Integer i2 = (Integer) o;
            System.out.println(i2);
        }
        else if (o instanceof  Float)
        {
            Float f2 = (Float) o;            // This if block will be executed
            System.out.println(f2);
        }
        else if (o instanceof  String)
        {
            String s2 = (String) o;
            System.out.println(s2);
        } 
    }
}
