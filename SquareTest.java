import junit.framework.TestCase;
import org.junit.Test;

public class SquareTest extends TestCase {

    @Override
    protected void setUp() {
         Square testSquare = new Square(3.0);
    }
    Square test = new Square(3.0);
    @Test
    public void testArea() {
        System.out.println("Running: testArea");
        double area = 9.0;
        assertEquals(area, test.area());
    }

    @Test
    public void testPerimeter() {
        System.out.println("Running: testPerimeter");
        double perimeter = 12;
        assertEquals(perimeter, test.perimeter());
    }

    @Test
    public void testGetShape() {
        System.out.println("Running: testGetShape");
        String shape = "square";
        assertEquals(shape, test.getShape());
    }

    @Override
    protected void tearDown() {
        test = null;
    }
}
