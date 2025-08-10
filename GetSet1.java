package Priyansh;

//class GetSet {
//    private double length;
//    private double breadth;
//
//    public double getLength() {
//        return length;
//    }
//    public double getBreadth() {
//        return breadth;
//    }
//
//    public void setLength(double l) {
//        if(length >= 0) {
//            length = l;
//        } else {
//            length = 0;
//        }
//        length = l;
//    }
//    public void setBreadth(double b) {
//        if (b >= 0) {
//            breadth = b;
//        } else {
//            breadth = 0;
//        }
//        breadth = b;
//    }
//
//    public double area() {
//        return length * breadth; //getLength * getBreadth;
//    }
//    public double perimeter() {
//        return 2 * (length + breadth);
//    }
//    public boolean isSquare() {
//        return length == breadth;
//    }
//
//    // static nested test class
//    public static class GetSetTest {
//        public static void main(String[] args) {
//            GetSet gs = new GetSet();
//
//            gs.setLength(10.5);
//            gs.setBreadth(5.5);
//
//            System.out.println("Area " + gs.area());
//            System.out.println("Perimeter " + gs.perimeter());
//            System.out.println("It is a Square " + gs.isSquare());
//
//            System.out.println("Length " + gs.getLength());
//            System.out.println("Breath " + gs.getBreadth());
//        }
//    }
//}


class GetSet
{
    private double length;
    private double breadth;

    public double getLength()
    {
        return length;
    }

    public double getBreadth()
    {
        return breadth;
    }

    public void setLength(double l)
    {
        if(l>=0)
            length=l;
        else
            length=0;
    }

    public void setBreadth(double b)
    {
        if(b>=0)
            breadth=b;
        else
            breadth=0;
    }

    public double area()
    {
        //return length*breadth;
        return getLength()*getBreadth();
    }

    public double perimeter()
    {
        return 2*(length+breadth);
    }

    public boolean isSquare()
    {
        if(length==breadth)
            return true;
        else
            return false;
    }
}


public class GetSet1{

    public static void main(String[] args) {
        GetSet gs = new GetSet();
        gs.setLength(10.5);//check with negative values.
        gs.setBreadth(5.5);

        System.out.println("Area "+gs.area());
        System.out.println("Perimeter "+gs.perimeter());
        System.out.println("Is Square "+gs.isSquare());

        System.out.println("Length "+gs.getLength());
        System.out.println("Breadth "+gs.getBreadth());
    }

}