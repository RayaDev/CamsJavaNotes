/*

Still a little confused on the real utility of switch methods. Just simpler code than
a ton of if statements i suppose. 

 */
package MethodNotes;

import static MethodNotes.WideningPrint.print;

/**
 *
 * @author Cam
 */
public class SwitchMethod {

   public static void main(String[] args) 
   {
       charSwitch();
       caseStaking('e');
   }
   
   public static void charSwitch()
   {
       // char grade = args[0].charAt(0);
      char grade = 'C';

      switch(grade) {
         case 'A' :
            System.out.println("Excellent!"); 
            break;
         case 'B' :
         case 'C' :
            System.out.println("Well done");
            break;
         case 'D' :
            System.out.println("You passed");
         case 'F' :
            System.out.println("Better try again");
            break;
         default :
            System.out.println("Invalid grade");
      }
      System.out.println("Your grade is " + grade);
   }
   
   public static void caseStaking (char c)
   {
       
       switch(c)
       {
           //stacking cases
           case 'a':
           case 'e':
           case 'i':
           case 'o':
           case 'u': print("vowel");
                    break;
           default: print("consonant");
                    
       }
   }
}

