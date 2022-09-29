/*
    String reversed using recursion
*/

package JavaPracticeQuestions;
import java.util.Scanner;

public class reverseString {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any word:");
        String word = sc.nextLine();

        System.out.println("The reversed word is: " + word);
    }
}
