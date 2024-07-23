
package assignmentqeuction;

import java.util.ArrayList;

/**
 *
 * 
 */
public class AssignmentQeuction {

    
    public static void main(String[] args) {
 
       ArrayList<Shape> shapes=new ArrayList();
       
       Shape theCircle=new Circle(3); 
       Shape theTriangle=new Triangle(2,5);
       Shape theSquare=new Square(4,5); 
       
        shapes.add(theCircle);
        shapes.add(theTriangle);
        shapes.add(theSquare);
        
        
       for(int x=0;x<shapes.size();x++){
           
           if(shapes.get(x) instanceof Circle){
               
               Circle circleShape=(Circle)shapes.get(x);
               circleShape.draw();
           }
           else if(shapes.get(x) instanceof Triangle){
               
               Triangle triangleShape=(Triangle)shapes.get(x);
               triangleShape.draw();
           }else if(shapes.get(x) instanceof Square){
               
               Square squareShape=(Square)shapes.get(x);
               squareShape.draw();
           }
       }
       
       
    }
    
}
