import java.util.Scanner;

public class string {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your name: \n");
            String name = sc.nextLine();
            System.out.println("Your name is " + name);
        }
    }
}
