public class Square extends Rectangle {
    private double sideLength;
    public Square() {
        sideLength = 0;
    }

    public Square(double s) {
        sideLength = s;
    }
    @Override
    public double area() {
        return sideLength * sideLength;
    }

    @Override
    public double perimeter() {
        return sideLength * 4;
    }

    @Override
    public String toString() {
        return "Square with side length " + sideLength;
    }

    @Override
    public boolean equals(Object obj) {
        Square s = (Square) obj;
        return (this.sideLength == s.sideLength);
    }
}
