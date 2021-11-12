/*
Figure out what the program does.
Correct the constructor with two parameters so that it calls another constructor with a radius of 10.
Think about which constructor you need to call.

Hint:
carefully study the implementation of the default constructor.


ConstructorCalling Itself?? 

 */
package Level5;

/**
 *
 * @author Cam
 */
public class Circle1 {

    public double x;
    public double y;
    public double radius;

    public Circle1(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle1(double x, double y) {
        //write your code here
        this(x,y,10);
      //  this.x=x;
      //  this.y=y;
      //  this.radius=10;
    }

    public Circle1() {
        this(5, 5, 1);
        this.radius=radius;
    }

    public static void main(String[] args) {
        Circle1 circle = new Circle1();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
        Circle1 anotherCircle = new Circle1(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
    }
}


// Orignal Code Below


/* public class Circle {

    public double x;
    public double y;
    public double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double y) {
        //write your code here
    }

    public Circle() {
        this(5, 5, 1);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
        Circle anotherCircle = new Circle(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
    }
}
*/