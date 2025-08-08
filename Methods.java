package Priyansh;

public class Methods {

//    static int max(int x, int y ) //if a method is not having a parameter then no problem, if you don't want to return type void.
//    {
//        if (x > y) {
//            return x;
//        } else{
//            return y;
//        }
//    }
//    public static void main(String[] args) {
//         int a = 10, b = 27;
//        System.out.println(max(a,b)); //main method is declared as static so the rule says - static methods can call only static methods.

    //I don't want the method as static then what to do and call inside main method.

//    int max (int x , int y) {
//        if (x > y) {
//            return x;
//        } else {
//            return y;
//        }
//    }
//    public static void main(String[] args) {
//        int a = 33, b = 66;
//        Methods m = new Methods();
//        System.out.println(m.max(a,b));

    //So there are two ways of a method from main method, either you make the method static or else create an object and then call the method.

//    static void inc(int x) {
//        x++;
//        System.out.println(x);
//    }
//
//    public static void main(String[] args) {
//        int a = 10, b = 33;
//        inc(a);
//        System.out.println(a);
//    }

    //Objects are passed to methods

//    static void change(int X[], int index, int value){
//        X[index] = value;
//    }
//
//    public static void main(String[] args) {
//        int A[] = {1,2,4,5,7};
//        change(A,4, 55);
//
//        for(int x : A) {
//            System.out.println(x);
//        }
//    }

    //Change the value of primitive data type

//        static void change(int X[], int index, int value){
//        X[index] = value;
//    }
//
//    static void change2(int x, int value){
//            x = value;
//    }
//
//    public static void main(String[] args) {
//        int A[] = {1,2,4,5,7};
//        change(A,4, 55);
//
//        for(int x : A) {
//            System.out.println(x);
//        }
//
//        int x = 10;
//        change2(x, 20);
//        System.out.println("Value of Primitive " + x);

        //Difference in Java when you pass Primitives they are passed like values.
//    }
}


