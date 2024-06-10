package javaInput;
import java.util.Scanner;

public class example_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your dividend :  ");
        int dividend = sc.nextInt();
        System.out.println("Enter your divisor : ");
        int divisior = sc.nextInt();

        int quotient = dividend / divisior;  // simply division gives quotient in case of integer
        // as divdidend = divisor * quotient + remainder
        // remainder = dividened -( divisior * quotient)


        int remainder = dividend - (divisior * divisior);
        System.out.println("The remainder when "+ dividend + " is divided by " + divisior + " remainder is " + remainder );


    }
}
