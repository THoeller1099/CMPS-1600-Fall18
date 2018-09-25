public class Rectangle {

    private double length;
    private double height;
    private static int nextID = 1;
    private int ID;

    public Rectangle() {
        length = 0;
        height = 0;
    }
    public Rectangle(double valueLength, double valueHeight) {
        length = valueLength;
        height = valueHeight;
        nextID++;
    }

    public void setLength(int newLength) {
        this.length = newLength;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public double area() {
        return length * height;
    }

    public double perimeter() {
        return (length * 2) + (height * 2);
    }

    public int getRectangleID() {
        ID++;
        return ID;
    }
    @Override
    public String toString() {
        return "Rectangle with length " + length + " and height " + height;
    }

    @Override
    public boolean equals(Object obj) {
        Rectangle r = (Rectangle) obj;
        return (this.length == r.length && this.height == r.height);
    }
}

