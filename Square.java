
package assignmentqeuction;


/**
 *Create a base class Shape with a method draw. 
 *Create derived classes Circle, Square, and Triangle that override the draw method. 
 *Use polymorphism to call the draw method on an array of different shapes
 */
public class Square extends Shape {
    
    private double width;
    private double height;

    public Square() {
    }
    
    
    public Square(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    
    @Override
    public void draw() {
          System.out.println("Drawing  Square Shape");
    }
}
