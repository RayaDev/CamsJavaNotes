/*

Ellie has already told you that the processor constantly switches between threads. Each thread is allocated 
a small piece of processor time, called a quantum. When this time expires, the processor switches to another thread 
and starts executing its commands. Calling Thread.yield() lets you end the current thread's quantum early. 
In other words, it tells the processor to switch to the next thread.

"But why would one thread need to give up its time to another thread?"

"It doesn't happen often. Calling yield means «our thread is done with its turn ahead of schedule» 
and that the command after the yield will start with a full time quantum. 
Thus, the chances that it will be interrupted are less. Especially if it's a short command, i.e. it won't take long to execute. This approach can be used to optimize some processes."

I can also tell you that Thread.sleep(0) actually works the same way. 
I think you won't use the yield method very much at first, but it's useful to know about.

 */
package MethodNotes;

/**
 *
 * @author Cam
 */
public class ThreadYeild {
    
}
