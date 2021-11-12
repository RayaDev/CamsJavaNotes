/*
You could make a loop and a menu screen for selecting which method you want to see!
This is a good example of calling methods.

//Character At Method... its a permanent java method. 
chartAt() 
str.length()
 */
package MethodNotes;

/**
 *
 * @author Cam
 */
public class StringMethods1 {
     public static void main(String args[]) {
	CharacterCount();
        CharacterAt();
        // IndexOut();
        PrintAll();
        CharAtOccurance();
        
}
     public static void CharacterCount(){
        
        String string = "BeginnersBook";    
        int count = 0;    
            
        //Counts each character except space    
        for(int i = 0; i < string.length(); i++) {    
            if(string.charAt(i) != ' ') {   
                count++;}    
        }    
            
        //Displays the total number of characters present in the given string    
        System.out.println("Total number of characters in a string: " + count);  
     }
     
     public static void CharacterAt() { 
        
        
        String str = "BeginnersBook";
	//This will return the first char of the string
	char ch1 = str.charAt(0); // 0 is the first position of the string
		
	//This will return the 6th char of the string
	char ch2 = str.charAt(5);
		
	//This will return the 12th char of the string
	char ch3 = str.charAt(11);
		
	//This will return the 21st char of the string
	char ch4 = str.charAt(12);
		
	System.out.println("Character at 0 index is: "+ch1);
	System.out.println("Character at 5th index is: "+ch2);
	System.out.println("Character at 11th index is: "+ch3);
	System.out.println("Character at 20th index is: "+ch4);
   }
  public static void IndexOut() {
      	String str = "BeginnersBook";
	//negative index, method would throw exception
	char ch = str.charAt(-1);
	System.out.println(ch);
   }
  public static void PrintAll(){
     	String str = "BeginnersBook";
	for(int i=0; i<=str.length()-1; i++) {
		System.out.println(str.charAt(i));
	}
   } 
  public static void CharAtOccurance(){
      // Use the charAt() method to count how many times a letter occurs.
      String str = "BeginnersBook";     
      //initialized the counter to 0
        int counter = 0;  
        
        for (int i=0; i<=str.length()-1; i++) {  
            if(str.charAt(i) == 'B') { 
            	//increasing the counter value at each occurrence of 'B'
                counter++;  
            }  
        }  
        System.out.println("Char 'B' occurred "+counter+" times in the string");  
  }
}


