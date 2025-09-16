package MultipleClasses;

//Nested Inner Classs

//class Outer {
//    static int  x = 10;//Static members can be directly accessed just by using class names, so they're accessible anywhere.
//    Inner i = new Inner();
//
//    class Inner {
//        int y = 20;
//
//        public void innerDisplay() {
//            System.out.println(x + " " + y);
//        }
//    }
//
//    public void OuterDisplay()
//    {
////        Inner i = new Inner();
//        i.innerDisplay();
//        System.out.println(i.y);
//    }
//}
//    public class InnerClass {
//        public static void main(String[] args) {
////            Outer o = new Outer();
////            o.OuterDisplay();
//            Outer.Inner oi = new Outer().new Inner();
//            oi.innerDisplay();
//
//        }
//    }

//Local Inner class

//class Outer {
//    public void display() {
//        class Inner {
//            public void show()
//            {
//                System.out.println("Hello");
//            }
//        }
////        Inner i = new Inner();
////        i.show();
//        new Inner().show(); //Anonymous class - we can have abstract class and we can define a concrete class as Inner class.
//    }
//}




//public class InnerClass {
//    public static void main(String[] args) {
//        Outer o = new Outer();
//        o.display();
//
//    }
//}


// Using abstract also by interface it works the same - you can create object of the interface by overriding the methods.
//So it will not an object of an interface but it will be an object of a anonymous class. Some class object will be created.
//abstract class My {
//    abstract public void show();
//}
//
//class Outer {
//    public void display() {
//        // Anonymous inner class extending My
////        My m =
//        new My() {
//            public void show() {
//                System.out.println("Hello");
//            }
//        }.show();
//
//        // Call the method after object creation
////        m.show();
//    }
//}
//
//public class InnerClass {
//    public static void main(String[] args) {
//        Outer o = new Outer();
//        o.display();
//    }
//}

//Static Inner class

class Outer {
    int x = 10;
    static int  y = 20;
    static class My {
        public void show() {
//            System.out.println(x + " "+ y);
            System.out.println(y);
        }

    }
}

public class InnerClass {
    public static void main(String[] args) {
        Outer.My om = new Outer.My();
        om.show();
    }
}
