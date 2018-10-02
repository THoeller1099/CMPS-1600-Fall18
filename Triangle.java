public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    /**
     * @param s1 the first side of the triangle
     * @param s2 the second side of the triangle
     * @param s3 the third side of the triangle
     */
    public Triangle(double s1, double s2, double s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
        ++shapeCount;
    }

    /**
     * @return returns the area of the triangle using a special area formula
     */
    public double area() {
        double P = (side1 + side2 + side3)/2;
        return Math.sqrt(P * (P - side1) * (P - side2) * (P - side3));
    }

    /**
     * @return returns the perimeter of the triangle by adding all the sides together
     */
    public double perimeter() {
        return side1 + side2 + side3;
    }

    /**
     * @return returns the type of the shape in a string format
     */
    public String getShape() {
        return "triangle";
    }
}
