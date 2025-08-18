package MultipleClasses;

//class Parent {
//    public Parent() {
//        System.out.println("Parent Constructor");
//    }
//}
//
//class Child extends Parent {
//    public Child() {
//        System.out.println("Child Constructor");
//    }
//}
//class GrandChild extends Child {
//    public GrandChild() {
//        System.out.println("GrandChild Constructor");
//    }
//}
//public class inheritconst {
//    public static void main(String[] args) {
////      Parent p = new Parent();
////      Child c = new Child();
//        GrandChild gc = new GrandChild();
//    }
//}


//Parameterised Constructors

    class Parent {
        Parent() {
            System.out.println("Non Param of Parent");
        }
        Parent(int x) {
            System.out.println("Param of Parent " + x);
    }
}

    class Child extends Parent {
        Child() {
            System.out.println("Non Param of Child");
        }
        Child(int y) {
            System.out.println("Param of Child");
        }
        Child(int x, int y){
            super(x); //Super is a keyword which refers to the super class
            System.out.println("2 Param of Child " + y);
        }
    }
public class inheritconst {
    public static void main(String[] args) {
        Child c = new Child(10,20);

    }
}