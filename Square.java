public class Square extends Rectangle {
    private double sideLength;

    /**
     * @param s the length of each side of the square
     */
    public Square(double s) {
        sideLength = s;

    }

    /**
     * @return returns the area of the square by overriding the area method in the Rectangle class
     */
    @Override
    public double area() {
        return sideLength * sideLength;
    }

    /**
     * @return returns the perimeter of the square by overriding the perimeter method in the Rectangle class
     */
    @Override
    public double perimeter() {
        return sideLength * 4;
    }

    /**
     * @return returns the type of the shape
     */
    @Override
    public String getShape() {
        return "square";
    }
}