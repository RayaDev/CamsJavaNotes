/*
Make the ConsoleReader class, which will have 4 static methods:
String readString() - reads a string from the keyboard
int readInt() - reads a number from the keyboard
double readDouble() - reads a fractional number from the keyboard
boolean readBoolean() - reads the string "true" or "false" from the keyboard and returns the corresponding boolean value (true or false)

Please note: In each method, create a variable to read data from the console (BufferedReader or Scanner).
 */


// Maybe you really do need to have a new scanner for each method. Seems to cuase less errors. 


package Level6;

import java.util.Scanner;


public class ConsoleReader {
     
    public static Scanner sc = new Scanner(System.in);    
    
    public static String readString() throws Exception {
        String s = sc.nextLine();
        return s;

    }

    public static int readInt() throws Exception {
        int number = sc.nextInt(); 
        return number;

    }

    public static double readDouble() throws Exception {
        double D = sc.nextDouble();
        return D;

    }

    public static boolean readBoolean() throws Exception {
        boolean B = sc.nextBoolean();
        return B;

    }

    public static void main(String[] args) throws Exception {
        String s1 = readString();
        int num1 = readInt();
        double D1 = readDouble();
        boolean B1 = readBoolean();
        
    }
}

/*

import java.util.Scanner;
public class ConsoleReader {
    
    public static String readString() throws Exception {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      return s;

    }

    public static int readInt() throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;

    }

    public static double readDouble() throws Exception {
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        return d;

    }

    public static boolean readBoolean() throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean B = sc.nextBoolean();
        return B

    }

    public static void main(String[] args) {

    }
}

*/