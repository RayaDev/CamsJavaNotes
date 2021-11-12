/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level17;

/**
 *
 * @author Cam
 */
public class Task17_06 {
    public static void main(String[] args) {
        OurPresident expectedPresident = OurPresident.getOurPresident();
        OurPresident ourPresident = OurPresident.getOurPresident();
        System.out.println(expectedPresident == ourPresident );
    }   
    
    public static class OurPresident {
    
    private static OurPresident president;
    
    static //See notes below on why this block is good and needed in some cases! 
    {
        synchronized (OurPresident.class)
        {    
            if(president == null)
            president = new OurPresident();
        }
    }

    private OurPresident() {
    }

    public static OurPresident getOurPresident() {
        return president;
    }
    }
}

/*

This is above my knowledge at the moment but I can try to answer this with the knowledge I have and some assumptions to fill in the blanks:

#1 (knowledge) The static block of a class is only run one time and that is when the class is first loaded into memory. 
It is not run every time an object of that class is created.

#2 (knowledge) Singleton classes store a reference to themselves in the class and will hand out that reference to any code calling for it. 
This is done by locking the constructor so no objects can be created outside the class and having a method inside that returns the internal reference to itself. 
Typically the first time the class is called the reference is created. This is a way to ensure that every place in code only uses the 1 object. 


My assumption is that if too many threads are calling that class at the same time (for the first time the class is loaded into memory) 
the first thread would lock the variable, then rest of the threads would be waiting at that door for the variable to unlock, 
then when it does unlock each thread, (having being stuck inside the static block) would run that bit of code in there and all end up with different instances of the singleton. 
A class wide lock would have all the treads wait outside the class and by the time they each have a chance to enter it the static block would have run and only 1 object would have been created.

*/
