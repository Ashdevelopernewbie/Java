/*
    3.1 Write a Java program to divide two numbers and print on the screen.Take the two numbers as input from the user.
*/



import java.util.Scanner;

public class divideWithInput {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the first number:");
            int num1 = input.nextInt();
            System.out.println("Enter the second number:");
            int num2 = input.nextInt();
            int div = num1 / num2 ;
            System.out.println();
            System.out.println("The division of two given numbers is" + div);
        }

    }
}
