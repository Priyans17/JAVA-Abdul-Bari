package MultipleClasses;

import java.util.*;

//Static Members

//class Test {
//    static int x = 10;
//    static int y = 20;
//
//    void show() {
//        System.out.println(x + " " + y);
//    }

//    static void display() {
//        System.out.println(x);
//    }
//}
//public class Static_FInal {
//    public static void main(String[] args) {
//        Test t1 = new Test();
//        t1.show();
//        t1.x = 30;
//        t1.y = 40;
//
//        Test t2 = new Test();
//        t2.show();
//
//    }
//}
//

//Static Blocks

//public class Static_FInal {
//        static {
//            System.out.println("Block 1");
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Main");
//    }
//    static {
//        System.out.println("Block 2");
//    }
//}
//
//
//class Test {
//    static {
//        System.out.println("Block 1");
//    }
//    static {
//        System.out.println("Block 2");
//    }
//}
//public class Static_FInal {
//    public static void main(String[] args) {
//
////        Test t = new Test();
//        System.out.println("Main");
//        Test t = new Test();
//    }
//}

//// Final Keyword Example
//public class Static_Final {
//
//    // final variable (initialized inside constructor)
//    final float PI;
//
//    // Constructor initializes the final variable
//    public Static_Final() {
//        PI = 3.14f;
//    }
//
//    public static void main(String[] args) {
//        final int x = 10;  // final local variable
//        System.out.println("Final local variable x: " + x);
//
//        // Accessing final instance variable through object
//        Static_Final obj = new Static_Final();
//        System.out.println("Final instance variable PI: " + obj.PI);
//    }
//}

//Singleton Example
//CoffeeMachine

//class CoffeeMachine {
//    private float CoffeeQty;
//    private float MilkQty;
//    private float WaterQty;
//    private float SugarQty;
//
//    static private CoffeeMachine my = null;
//
//    private CoffeeMachine() {
//        CoffeeQty = 1;
//        MilkQty = 1;
//        WaterQty = 1;
//        SugarQty = 1;
//    }
//
//    public void fillWater(float qty) {
//        WaterQty = qty;
//    }
//    public void fillSugar(float qty) {
//        SugarQty = qty;
//    }
//    public float getCoffee() {
//        return 0.15f;
//    }
//
//    static CoffeeMachine getInstance(){
//        if(my==null)
//            my = new CoffeeMachine();
//        return my;
//    }
//}
//
//public class Static_FInal {
//    public static void main(String[] args) {
//        CoffeeMachine m1 = CoffeeMachine.getInstance();
//        CoffeeMachine m2 = CoffeeMachine.getInstance();
//        CoffeeMachine m3 = CoffeeMachine.getInstance();
//
//        System.out.println(m1 +" "+ m2+" "+ m3);
//        if(m1==m2 && m2==m3){
//            System.out.println("Same");
//        }
//    }
//}

//Student Challenge 8

class Student {

    private String rollNo;
    private static int count = 1;
    private String assignRollNo()
    {
        Date d = new Date();
        String rno = "Univ-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rno;
    }
    Student()
    {
        rollNo = assignRollNo();
    }
    public String getRollNo() {
        return rollNo;
    }
}

public class Static_FInal {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());
        System.out.println(s3.getRollNo());
    }

}