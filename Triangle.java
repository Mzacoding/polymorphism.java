
package assignmentqeuction;



/**
 *Create a base class Shape with a method draw. 
 *Create derived classes Circle, Square, and Triangle that override the draw method. 
 *Use polymorphism to call the draw method on an array of different shapes
 */
public class Triangle extends Shape {

    
    private double base;
    private double height;

    public Triangle() {
    }
    
    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    
    @Override
    public void draw() {
        
     System.out.println("Drawing Triangle Shape");
    }
    
}
