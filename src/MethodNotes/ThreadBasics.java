/*
 
 */
package MethodNotes;

/*

implement Runnable vs extend Thread

If you implement Runnable you must create new Thread objects each time.
But you can start multiple Threads with the same object. You can't do this if that object simply extends Thread. 

The runnable objects (weather through implemntation or extending) must over ride the run() method, or else to real Thread is created. 
With out override, you'd just be running the Thread classes internal code? 

You must call start on the Thread object to get it moving. It then excutes the run method. 

Few more notes:
The programemer can't controll the order the threades are excuted in. 


*/
public class ThreadBasics {
    
    public static void main(String[] args)
    {
        
        //Creates three printer objects, and runs each one in its own thread. 
        Printer printer = new Printer("Natasha");
        Printer printer1 = new Printer("Cam");
        Printer printer2 = new Printer("Lili");

        Thread thread1 = new Thread(printer);
        thread1.start(); //Must invoke the start() method instead of run(). If we call run(), no "second little robot (thread)" will be created, since we are calling run directtly. 

        Thread thread2 = new Thread(printer1);
        thread2.start();

        Thread thread3 = new Thread(printer2);
        thread3.start();
        
        modernPrinter mPrinter = new modernPrinter("new and improved printer");
        mPrinter.start();
        
        //threadCreator();
        //Demonstrats that you can't controll the order of excuting for the Threads. Watch how the output changes.  
        for (int i = 0; i < 10; i++) 
        {

           MyFirstThread thread = new MyFirstThread();
           thread.start();
       }
        
        /*
         To imagine the problems of "race conditions", take the following example and compare it to the ouput from above.
        
        Thread-0 gets eggs out of the fridge.
        Thread-1 turns on the stove.
        Thread-2 gets a pan and puts it on the stove.
        Thread-3 lights the stove.
        Thread-4 pours oil into the pan.
        Thread-5 breaks the eggs and pours them into the pan.
        Thread-6 throws the eggshells into the trash can.
        Thread-7 removes the cooked eggs from the burner.
        Thread-8 puts the cooked eggs on a plate.
        Thread-9 washes the dishes. 
        
        Making Threads dependent on squential order is clearly a problem.. 
        
        you can probably put a small delay between the threads to make sure they start in sequence, and use the join() to wait for processes that has priority  ?
        (look at who now suddenly knows everything after a couple of lessons, lol!!!)....just asking.
        */
    }
    
    public static class Printer implements Runnable //The Thread class also implements Runnable. Run() is its only method, and must be overridden.
    {    
        private String name;
    
        public Printer(String name)
        {
            this.name = name;
        }
    
        @Override
        public void run() //Run sort of acts like the main method for the class in the Thread object. 
        {
            System.out.println("I'm " + this.name);
        }   
    }

    public static class modernPrinter extends Thread //When you extend Thread instead of implement Runnable, you don't need to create new Thread objects with this class. See above. 
    {
        private String name;
    
        public modernPrinter(String name)
        {
            this.name = name;
        }
    
        @Override
        public void run() 
        {
            System.out.println("I'm a modern " + this.name);
        }    
    }
    
    public static void threadCreator()
    {

       for (int i = 0; i < 10; i++) 
       {

           MyFirstThread thread = new MyFirstThread();
           thread.start();
       }
    }
    
    public static class MyFirstThread extends Thread
    {      
        @Override
        public void run() 
        {
        System.out.println("I'm Thread! My name is " + getName());
        }
    }
}

