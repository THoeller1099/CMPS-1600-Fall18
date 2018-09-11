public class RectangleTester {
    public static void main(String args[]) {
        Rectangle rect1 = new Rectangle(5, 10);
        System.out.println(rect1.getArea());
        System.out.println(rect1.getPerimeter());
        System.out.println(rect1.getRectangleID());

        rect1.setHeight(20);
        System.out.println(rect1.getArea());
        System.out.println(rect1.getPerimeter());

        Rectangle rect2 = new Rectangle(15, 20);
        System.out.println(rect1.getRectangleID());
    }
}