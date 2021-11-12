/*
Getting the task to verify was such a bittchhh...

Good pratice for troubleshooting though. 

 */
package Level14;

import Level14.StringyStuff.Person.Coder;
import Level14.StringyStuff.Person.Loser;
import Level14.StringyStuff.Person.Programmer;
import Level14.StringyStuff.Person.User;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Cam
 */
public class StringyStuff {
    public static void main(String[] args) throws Exception {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        ArrayList<String> people = new ArrayList<>();
        String key = reader.readLine();
       
        while (key.equals("user") || key.equals("loser") || key.equals("coder")|| key.equals("programmer"))
        {         
            people.add(key);         
            key = reader.readLine();
        }
        
        createAndWorkPerson(people);
       
    }   
        
    public static void createAndWorkPerson (ArrayList<String> people) 
    {
        Person person = null;
        for (String human : people)
        {
                   
           if (human.equals("loser"))
           {
               person = new Loser();
           }
           
           if (human.equals("user"))
           {
               person = new User();
           }
           
           if(human.equals("coder"))
           {
               person = new Coder();
           }
           
           if(human.equals("programmer"))
           {
               person = new Programmer();
           }

           doWork(person); 
           
        }
    }

    public static void doWork(Person person) {
        
        if(person instanceof Loser)
        {
            ((Loser)person).doNothing();
        }
        
        if (person instanceof User)
        {
            ((User) person).live();
        }
        
        if (person instanceof Coder)
        {
            ((Coder) person).writeCode();
        }
        
        if(person instanceof Programmer)
        {
            ((Programmer) person).enjoy();
        }
        
    } 
    
    
    
    
   
    
public interface Person {
    class User implements Person {
        void live() {
            System.out.println("I usually just live.");
        }
    }

    public class Loser implements Person {
        void doNothing() {
            System.out.println("I usually do nothing.");
        }
    }

    class Coder implements Person {
        void writeCode() {
            System.out.println("I usually write code.");
        }
    }

    class Programmer implements Person {
        void enjoy() {
            System.out.println("It's a wonderful life!");
        }
    }
   }
}  


/*
    
public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        // Here's the loop for reading the keys. Item 1
        while(true)
        {
            // Create an object. Item 2
           key = reader.readLine();

            if(key.equals("user") || key.equals("loser") || key.equals("coder") || key.equals("programmer"))
            {
                if(key.equals("user")) {
                    person = new User();
                    doWork(person);
                }
                else if(key.equals("loser")) {
                    person = new Loser();
                    doWork(person);
                }
                else if(key.eqauls("coder")) {
                    person = new Coder();
                    doWork(person);
                }
                else if(key.equals("programmer")) {
                    person = new Programmer();
                    doWork(person);
                }
            }
            else
              break;
        }
    }

    public static void doWork(Person person) {
        // Item 3
        if(person instanceof User)
        {
            User u = (User)person;
            u.live();
        }
        else if(person instanceof Loser)
        {
            Loser l = (Loser)person;
            l.doNothing();
        }
        else if(person instanceof Coder)
        {
            Coder c = (Coder)person;
            c.writeCode();
        }
        else if(person instanceof Programmer)
        {
            Programmer p = (Programmer)person;
            p.enjoy();
        }
    }
    */
    

