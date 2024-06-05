package javaInput;
import java.util.Scanner;


public class sumOfTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first_no. ");
        int first_no  = sc.nextInt();
        System.out.println("Enter your second_no. ");
        int second_no = sc.nextInt();
        float sum = first_no + second_no;
        System.out.println("sum of two no. "+sum);




    }
}
