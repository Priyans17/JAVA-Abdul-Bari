package MultipleClasses;

//class Superr{
//    public void meth1() {
//        System.out.println("Super Meth1");
//    }
//    public void meth2() {
//        System.out.println("Super Meth2");
//    }
//}
//
//class Subb extends Superr {
//    @Override
//    public void meth2() {
//        System.out.println("Sub Meth2");
//    }
//    public void meth3() {
//        System.out.println("Sub Meth3");
//    }
//}
//public class DynamicMethodDispatch {
//    public static void main(String[] args) {
//        Subb su = new Subb();
//        su.meth1();
//        su.meth2();
//        su.meth3();
////        Superr s = new Subb();
////        s.meth1();
////        s.meth2();
//
//    }
//}

//Overriding Rules

//class Superr {
//    public void display() {
//        System.out.println("Super Display");
//    }
//}
//
//class Subb extends Superr {
//
//    public void display() {
//        System.out.println("Sub Display");
//    }
//}
//
//public class DynamicMethodDispatch {
//    public static void main(String[] args) {
//        Subb su = new Subb();
//        System.out.println(su);
//
//
//    }
//}


//Polymorphism - Method Overloading & Overriding
//
//class Test {
//    public int max(int a, int b) {  //method for finding maximum of 2 integers
//        return a > b ? a : b;
//    }
//    public int max(int a, int b, int c) { //method for finding maximum of 3 integers
//        if(a>b && a>c) return a;
//        else if (b>c) return  b;
//        return c;
//    }
//}
//
////name is same return type is same but the parameters are different
//public class DynamicMethodDispatch {
//    public static void main(String[] args) {
//        Test t = new Test();
//        t.max(10,4);
//        t.max(9,10,12); //compile time polymorphism - overloading can be achieved in the same class & also across classes.(child class)
//    }
//}

//Overriding - Run-Time Polymorphism //Overriding can be achieved in Inheritance only.
    //That is between Sub & SUper class...byte code is written by the compiler 

class Superr {
    public void display() {
        System.out.println("Super Display");
    }
}

class Subb extends Superr {
    public void display() {
        System.out.println("Sub Display");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
//        Superr s = new Superr();
//        s.display();
        Super s = new Sub();
        s.display();
    }
}
















