public abstract class Shape implements Displayable, Comparable<Shape> {
    /**
     * a static field that keeps count of the amount of objects of type Shape that are created
     */
    static public int shapeCount = 1;

    /**
     * @return returns the area of the given shape
     */
    abstract double area();

    /**
     * @return returns the perimeter of the given shape
     */
    abstract double perimeter();

    /**
     * @return returns the type of shape. Could either be "circle", "triangle", "rectangle" or "square"
     */
    abstract String getShape();

    /**
     * This displays the shape's type, area and perimeter
     */
    @Override
    public void display() {
        System.out.println("Type: " + Shape.this.getShape());
        System.out.println("Area: " + Shape.this.area());
        System.out.println("Perimeter: " + Shape.this.perimeter());
    }

    /**
     *
     * @param o The other shape that you want to compare to
     * @return returns either +1, -1 or 0 based on which shape has a larger area. If the original shape has a larger area, +1 is returned. If the original shape has a smaller area, -1 is returned. If the areas are equal, 0 is returned.
     */
    @Override
    public int compareTo(Shape o) {
        if (this.area() > o.area()) {
            return 1;
        }
        if (this.area() < o.area()) {
            return -1;
        }
        if (this.area() == o.area()) {
            return 0;
        }
        return 0;
    }
}
