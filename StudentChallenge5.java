package Priyansh;

public class StudentChallenge5 {
    public static void main(String[] args) {

        //Copying all the elements from array A to array B

//        int A[] = {8, 6, 10, 9, 2, 15, 7, 13, 14, 11};
//        int B[] = new int[10];
//
//        for (int i = 0; i < A.length; i++) {
//            B[i] = A[i];
//        }
//
//        for (int x : B) {
//            System.out.print(x + ",");
//        }
//    }
//}
        //Reverse Copying of an Array - R-L and L-R

//        int A[] = {8, 6, 10, 9, 2, 15, 7, 13, 14, 11};
//        int B[] = new int[10];
//
//        for (int i = A.length - 1, j = 0; i >= 0; i--, j++) {
//            B[j] = A[i];
//        }
//
//        for (int x : B) {
//            System.out.print(x + ",");
//        }

        //Increasing Size of an array

//        int A[] = {8,6,7,9,10};
//        System.out.println("Length of Array A " + A.length);
//
//        int B[] = new int[10];
//
//        for(int i = 0; i < A.length; i++) {
//            B[i] = A[i];
//        }
//        A=B;
//        System.out.println("Length of Array A " + A.length);


        //2D Array

//        int A[][] = new int[5][5];
//        int B[][] = {{1,2,3}, {4,5,6}, {3,4,5}};
//        int C[][];
//        C = new int [5][5];
//
//        int [][]D = new int[5][5];
//        int []E[] = new int [5][5];
//
//        int []F,G[];
//        F = new int[5];

//        for (int i = 0;  i < B.length; i++) {
//            for(int j = 0; j<B[0].length; j++) {
//                System.out.print(B[i][j] + " ");
//            }
//            System.out.println("");
//        }

//        for (int X[] : B){
//            for (int Y:X) {
//                System.out.print(Y + " ");
//            }
//            System.out.println("");
//        }

        //Jagged Arrays

//        int A[][];
//        A = new int[3][];
//
//        A[0] = new int[5];
//        A[1] = new int[3];
//        A[2] = new int[8];

//        for(int i = 0 ; i < A.length; i++) {
//            for (int j = 0; j < A[i].length; j++) {
//                System.out.print(A[i][j]+ " ");
//            }
//            System.out.println("");
//        }

//        for (int X[] : A) {
//            for(int Y : X) {
//                System.out.print(Y + " ");
//            }
//            System.out.println("");
//        }

        //StudentChallenge
        //Matrix Multiplication
        //Adding two Matrices

        //If both the matrices are same order then only it can be added or subtracted..if different it doesn't work

//        int A[][]={{3,5,9},{7,6,2},{4,3,5}};
//        int B[][]={{1,5,2},{6,8,4},{3,9,7}};
//
//        int C[][]=new int[3][3];
//
//        for(int i=0;i<A.length;i++)
//        {
//            for(int j=0;j<A[0].length;j++)
//            {
//                C[i][j]=A[i][j]+B[i][j];
//            }
//        }
//
//        for(int x[]:C)
//        {
//            for(int y:x)
//            {
//                System.out.print(y+" ");
//            }
//            System.out.println("");
//        }
//    }
//}

        //Multiplying 2 Matrices
        //The number of columns of 2 matrices should be equal to the number of the rows of the second matrix.

//        int A[][]={{3,5,9},{7,6,2},{4,3,5}};
//        int B[][]={{1,0,0},{0,1,0},{0,0,1}};
//
//        int C[][]=new int[3][3];
//
//        for(int i=0;i<3;i++)
//        {
//            for(int j=0;j<3;j++)
//            {
//                C[i][j]=0;
//                for(int k=0;k<3;k++)
//                {
//                    C[i][j]=C[i][j]+A[i][k]*B[k][j];
//                }
//            }
//        }
//
//        for(int x[]:C)
//        {
//            for(int y:x)
//            {
//                System.out.print(y+" ");
//            }
//            System.out.println("");
//        }
//
//    }

        //Array of Strings sorting - String is the object of a class - Array of objects

        String arr[] = {"java", "python", "pascal", "smalltalk", "ada", "basic"};
        java.util.Arrays.sort(arr);

        for (String x : arr) {
            System.out.println(x);
        }
    }
}
