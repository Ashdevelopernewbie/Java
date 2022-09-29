/*
    5. Write a Java program that takes two numbers as input and display the product of two numbers.
*/

import java.util.Scanner;

class multiply{
	public static void main(String args[]) {
		Scanner int1 = new Scanner(System.in);
		Scanner int2 = new Scanner(System.in);
		System.out.print("Enter the first number: " + int1.nextInt());
		System.out.print("Enter the second number: " + int2.nextInt());
		int num = int1 * int2;
		System.out.println("The product of given numbers are: " + int1 * int2);
	}
}