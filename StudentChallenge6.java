package Priyansh;

public class StudentChallenge6 {

    //Find a Number is Prime or Not - Prime number means for example 12 - If its divisible by 1 & 12(not prime) itself then its prime number.
    //If its having more than two factors then it is not a prime number. So if any number only two factors one and itself then its a prime.
    //Prime numbers are - 	2, 3, 5, 7, 11, 13, 17, 19, 23, 29,	31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97


//    static boolean isPrime(int n) {
//        for (int i = 2; i < n / 2; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//        public static void main (String[]args){
//            System.out.println(isPrime(129));
//        }
//    }

//Another method

//    static boolean isPrime(int n) {
//        for (int i = 2; i < n / 2; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        if (isPrime(78))
//            System.out.println("91 is a prime");
//    }
//}


    //Find GCD of 2 numbers - Greatest common divisor suppose we have 35 - 1,5,7,35 factors & 56 - 1,2,4,7,8.. Common GCD will be 7

//    static int gcd(int n, int m) {
//        while(m!=n) {
//            if(m>n) m = m - n;
//            else n = n - m;
//        }
//        return m;
//    }
//    public static void main(String[] args) {
//        System.out.println(gcd(25,15));
//        StudentChallenge6 x = new StudentChallenge6();
//        System.out.println(x.gcd(35,56));
//    }
//}

    //Find the Max element in an Array

//    static int findMax(int[] arr) {
//        int max = arr[0]; // Assume first element is max
//        for (int i = 1; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        return max;
//    }
//
//    public static void main(String[] args) {
//        int[] numbers = {8, 6, 10, 9, 2, 15, 73, 13, 14, 11};
//
//        int maxValue = findMax(numbers);
//        System.out.println("Maximum element in the array: " + maxValue);
//    }
//}

    //Method Overloading

//    static byte max(byte x, byte y) {
//        return x>y ? x:y;
//    }

//    static int max(int x, int y) {
//        return x > y? x: y;
//    }

//    static float max(float x, float y) {
//        if(x>y)
//        return x;
//        else
//            return y;
//    }

//    public static void main(String[] args) {
//        byte a = 10, b = 4;
//        System.out.println(max(a,b)); //different methods are called depending on the parameter, so this behaviour is called a
    //polymorphism. float can also work for integer, byte works only for byte type of data.
//    }


//    static int max(int x, int y){
//    return x>y?x:y;
//    }
//
//    static int max(int x, int y, int z) {
//        if(x>y && x>z)
//                return x;
//            else if (y>z)
//                return y;
//            else
//                return z;
//        }
//    public static void main(String[] args) {
//        byte a = 15, b = 99;
//        System.out.println(max(10,4,55));
//    }
//
//    }


    //Student Challenge
    //Overloaded method to calculate areas


//        // Area of Circle
//        static double area(double radius) {
//            return Math.PI * radius * radius;
//        }
//
//        // Area of Rectangle
//        static double area(double length, double breadth) {
//            return length * breadth;
//        }
//
//        // Area of Square
//        static double area(int side) {
//            return side * side;
//        }
//
//        public static void main(String[] args) {
//            System.out.println("Area of Circle (r=5): " + area(5.0));
//            System.out.println("Area of Rectangle (5 x 4): " + area(5.0, 4.0));
//            System.out.println("Area of Square (side=6): " + area(6));
//        }
//    }

    //Overloaded Method to reverse a int or array

//    // Reverse an integer
//    static int reverse(int n) {
//        int rev = 0;
//        while (n > 0) {
//            rev = rev * 10 + n % 10;
//            n /= 10;
//        }
//        return rev;
//    }
//
//    // Reverse an array
//    static int[] reverse(int[] A) {
//            int[] B = new int[A.length];
//            for (int i = 0; i < A.length; i++) {
//                B[i] = A[A.length - 1 - i];
//            }
//            return B;
//        }
//
//        public static void main(String[] args) {
//            System.out.println("Reverse of 12345: " + reverse(12345));
//
//            int[] arr = {10, 20, 30, 40, 50};
//            for (int val : reverse(arr)) System.out.print(val + " ");
//        }
//    }


    //Overload method to validate the name and age
//
//    static boolean Validate(String name) {
//        return name.matches("[a-zA-Z\\s]*");
//    }
//
//    static boolean Validate(int age) {
//        return age >= 3 && age <= 15;
//    }
//
//    public static void main(String[] args) {
//        String name = "Joy";
//        System.out.println("Is the name valid " + Validate(name));
//
//        int age = 13;
//        System.out.println("Is the age valid " + Validate(age));
//    }
//}

}