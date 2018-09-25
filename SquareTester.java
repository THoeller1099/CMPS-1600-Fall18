public class SquareTester {
    public static void main(String args[]) {
        Square square1 = new Square(10.0);
        System.out.println(square1.toString());
        System.out.println(square1.area());
        System.out.println(square1.perimeter());

        Rectangle rect1 = new Rectangle(4, 5);
        Rectangle rect2 = new Rectangle(4, 5);
        System.out.println(rect1.equals(rect2));

        Square square2 = new Square(20);
        Square square3 = new Square(20);
        System.out.println(square2.equals(square3));

    }
}
