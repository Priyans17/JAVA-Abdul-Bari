package MultipleClasses;

import java.util.Scanner;

////Basic Try & Catch Block
//public class ExceptionHandling {
//    public static void main(String[] args) {
////
////        int a = 10, b = 0, c;
////        c = a / b;
////        System.out.println(c);
////
////        System.out.println("bye");
//        int a,b,c;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the two numbers");
//        a = sc.nextInt();
//        b = sc.nextInt();

//        try {
//            c = a / b;
//            System.out.println("Division is: " + c);
//
//        } catch (ArithmeticException e) {
//            System.out.println("Denominator should not be zero, try again");
////            System.out.println(e);
//        }
//        System.out.println("Bye");
//    }
//}


//Nested & Multiple Try & Catch Blocks.
//
//public class ExceptionHandling {
//    public static void main(String[] args) {
//        int A[] = {10, 5, 50, 8, 3};
//        try {
//            int C = A[0] / A[1];
//            System.out.println("Divison is " + C);
//
//            try {
//                System.out.println(A[2]);
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("Index is Invalid");
//            }
//        }
//        catch (ArithmeticException e) {
//                System.out.println("Denominator cannot be 0, Try Again");
//            }
//
//            System.out.println("Bye");
//        }
//    }

//Checked & Unchecked Exceptions
//Unchecked
//public class ExceptionHandling {
//
//        static void fun1() {
//            try {
//                System.out.println(10 / 0);
//            } catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//        }
//        static void fun2() {
//            fun1();
//        }
//
//        static void fun3() {
//            fun2();
//        }
//    public static void main(String[] args) {
//        fun3();
//    }
//    }
//

//Checked Exceptions

import java.io.*;

//// Example of Checked Exceptions
//public class ExceptionHandling {
//
//    // Method that may throw a checked exception
//    static void fun1() throws IOException {
//        // Simulating an error condition
//        throw new IOException("IOException occurred in fun1()");
//    }
//
//    // Method that calls fun1()
//    static void fun2() throws IOException {
//        fun1(); // fun1 throws IOException, so fun2 must handle or declare it
//    }
//
//    // Method that calls fun2()
//    static void fun3() throws IOException {
//        fun2(); // fun2 also throws IOException, so fun3 must handle or declare it
//    }
//
//    public static void main(String[] args) {
//        try {
//            // Calling fun3(), which can throw a checked exception
//            fun3();
//        } catch (IOException e) {
//            // Handling the checked exception
//            System.out.println("Exception caught in main: " + e.getMessage());
//        }
//
//        System.out.println("Program continues normally after handling exception.");
//    }
//}

//LowBalance Example

//class LowBalanceException extends Exception
//{
//    public String toString()
//    {
//        return "Balance Should not be less than 5000";
//    }
//}
//
//public class ExceptionHandling
//{
//    static void fun1()
//    {
//        try
//        {
//            throw new LowBalanceException();
//        }
//        catch(LowBalanceException e)
//        {
//            System.out.println(e);
//        }
//    }
//
//    static void fun2()
//    {
//        fun1();
//    }
//
//    static void fun3()
//    {
//        fun2();
//    }
//
//    public static void main(String[] args)
//    {
//        fun3();
//    }
//}

//Throw vs Throws & Finally

//public class ExceptionHandling {
//
//    static int meth1() {
//        return 10/0;
//    }
//    static void meth2() {
//        meth1();
//    }
//    static void meth3() {
//        meth2();
//    }
//    public static void main(String[] args) {
//        try {
//            meth3();
//        }
//        catch (ArithmeticException e) {
//            System.out.println(e);
//        }
//    }
//}

//public class ExceptionHandling {
//
//    static int area(int l, int b) throws Exception {
//        if (l < 0 || b < 0) throw new Exception();
//        return l * b;
//    }
//
//    static void meth1() throws Exception {
//        System.out.println(("Area is " + area(-10, 6)));
//    }
//
//    //    public static void main(String[] args) throws Exception{
//    public static void main(String[] args) {
//        try {
//            meth1();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//}


class NegativeDimensionException extends Exception
{
    public String toString()
    {
        return "Dimensions of a Rectangle cannot be Negative";
    }
}
//
//public class ExceptionHandling {
//    static int area(int l, int b) throws NegativeDimensionException {
//        if (l < 0 || b < 0)
//            throw new NegativeDimensionException();
//        return l * b;
//    }
//
//    static void meth1() throws NegativeDimensionException {
//        System.out.println("Area is " + area(10, 5));
//    }
//
//    public static void main(String[] args) {
//        try {
//            meth1();
//        } catch (NegativeDimensionException e) {
//            System.out.println(e);
//        }
//        System.err.println("hi");
//    }
//}

//Finally Block

//public class ExceptionHandling {
//    public static void main(String[] args) {
//
//        try {
//            System.out.println(10 / 0);
//        }
//        catch (ArithmeticException e) {
//            System.out.println(e);
//        }
//
//        finally {
//
//            System.out.println("Final Message ");
//        }
//    }
//}

//public class ExceptionHandling {
//
//    static void meth1() throws Exception {
//        try {
//            throw new Exception();
//        } finally {
//            System.out.println("Final Message");
//        }
//    }
//    public static void main(String[] args) throws Exception {
//        meth1();
//
//    }
//}

//Student Challenge 9

//User Defined Exception

// Custom Exception for Stack Overflow
class StackOverFlow extends Exception {
    public String toString() {
        return "Stack is Full";  // Message when stack is full
    }
}

// Custom Exception for Stack Underflow
class StackUnderFlow extends Exception {
    public String toString() {
        return "Stack is Empty";  // Message when stack is empty
    }
}

// Stack class implementing push and pop with exception handling
class Stack {
    private int size;   // Maximum size of the stack
    private int top = -1; // Index of the top element (-1 means empty)
    private int S[];   // Array to store stack elements

    // Constructor: creates a stack of given size
    public Stack(int sz) {
        size = sz;
        S = new int[sz];  // Allocate array for stack elements
    }

    // Push method: insert element into stack
    public void push(int x) throws StackOverFlow {
        if (top == size - 1) // If stack is already full
            throw new StackOverFlow();
        top++;              // Move top pointer to next index
        S[top] = x;         // Insert the new element
    }

    // Pop method: remove and return element from stack
    public int pop() throws StackUnderFlow {
        int x = -1;
        if (top == -1) // If stack is empty
            throw new StackUnderFlow();
        x = S[top];   // Get the top element
        top--;        // Decrease top pointer
        return x;     // Return removed element
    }
}

// Main class to test stack operations
public class ExceptionHandling {
    public static void main(String[] args) {
        Stack st = new Stack(5); // Create a stack of size 5

        try {
            // Pushing 6 elements into a stack of size 5
            st.push(10);
            st.push(15);
            st.push(20);
            st.push(25);
            st.push(30);
            st.push(35); // This will throw StackOverFlow
        }
        catch (StackOverFlow s) {
            System.out.println(s); // Prints "Stack is Full"
        }

        try {
            // Popping all 5 elements
            System.out.println("Popped: " + st.pop());
            System.out.println("Popped: " + st.pop());
            System.out.println("Popped: " + st.pop());
            System.out.println("Popped: " + st.pop());
            System.out.println("Popped: " + st.pop());

            // Trying one more pop → StackUnderFlow
            System.out.println("Popped: " + st.pop());
        }
        catch (StackUnderFlow s) {
            System.out.println(s); // Prints "Stack is Empty"
        }
    }
}


