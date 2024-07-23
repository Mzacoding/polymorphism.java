
package assignmentqeuction;



/**
 *Create a base class Shape with a method draw. 
 *Create derived classes Circle, Square, and Triangle that override the draw method. 
 *Use polymorphism to call the draw method on an array of different shapes. 
 */

public class Circle extends Shape {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    
    
    @Override
    public void draw() {
        System.out.println("Drawing  Circle Shape");
    }
    
}
