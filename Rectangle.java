public class Rectangle {

    private double length;
    private double height;
    private double area;
    private double perimeter;
    public static int nextID = 1;
    private int ID;
    public Rectangle(double valuelength, double valueheight) {
        length = valuelength;
        height = valueheight;
        area = length * height;
        perimeter = (length * 2) + (height * 2);
        nextID++;
    }

    public void setLength(int newlength) {
        this.length = newlength;
    }

    public double getLength() {
        return length;
    }

    public void setHeight(int newheight) {
        this.height = newheight;
    }

    public double getHeight() {
        return height;
    }

    public double area() {
        return area;
    }

    public double perimeter() {
        return perimeter;
    }

    public int getRectangleID() {
        ID++;
        return ID;
    }
}

