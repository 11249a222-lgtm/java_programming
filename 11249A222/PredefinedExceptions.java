import java.util.Scanner;

public class PredefinedExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ArithmeticException
        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            System.out.println("Result: " + (100 / num));
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }

        sc.nextLine(); // Clear input buffer

        // NumberFormatException
        try {
            System.out.print("Enter your age: ");
            String ageInput = sc.nextLine();

            int age = Integer.parseInt(ageInput);

            System.out.println("Your age is: " + age);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number for age!");
        }

        sc.close();
    }
}