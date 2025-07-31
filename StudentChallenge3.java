package Priyansh;

import java.util.Scanner;
//Display name of a day based on number

public class StudentChallenge3 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Day Number");
//        int day = sc.nextInt();
//
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Enter appropriate day");
//                break;

        //Display name of a month based on number

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter month number (1-12): ");
//        int month = sc.nextInt();
//
//        String monthName;
//
//        switch (month) {
//                    case 1:  monthName = "January"; break;
//                    case 2:  monthName = "February"; break;
//                    case 3:  monthName = "March"; break;
//                    case 4:  monthName = "April"; break;
//                    case 5:  monthName = "May"; break;
//                    case 6:  monthName = "June"; break;
//                    case 7:  monthName = "July"; break;
//                    case 8:  monthName = "August"; break;
//                    case 9:  monthName = "September"; break;
//                    case 10: monthName = "October"; break;
//                    case 11: monthName = "November"; break;
//                    case 12: monthName = "December"; break;
//                    default: monthName = "Invalid month number!";
//                }
//
//                System.out.println("Month: " + monthName);
//                sc.close();
//            }
//        }

        //Display type of website

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the domain name ");
//        String domain = sc.nextLine();
//
//        String ext = domain.substring(domain.lastIndexOf(".")+1);
//
//        switch (ext) {
//            case "com":
//                System.out.println("commercial");
//                break;
//            case "org":
//                System.out.println("organisational");
//                break;
//            case "gov":
//                System.out.println("government");
//                break;
//            case "net":
//                System.out.println("networking");
//                break;
//        }
//
//
//
//
        //Make a Menu Driven Program for Arithmetic Operations

        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("=====");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("DIV");
        System.out.println("MUL");

        System.out.println("Enter 2 Numbers");

        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Option in Words");
        String option = sc.nextLine();
        option=option.toUpperCase();

        switch (option) {
            case "ADD":
                System.out.println("Sum is  " + (x + y));
                break;
            case "SUB":
                System.out.println("Difference is  " + (x - y));
                break;
            case "MUL":
                System.out.println("Product is  " + (x * y));
                break;
            case "DIV":
                System.out.println("Ratio is  " + (x / y));
                break;
            default:
                System.out.println("Invalid Option");
        }

        







    }
}