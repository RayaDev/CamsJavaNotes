/*

1. Figure out what the program does.
2. We need to be sure that Chump talks the most during the political debate.
3. Think about what method you can call on the chump object to make Chump talk 
until all the available time has been taken.


 */
package Level16;

/**
 *
 * @author Cam
 */
public class Task16_08 {
public static int totalSpeechCount = 200;
    public static int utterancesPerSpeech = 1000000;

    public static void main(String[] args) throws InterruptedException {
        Politician chump = new Politician("Chump");
        chump.join();
        Politician dustbin = new Politician("Dustbin");
        Politician schooner = new Politician("Schooner");

        while (chump.getSpeechCount() + dustbin.getSpeechCount() + schooner.getSpeechCount() < totalSpeechCount) {
        }

        System.out.println(chump);
        System.out.println(dustbin);
        System.out.println(schooner);
    }

    public static class Politician extends Thread {
        private volatile int utteranceCount;

        public Politician(String name) {
            super(name);
            start();
        }

        public void run() {
            while (utteranceCount < totalSpeechCount * utterancesPerSpeech) {
                utteranceCount++;
            }
        }

        public int getSpeechCount() {
            return utteranceCount / utterancesPerSpeech;
        }

        @Override
        public String toString() {
            return String.format("%s spoke %d times", getName(), getSpeechCount());
        }
    }   
}
