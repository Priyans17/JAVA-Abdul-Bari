package MultipleClasses;

//class Rectangle {
//    int length;
//    int breadth;
//
//    Rectangle() {
//        length = breadth = 10;
//    }
//    Rectangle(int l, int b) {
//        length = l;
//        breadth = b;
//    }
//}
//
//class Cuboid extends Rectangle {
//    int height;
//
//    Cuboid() {
//        height = 1;
//    }
//    Cuboid(int h) {
//        height = h;
//    }
//    Cuboid(int l, int b, int h){
//        super(l,b);
//        height = h;
//    }
//
//    int volume() {
//        return length * breadth * height;
//    }
//}
//
//public class SuperConst {
//    public static void main(String[] args) {
//        Cuboid c = new Cuboid(5,3,  10);
//        System.out.println(c.volume());
//    }
//
//}

//Properties or members of the class will have green color.
//Parameters will be of orange color
//to avoid name conflict i should assign this. so that it will refer properly.

//class Rectangle {
//    int length;
//    int breadth;
//
//    Rectangle(int length, int breadth) {
//        this.length = length;
//        this.breadth = breadth;
//    }
//    void display() {
//        System.out.println("Length: "+this.length);
//        System.out.println("Breadth: "+this.breadth);
//    }
//}
//
//public class SuperConst {
//    public static void main(String[] args) {
//        Rectangle r = new Rectangle(10,20);
//        r.display();
//    }
//}

//this is the reference to a current object.
//Super is the reference to the super class.

//class Rectangle {
//     int length;
//     int breadth;
//     int x = 10;
//
//     Rectangle(int length, int breadth) {
//         this.length = length;
//         this.breadth = breadth;
//     }
//}
//
//class Cuboid extends Rectangle {
//    int height;
//    int x = 20;
//
//    Cuboid(int l, int b, int h) {
//        super(l,b);
//        height = h;
//    }
//    void display() {
//        System.out.println(super.x);
//        System.out.println(x);
//    }
//}
//
//public class SuperConst {
//    public static void main(String[] args) {
//        Cuboid c = new Cuboid(10,5,15);
//        c.display();
//    }
//}


//Method Overriding and Dynamic Method Dispatch

class Super {
    public void display() {
        System.out.println("Super class Display");
    }
}

class Sub extends Super {
//    @Override
    public void display() {
//      public void display(int x) {
          System.out.println("Sub class Display");
    }
}
public class SuperConst {
    public static void main(String[] args) {
        Super su = new Sub();
        su.display(); //Hello

//        Sub sb = new Sub();
//        sb.display(); //
    }
}