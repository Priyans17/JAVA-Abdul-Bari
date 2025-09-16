package MultipleClasses;

//abstract class Superrr {
//    public Superrr() {
//        System.out.println("Super Constructor");
//    }

//    public void meth1() {
//        System.out.println("Meth1 of Super");
//    }
//
//    abstract public void meth2();
//}
//
//class Subbb extends Superrr {
//    @Override
//    public void meth2() {
//        System.out.println("Sub Method 2");
//    }
//}
//
//public class Abstract {
//    public static void main(String[] args) {
//        Superrr s = new Subbb(); // constructor of Superrr gets called first
//        s.meth1();  // calls concrete method from Superrr
//        s.meth2();  // calls overridden method from Subbb
//    }
//}


//Abstract class real life examples - Student Challenge

abstract class Shape
{
    abstract public double perimeter();
    abstract public double area();
}

class Circle extends Shape
{
    double radius;

    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double area()
    {
        return Math.PI*radius*radius;
    }

}

class Rectangle extends Shape
{
    double length;
    double breadth;

    public double perimeter()
    {
        return 2*(length+breadth);
    }
    public double area()
    {
        return length*breadth;
    }

}

public class Abstract
{
    public static void main(String[] args)
    {
        Rectangle r=new Rectangle();
        r.length=10;
        r.breadth=5;

        Shape s=r;

        System.out.println(s.area());

    }
}


//Do-s & Don't-s

