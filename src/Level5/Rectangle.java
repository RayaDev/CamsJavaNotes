/*
Create a Rectangle class. The data for this class will be top, left, width, height.
Create as many initialize(...) methods as possible

Here are some examples:
- 4 parameters are specified: left, top, width, and height
- width/height is not specified (both are 0)
- height is not specified (it is equal to the width), we'll create a square
- create a copy of another rectangle passed as an argument



Now using constructors!
 */
package Level5;

/**
 *
 * @author Cam
 */
public class Rectangle {

public int top;
public int left;
public int width;
public int height;
    
    public static void main(String[] args) {

    }
    public Rectangle (int top) 
    {
        this.top = top;
    }
    
    public Rectangle (int top, int left) 
    {
        this.top= top;
        this.left = left;
    }
    
    public Rectangle (int top, int left, int width) 
    {
        this.top= top;
        this.left = left;
        this.width = width;
    }
    
    public Rectangle (int top, int left, int width, int height) 
    {
        this.top= top;
        this.left = left;
        this.width = width;
    }
}
