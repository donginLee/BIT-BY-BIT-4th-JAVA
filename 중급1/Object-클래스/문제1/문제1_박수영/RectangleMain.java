public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 10);
        Rectangle rect2 = new Rectangle(10, 10);

        System.out.println(rect1 == rect2);
        System.out.println(rect1.equals(rect2));
    }
}