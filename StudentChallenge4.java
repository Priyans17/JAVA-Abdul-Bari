package Priyansh;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class StudentChallenge5 {
    public static void main(String[] args) {
        //Display Numbers in Words with tailing 0

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number ");
//        int n = sc.nextInt();
//
//        int r; //remainder
//        String str = "";  //forming a reverse of a number
//        //we have to take out all the digits and concatenate it to a string
//
//        while (n > 0) {
//            r = n % 10;
//            n = n / 10;
//            str = str + r;
//        }
//        System.out.println(str);
//
//        //Now till her the number gets reversed, we need to convert it to string
//
//        char c;
//        for (int i = str.length() - 1; i >= 0; i--) {
//            c = str.charAt(i);
//            switch (c) {
//                case '0':
//                    System.out.print("Zero ");
//                    break;
//                case '1':
//                    System.out.print("One ");
//                    break;
//                case '2':
//                    System.out.print("Two ");
//                    break;
//                case '3':
//                    System.out.print("Three ");
//                    break;
//                case '4':
//                    System.out.print("Four ");
//                    break;
//                case '5':
//                    System.out.print("Five ");
//                    break;
//                case '6':
//                    System.out.print("Six ");
//                    break;
//                case '7':
//                    System.out.print("Seven ");
//                    break;
//                case '8':
//                    System.out.print("Eight ");
//                    break;
//                case '9':
//                    System.out.print("Nine ");
//                    break;
//                default:
//                    System.out.println("Invalid");
//            }
//        }

        //Display AP. Series
        //AP Series - Its Arithmetic Progression Series for example -
        // 5,10,15,20 this is a series
        // 3,8,13,18,23...
        //7,9,11,13,15...
        //general progression - Ap = a + ad + a2d + a3d...

        //we need to take the starting term a = ?, common difference d = ?, and the number of terms n =?

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Program to print AP Series");
//        System.out.println("Enter the a, d, n");
//        int a = sc.nextInt();
//        int d = sc.nextInt();
//        int n = sc.nextInt();
//
//        int term = a;
//        for (int i = 0; i < n; i++) {
//            System.out.print(term + ",");
//            term = term + d; //added common difference
//        }

        //Display GP Numbers
        //GP - Its Geometric Progression
        //Series - 2,6, 18, 54...
        //5, 10, 20, 40...
        //general form - a + ar + ar^2 + ar^3...
        //For displaying GP series you need to know starting term a = ?, common ration r = ?, how many terms we want n = ?

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Program to print GP Series");
//        System.out.println("Enter a, r & n ");
//        int a = sc.nextInt();
//        int r = sc.nextInt();
//        int n = sc.nextInt();
//
//        int term = a;
//        for (int i = 0; i < n; i++) {
//            System.out.print(term + ",");
//            term = term * r;
//
//        }
//    }


        //Fibonacci Series
        //0, 1, 1, 2, 3, 5, 8, 13, 21
        //In the series the first term is 0th term - adding keeps on going initially we need to terms and further it goes on adding.
        //Mathematically its defined - fib(n) = fib(n-2) + fib(n-1)

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Program to print Fibonacci Series");
//        System.out.println("Enter the number of Terms");
//
//        int n = sc.nextInt();
//        int a = 0, b = 1, c;
//        System.out.print(a + "," + b + ",");
//        for(int i=0; i<n-2; i++) {
//            c=a+b;
//            System.out.print(c+",");
//            a=b;
//            b=c;
//        }
//    }

        //Nested Loops

//        for(int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++) {
//                System.out.print("("+i + "," + j + ") ");
//            }
//            System.out.println();
//            }
//        }

        //Patterns

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <=5; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println(" ");
//
//        }

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <=5; j++) {
//                System.out.print(i + " ");
//            }
//            System.out.println(" ");
//
//        }

//        int count = 0;
//          for (int i = 1; i <= 5; i++) {
//              for (int j = 1; j <= 5; j++) {
//                  count++;
//                  System.out.format("%02d ", count);
//              }
//              System.out.println(" ");
//          }

//        int count = 0;
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//                count++;
//                System.out.print(count + " ");
//            }
//            System.out.println(" ");
//        }


//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= i; j++) {
//
//                System.out.print("* ");
//            }
//            System.out.println(" ");
//        }

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5-i+1; j ++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

//        int count = 0;
//        for (int i = 1; i<= 5; i++) {
//            for (int j = 1; j <= 5-i+1; j++) {
//                count++;
//                System.out.format("%02d ", count);
//            }
//            System.out.println();
//        }

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++) {
//                if (i <= j) {
//                    System.out.print("* ");
//                }
//                else System.out.print("  ");
//            }
//            System.out.println("");
//        }

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++) {
//                if (i + j > 5) {
//                    System.out.print("* ");
//                }
//                else System.out.print("  ");
//            }
//            System.out.println(" ");
//        }
        



    }
    }





