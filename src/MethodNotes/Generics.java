/*
 <T> specifically stands for generic type. According to Java Docs -

A generic type is a generic class or interface that is parameterized over types.

Let me start with an example: Consider a Box type that has two methods which is used to set and get objects. 
It would look something like this:
 */
package MethodNotes;



/**
 *
 * @author Cam
 */
public class Generics {
public static void main(String[] args)
{
    
}

class Boxs{
protected Object obj;
 
public void setObj(Object object){
this.obj=object;}
 
public Object getObj(){
return obj;}
}

    class Box<T> {
    protected T t;
 
    public void setObj(T t){
    this.t=t;}
 
    public T getObj(){
    return T;}
    }
}
