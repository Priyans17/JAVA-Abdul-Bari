package Priyansh;

public class Circle {

    static class Circle1 {
//        public double radius;
//
//        public double area() {
//            return Math.PI * radius * radius;
//        }
//
//        public double perimeter() {
//            return 2 * Math.PI * radius;
//        }
//
//        public double circumference() {
//            return perimeter();
//        }
    }

    //    public static void main(String[] args) {
//        Circle1 c1 = new Circle1();
//        c1.radius = 15.0; // Assign radius
//
//        System.out.println("Area: " + c1.area());
//        System.out.println("Perimeter: " + c1.perimeter());
//        System.out.println("Circumference: " + c1.circumference());
//    }
//


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

        public static void main(String[] args) {
            Circle c1 = new Circle();
            Circle c2 = new Circle();

            c1.radius = 15.0;
            c2.radius = 7.0;

            System.out.println("Circle 1:");
            System.out.println("Area: " + c1.area());
            System.out.println("Perimeter: " + c1.perimeter());
            System.out.println("Circumference: " + c1.circumference());

            System.out.println("\nCircle 2:");
            System.out.println("Area: " + c2.area());
            System.out.println("Perimeter: " + c2.perimeter());
            System.out.println("Circumference: " + c2.circumference());
        }
    }



