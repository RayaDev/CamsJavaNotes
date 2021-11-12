/*

Google:  synchronized singleton pattern.

 */
package Level17;

/**
 *
 * @author Cam
 */
public class Task17_07 {
    public static void main(String[] args) {
        IMF fund = IMF.getFund();
        IMF anotherFund = IMF.getFund();
        System.out.println(fund == anotherFund );
    }   
    
    public static class IMF {

        private static IMF imf;

        public static IMF getFund() {
           synchronized (IMF.class) 
           {
            if(imf == null)
            imf = new IMF();
            return imf;
            }
        }

        private IMF() 
        {
        }
    }
}
