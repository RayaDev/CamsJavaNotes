/*
Create the Circle class with three initializers:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
 */
package Level5;

/**
 *
 * @author Cam
 */
public class Circle {

public int centerX;
public int centerY;
public int radius;
public int width;
public int color;

    public static void main(String[] args) {

    }
    public void initialize (int centerX, int centerY, int radius) {
        this.centerX= centerX;
        this.centerY= centerY;
        this.radius= radius;
                
    }
    public void initialize (int centerX, int centerY, int radius, int width) {
        this.centerX= centerX;
        this.centerY= centerY;
        this.radius= radius;
        this.width= width;
    }
    public void initialize (int centerX, int centerY, int radius, int width, int color) {
        this.centerX= centerX;
        this.centerY= centerY;
        this.radius= radius;
        this.width= width;
        this.color = color;
    }
}
