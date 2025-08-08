package Priyansh;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
//        int A[] = new int[10];
//        int B[] = {1,2,3,4,5};
//        int C[];
//        C = new int[10];
//
//        int []D = new int[5];
//
//        B[2] = 15;

//        for(int i = 0; i < B.length; i++) {
//            System.out.println(B[i]);
//        }

        //for each - Its used for only reading the elements, If we want to modify the values then we should use couner controlled for loop.
//        for (int x : B) {
//            System.out.println(x);
//        }

//        for (int x : B) {
//            System.out.println(x);
//        }
//        for (int x : B) {
//            System.out.println(x++);
//        }

//        for (int i = 0; i < B.length; i++) {
//            System.out.println(B[i]++);
//        }
//        for (int x:B) {
//            System.out.println(x);
//        }

        //Student Challenge 5

        //Finding Sum of all Elements
        //Scanning all the elements means reading all the elements one by one, visiting / traversing all the elements of an array.

        Scanner sc = new Scanner(System.in);
//        int A[] = {3,9,7,8,12,6,15,5,4,10};

//        int sum = 0;
//
//        for(int i=0; i<A.length; i++) {
//            sum = sum + A[i];
//        }
//
//        System.out.println("Sum is " +sum);

//        int sum = 0;
//
//        for(int x: A) {
//            sum = sum + x;
//        }
//            System.out.println("Sum is " +sum);
//
//
        //Search An Element - Searching can be done only if the elements are unique or distinct, there are no duplicates.

//        int key;
//
//        System.out.println("Enter the key ");
//        key = sc.nextInt();
//
//        for(int i = 0; i < A.length; i++) {
//            if (key == A[i]) {
//                System.out.println("Element found at " + i);
//                System.exit(0);
//            }
//        }
//            System.out.println("Not Found");
//

        //Finding Maximum Element
//
//        int max =A[0];
//
//        for(int i = 0; i < A.length; i++) {
//            if (A[i] > max) {
//                max = A[i];
//            }
//        }
//        System.out.println(max);

        //Find the second largest element

//        int max1, max2;
//
//        max1=max2=A[0];
//
//        for(int i = 0; i < A.length; i++) {
//            if (A[i]  > max1) {
//                max2 = max1;
//                max1 = A[i];
//            }
//            else if (A[i] > max2) {
//                max2 = A[i];
//            }
//        }
//        System.out.println("Second maximum element " + max2);

        //Rotating an Array

        //There are two types of rotation left & right rotation of an array.

        //Left Rotation
//        {
//            int A[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
//
//            for (int x : A)
//                System.out.print(x + ",");
//            System.out.println("");

//            int temp = A[0];
//
//            for (int i = 1; i < A.length; i++) {
//                A[i - 1] = A[i];
//            }
//            A[A.length - 1] = temp;
//
//            for (int x : A)
//                System.out.print(x + ",");
//            System.out.println("");
//
//        }

        //Right rotation

//        int A[] = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
//        System.out.println(" ");
//                for (int x : A)
//                    System.out.print(x + ",");
//                System.out.println();
//
//                // Store last element
//                int temp = A[A.length - 1];
//
//                // Shift elements to the right
//                for (int i = A.length - 1; i > 0; i--) {
//                    A[i] = A[i - 1];
//                }
//
//                // Put last element at first position
//                A[0] = temp;
//
//                // Rotated array
//                System.out.println("Array After Right Rotation:");
//                for (int x : A)
//                    System.out.print(x + ",");
//                System.out.println();
//            }
//        };


        //Inserting an Element - Its possible only if there is free space in an array.

//        int A[] = new int[10];
//        A[0]=6; A[1]=9; A[2]=5; A[3]=8; A[4]=12; A[5]=16;
//
//        int n=6;
//
//        for(int i=0;i<n;i++)
//            System.out.print(A[i]+",");
//        System.out.println("");
//
//        int x=20;
//        int index=2;
//
//        for(int i=n;i>index;i--)
//            A[i]=A[i-1];
//        A[index]=x;
//
//        for(int i=0;i<n;i++)
//            System.out.print(A[i]+",");
//        System.out.println("");
//
//

        //Deleting an element'
//
//        int A[] = new int[10];
//        A[0] = 6; A[1] = 9; A[2] = 5; A[3] = 8; A[4] = 12; A[5] = 16;
//
//        int n = 6; // number of actual elements
//
//// Print original array
//        for (int i = 0; i < n; i++)
//            System.out.print(A[i] + ",");
//        System.out.println("");
//
//// Delete element at index 2
//        int index = 2;
//
//        for (int i = index; i < n - 1; i++)
//            A[i] = A[i + 1];
//
// Reduce the size since one element is deleted
//        n--;
//
// Print updated array
//        for (int i = 0; i < n; i++)
//            System.out.print(A[i] + ",");
//        System.out.println("");
//

    }
}






