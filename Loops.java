package Priyansh;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        int i = 1;
//
//        while(i < 100) {
//            System.out.println(i);
//            i=i*2;
//        }
//    }

        //do while

//        int i = 1;
//        do {
//            System.out.println(i);
//            i=i*2;
//        } while (i < 2010);

//        byte i = 1;
//
//        while(true) {
//            System.out.println(i);
//            i++;

        //Loops Practice

//        for (int i=0; i<=10; i++){
//            System.out.println(i);
//        }

//        for (int i=10; i>=0; i--) {
//            System.out.println(i);
//        }

//        int i = 0;
//
//        for(System.out.println("Crazy");i<=10; i++){
//            System.out.println(i);
//        }

//        for (int i=0, j=1 ; i<=10;i++,j=j*2) {
//            System.out.println(i+" "+j);
//        }

//        Student Challenge

        //Display Multiplication Table

//        int n =5;
//        for(int i=1; i<=10; i++) {
//            System.out.println(n + "*" + i + "=" + n*i);
//        }

//        int n = 13;
//        for (int i=1; i<=20; i++) {
//            System.out.println(n + "*" + i + "=" + n*i);
//        }

//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter the number");
//        int n = sc.nextInt();
//
//        for(int i=1; i<=10; i++){
//            System.out.println(n + "*" + i + "=" + n*i);
//        }

        //Find sum of n numbers (Natural no's - 1,2,3,4,5,6....) (1+2+3+4+5..+10)

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number ");
//        int  n = sc.nextInt();
//        int sum = 0;
//        for(int i = 1; i<=n; i++) {
//            sum = sum + i;
//        }
//        System.out.println("Sum of " +n+ " Number is " +sum);

        //Factorial of a Number
        //5! - Representation in mathematics
        //Suppose a number given is 5 - then 1*2*3*4*5 = 120 -> Factorial of the number

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number ");
//        int n = sc.nextInt();
//        long fact = 1;
//        for(int i=1; i<=n; i++) {
//            fact = i * fact;
//        }
//        System.out.println("The Factorial is " +fact);
//

        //Display Digits of No.

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the number ");
//        int n = scan.nextInt();
//        int r;
//
//        while (n > 0) {
//            r=n%10;
//            n=n/10;
//            System.out.println(r);
//        }
//        System.out.println(n);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number ");
//        int n = sc.nextInt();
//        int r;
//
//        while (n > 0) {
//            r = n % 10;
//            n = n / 10;
//
//            System.out.println(r);
//        }

        //Count digits of a Number
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number ");
//
//        int count = 0;
//        int n = sc.nextInt();
//
//        while(n>0) {
//            n=n/10;
//            count++;
//        }
//        System.out.println(count);

        //Finding number is Armstrong or not
        //Suppose a number = 153 - 3^3 + 5^3 + 1^3 = 27 + 125 + 1 = 153 If the cubes of the digits are added and you are getting the same number then its an Armstrong number.

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number ");
//        int n = sc.nextInt();
//
//        int m = n;
//        int sum = 0;
//        int r;
//
//        while (n > 0) {
//            r = n%10;
//            n=n/10;
//            sum = sum + r * r * r;
//        }
//        if (sum == m) {
//            System.out.println("Its an Armstrong number");
//        } else {
//            System.out.println("Not an Armstrong NUmber");
//        }

        //Reverse a Number

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number ");
//        int n = sc.nextInt();
//
//        int rev = 0, r;
//
//        while (n > 0) {
//            r = n % 10;
//            rev = rev * 10 + r;
//            n = n / 10;
//        }
//        System.out.println("Reverse num " + rev);

        //Palindrome Number

        //Suppose if a number is n = 12521 and rev  = 12521 so the reverse of the number is equal to the number then its a palindrome/

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Number ");
//        int n = sc.nextInt();
//        int m = n;
//        int rev = 0,r;
//
//        while (n>0) {
//            r=n%10;
//            rev = rev * 10 + r;
//            n /= 10;
//        } if (rev == m) {
//            System.out.println("Number is Palindrome");
//        } else {
//            System.out.println("Number is not a Palindrome");
//        }

    }
}