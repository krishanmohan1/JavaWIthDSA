package javaInput;
import java.util.Scanner;


public class homework_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        float number = sc.nextFloat();
        float square = number*number;

        System.out.println("The Square of the number is : "+square);

    }
}
