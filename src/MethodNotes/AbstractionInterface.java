/*

Abstraction is a process where you show only “relevant” data and “hide” unnecessary details of an object from the user.

Interfaces are for full abstraction. All methods are abstract by default. 

Implementations can be extended to abstract classes, which have implimented methods
and then can be extended to other object classes. 

Also, java programming language does not allow you to extend more than one class, 
However you can implement more than one interfaces in your class.


 */
package MethodNotes;

/**
 *
 * @author Cam
 */
public class AbstractionInterface {

interface MyInterface
{
   /* compiler will treat them as: 
    * public abstract void method1();
    * public abstract void method2();
    */
   public void method1();
   public void method2();
}

class Demo implements MyInterface
{
   /* This class must have to implement both the abstract methods
    * else you will get compilation error
    */
   public void method1()
   {
	System.out.println("implementation of method1");
   }
   public void method2()
   {
	System.out.println("implementation of method2");
   }
   public void main(String arg[])
   {
	MyInterface obj = new Demo();
	obj.method1();
   }
}   

/*
As discussed above, an interface can not implement another interface. It has to extend the other interface. 
See the below example where we have two interfaces Inf1 and Inf2. 
Inf2 extends Inf1 so If class implements the Inf2 it has to provide implementation 
of all the methods of interfaces Inf2 as well as Inf1.
*/

interface Inf1
{
   public void method1();
}

interface Inf2 extends Inf1 
{
   public void method2();
}

public class Demo1 implements Inf2
{
   /* Even though this class is only implementing the
    * interface Inf2, it has to implement all the methods 
    * of Inf1 as well because the interface Inf2 extends Inf1
    */
    
    public void method1(){
	System.out.println("method1");
    }
    public void method2(){
	System.out.println("method2");
    }
    public void main(String args[]){
	Inf2 obj = new Demo1();
	obj.method2();
    }
}

public class Demo2 extends Demo1
{
     @Override
     public void main(String args[]){
	Demo2 obj = new Demo2();
	obj.method2();
    }
}

}
