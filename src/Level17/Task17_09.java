/*


Without using synchronized, make the number of proposals made equal to the number of and proposals accepted.

If you don't use the keyword volatile, the variable is loaded into the cache.
This means, that each thread has it's own copy of the variable and any changes made by the thread can't be seen by other threads.
In this instance, since the MakeProposal thread increments the value of "proposal" every time it runs, 
and the AcceptProposal thread will keep on running until the value is 10,
both threads need to access the updated values of the variable

 */
package Level17;

/**
 *
 * @author Cam
 */
public class Task17_09 {
    public static volatile int proposal = 0; /*Adding or removing volatile from this really changes the program.. 
    With out it the threads change the proposal number in there cache? 
    
    
    */
    public static void main(String[] args) {
        new AcceptProposal().start();
        new MakeProposal().start();
    }

    public static class MakeProposal extends Thread {
        @Override
        public void run() {
            int thisProposal = proposal;

            while (proposal < 10) {
                System.out.println("Made Proposal No. " + (thisProposal + 1));
                proposal = ++thisProposal;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class AcceptProposal extends Thread {
        @Override
        public void run() {
            int thisProposal = proposal;

            while (thisProposal < 10) {
                if (thisProposal != proposal) {
                    System.out.println("Accepted Proposal No." + proposal);
                    thisProposal = proposal;
                }
            }
        }
    }    
}
