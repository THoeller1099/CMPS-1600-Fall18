import java.util.ArrayList;
import java.util.Collections;

public class ShapeTester {
    /**
     * @param array The array whose elements of type Shape you want to display
     */
    public static void displayArray(ArrayList<Shape> array) {
        int j;
        for (j = 0; j < array.size(); j++) {
            Shape shape = array.get(j);
            shape.display();
        }
    }

    public static void main(String[] args) {
        ArrayList<Shape> Shape = new ArrayList<Shape>();

        Circle newCircle = new Circle(10);
        Triangle newTriangle = new Triangle(3, 5, 7);
        Rectangle newRectangle = new Rectangle(9, 5);
        Square newSquare = new Square(4);

        Shape.add(newCircle);
        Shape.add(newTriangle);
        Shape.add(newRectangle);
        Shape.add(newSquare);

        int i;

        for (i = 0; i < Shape.size(); i++) {
            Shape shape = Shape.get(i);
            System.out.println(shape.getShape());
        }

        System.out.println(newCircle.getShape() + " : " + Shape.indexOf(newCircle));

        Collections.sort(Shape);
        System.out.println("");
        System.out.println("Shapes sorted by area: ");
        for (i = 0; i < Shape.size(); i++) {
            Shape shape = Shape.get(i);
            System.out.println(shape.getShape());
        }
        System.out.println("");
        displayArray(Shape);
    }
}
