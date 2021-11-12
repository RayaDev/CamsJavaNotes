/*

Asynchronous execution of threads.
1. The Note class will be used by threads.
2. Create a public static NoteThread thread (the Runnable interface does not make a class a thread), whose run method does the following 1000 times (index = 0-999):
2.1. Using the addNote method, add a note named [getName() + "-Note" + index]. For example, for index = 4:
"Thread-0-Note4"
2.2. Sleep for 1 millisecond
2.3. Using the removeNote method, delete the note
2.4. Pass the thread name (getName()) as the argument to removeNote



 */
package Level17;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cam
 */
public class Task17_01 {
    
   public static void main(String[] args) {
        new NoteThread().start();
        new NoteThread().start();
    }

   public static class Note {

       public static final List<String> notes = new ArrayList<>();

       public static void addNote(String note) {
           notes.add(0, note);
       }

       public static void removeNote(String threadName) {
           String note = notes.remove(0);
           if (note == null) {
               System.out.println("Another thread deleted our note");
           } else if (!note.startsWith(threadName)) {
               System.out.println("Thread [" + threadName + "] deleted someone else's note [" + note + "]");
           } else {
               System.out.println("Thread [" + threadName + "] deleted its own note [" + note + "]");
           }
       }
   }

   public static class NoteThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Note.addNote(getName() + "-Note" + i);
                Thread.sleep(1);
                Note.removeNote(getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
}
