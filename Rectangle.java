public class Rectangle extends Shape {
    private double base;
    private double height;

    /**
     * the default constructor for the subclass Square
     */
    public Rectangle() {
        base = 0;
        height = 0;
    }

    /**
     * @param b the base length of the rectangle
     * @param h the height length of the rectangle
     */
    public Rectangle(double b, double h) {
        base = b;
        height = h;
        ++shapeCount;
    }

    /**
     * @return returns the area of the rectangle
     */
    public double area() {
        return base * height;
    }

    /**
     * @return returns the perimeter of the rectangle
     */
    public double perimeter() {
        return (base * 2) + (height * 2);
    }

    /**
     * @return returns the type of the shape in string format
     */
    public String getShape() {
        return "rectangle";
    }
}
