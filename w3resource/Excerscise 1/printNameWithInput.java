/*
    1.1 Write a Java program to print 'Hello' on screen and then print your name on a separate line using input from the user.A
*/

import java.util.Scanner;

public class printNameWithInput {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Input your first name:");
            String fname = input.next();
            System.out.println("Input your last name:");
            String lname = input.next();
            System.out.println();
            System.out.println("Hello/n" + fname + lname);
        }
    }
}

/*
    I dont understand
    try
    scanner
    system.int
    input.next
*/