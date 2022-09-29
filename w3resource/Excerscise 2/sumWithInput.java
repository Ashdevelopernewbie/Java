/*
    2.1 Write a Java program to print the sum of two numbers using input from the user.
*/

import java.util.Scanner;

public class sumWithInput{
    public sumWithInput() {
    }
    // dont understand why constructor was used

    public static void main(String[] args) {
        try (Scanner input = new Scanner (System.in)) { //dont understand try 
            System.out.print("Input the first number:");
            int num1 = input.nextInt();
            System.out.print("Input the second number:");
            int num2 = input.nextInt();
            int sum = num1 +num2;
            System.out.println();
            System.out.println("Sum:" +sum);
        }
    }
}