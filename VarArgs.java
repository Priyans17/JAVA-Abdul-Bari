package Priyansh;

public class VarArgs {

//    static void show(int...A) {
//        for(int x : A) {
//            System.out.println(x
//
//
//            );
//        }
//    }
//
//    public static void main(String[] args) {
//        show();
//        show(10, 20, 30);
//        show(new int[]{3,5,7,9}); //This is an Anonymous Array which doesn't have amy reference,
//        // We can say its created on fly, its utilized by the formal parameter and the been deleted

//    }

    //method which will take variable number of the strings and display all the strings.

//    static void showList(int start, String...S){
//        for(int i = 0; i < S.length; i++) {
//            System.out.println(start+ ". "+S[i]);
//            start++;
//
//        }
//    }
//
//    public static void main(String[] args) { //...args - String []args
//        showList(5,"John","Lokesh","Ram","Shyam");//varibale argument must be the last parameter.
//
//    }

    //Student Challenge 6

    //Maximum of numbers using varargs

//    static int max(int... A) {
//        if (A.length == 0) return Integer.MIN_VALUE;
//        int max = A[0];
//        for (int i = 1; i < A.length; i++) {
//            if (A[i] > max) max = A[i];
//        }
//        return max;
//    }
//    public static void main(String[] args) {
//        System.out.println(max());
//        System.out.println(max(10));
//        System.out.println(max(10, 20));
//        System.out.println(max(10, 20, 30));
//    }

    //Sum of all elements using varargs
//
//        static int sum(int... A) {
//        int s = 0;
//        for (int i = 0; i < A.length; i++) {
//            s += A[i]; // Add each element to sum
//        }
//            return s;
//        }
//
//        public static void main(String[] args) {
//            System.out.println("Sum of All Elements: " + sum(10, 20));
//        }

    //Calculate discount using varargs
//
//    static double discount(double... prices) {
//        double total = 0;
//        for (int i = 0; i < prices.length; i++) {
//            total += prices[i];
//            System.out.println("Total amount " + total);
//        }
//        double discountAmount = total * 0.10; //50% off
//        return discountAmount;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Discount amount " + discount(100, 200, 500, 449));
//    }


    //Recursion

//    static void fun(int n){
//        if(n>0)
//            System.out.println(n);
//        fun(n-1);
//    }
//
//    public static void main(String[] args) {
//        fun(3);
//    }

//    static void fun(int n) {
//        if (n > 0) {
//            fun(n - 1);
//            System.out.println(n);
//        }
//    }
//        public static void main (String[]args){
//            fun(3);
//        }
//    }

}
