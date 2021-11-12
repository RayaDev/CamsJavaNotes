/*
Add one type conversion to get the following answer: nine = 9
short number = 9;
char zero = '0';
int nine = (zero + number);
 */
package Level10;

/**
 *
 * @author Cam
 */
public class IntegerConversion_4 {
    
    public static void main(String[] args) 
    {
        short number = 9;
        char zero = '0';
        int nine = (zero + number);
        System.out.println((char)nine);
    } 
    
    /* 
    In above line, zero gets converted to ascii value that it 48 and added to 9. 57 gets stored in "nine".
    Now if you check ascii table, 57 represent 9. Hence, if you cast 57(variable nine) to char, it will display 9. 

    Cast nine to char inside println. 
    */
    
}
