package Priyansh;

public class Rectangle {

    public double length;
    public double breadth;

    public double area() {
        return length * breadth;
    }
    public double perimeter() {
        return 2 * (length + breadth);
    }
    public boolean isSquare() {
        return length == breadth;

    }
    static class RectangleTest {
        public static void main(String[] args) {
            Rectangle r = new Rectangle();

            r.length = 15;
            r.breadth = 20;

            System.out.println("Area of Rectangle " + r.area());
            System.out.println("Perimeter of Rectangle " + r.perimeter());
            System.out.println("Is it a Square " + r.isSquare());

        }
    }
}
