import java.util.Scanner;

 class scanner{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextLine());
        
        System.out.print("Enter your name:");
        System.out.println("Your name is " + input.nextLine());
        
        Scanner num1 = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        System.out.println("The integer is: " + num1.nextInt());
        
        Scanner num2 = new Scanner(System.in);
        System.out.print("Enter a decimal: ");
        System.out.println("The float decimal is: " + num2.nextFloat());
        
        Scanner num3 = new Scanner(System.in);
        System.out.print("Are you a human being.(True or False): ");
        System.out.println(num3.nextBoolean());
        
        Scanner num4 = new Scanner(System.in);
        System.out.print("Enter a double number: ");
        System.out.println("The double number is: " + num4.nextDouble());
        
        /*
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
    	System.out.print("Enter a number: ");
    	a.nextInt();
    	System.out.println("Enter a number to add to a:");
    	b.nextInt();
    	int c = a+b;  //figure out why this didnt work
    	System.out.println("The sum of number a and b is " + c);
    	*/
    	}
}

/*
    abstractSystem.out.print("Enter your name: ");
    System.out.println("Your name is:" + input.in());
*/