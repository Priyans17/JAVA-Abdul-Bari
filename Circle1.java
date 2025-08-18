package MultipleClasses;

public class Circle1 {
    public static void main(String[] args) {
        // First create outer class object
        Circle1 outer = new Circle1();

        // Then create Circle object
        Circle circle = outer.new Circle();

        // Then create Cylinder object (from Circle)
        Circle.Cylinder c = circle.new Cylinder();

        // Set values
        c.radius = 7;
        c.height = 10;

        // Call methods
        System.out.println("Volume = " + c.volume());
        System.out.println("Base Area = " + c.area());
        System.out.println("Perimeter = " + c.perimeter());
    }

    class Circle {
        public double radius;

        public double area() {
            return Math.PI * radius * radius;
        }

        public double perimeter() {
            return 2 * Math.PI * radius;
        }

        public double circumference() {
            return perimeter();
        }

        class Cylinder extends Circle {
            public double height;

            public double volume() {
                return area() * height;
            }
        }
    }
}
