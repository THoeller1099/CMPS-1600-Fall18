class Circle extends Shape {
    private double radius;
    private double PI = 3.1415926535;

    /**
     * @param r the radius of the circle
     */
    public Circle(double r) {
        radius = r;
        ++shapeCount;
    }

    /**
     * @return returns the area of the circle using the area formula of a circle
     */
    public double area() {
        return (radius * radius) * PI;
    }

    /**
     * @return returns the perimeter of the circle using the perimeter formula of a circle
     */
    public double perimeter() {
        return 2 * PI * radius;
    }

    /**
     * @return returns the shape type in a string format
     */
    public String getShape() {
        return "circle";
    }
}
