/*
1. Figure out what the program does.
2. Implement logic in the doStep method so that the runner's speed is taken into consideration.
2.1. The Runner class's getSpeed() method displays how many steps per second a runner takes.
The runner needs to actually take a specified number of steps per second.
If Usain takes 4 steps per second, then he will take 8 steps in 2 seconds.
If Carl takes 2 steps per second, then he will take 4 steps in 2 seconds.
2.2. The Thread class's sleep method has a long parameter.
 */
package Level16;

/**
 *
 * @author Cam
 */
public class Task16_12 {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Runner usain = new Runner("Usain", 4);
        Runner carl = new Runner("Carl", 2);
        // On your marks!
        // Get set!
        // Go!
        usain.start();
        carl.start();
        Thread.sleep(2000);
        isStopped = true;
        Thread.sleep(1000);
    }

    public static class Stopwatch extends Thread {
        private Runner owner;
        private int stepNumber;

        public Stopwatch(Runner runner) {
            this.owner = runner;
        }

        public void run() {
            try {
                while (!isStopped) {
                    doStep();
                }
            } catch (InterruptedException ignored) {
            }
        }

        private void doStep() throws InterruptedException {
            int steps = owner.getSpeed();
            Thread.sleep(1000/steps);
            stepNumber++;            
            System.out.println(owner.getName() + " takes step " + stepNumber + "!");
        }
    }

    public static class Runner {
        Stopwatch stopwatch;
        private String name;
        private int speed;

        public Runner(String name, int speed) {
            this.name = name;
            this.speed = speed;
            this.stopwatch = new Stopwatch(this);
        }

        public String getName() {
            return name;
        }

        public int getSpeed() {
            return speed;
        }

        public void start() {
            stopwatch.start();
        }
    }    
}
