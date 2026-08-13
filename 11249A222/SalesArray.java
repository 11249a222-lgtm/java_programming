import java.util.Scanner;

public class SalesArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] sales = new int[12];

        System.out.println("Enter sales for 12 months:");

        for (int i = 0; i < 12; i++) {
            sales[i] = sc.nextInt();
        }

        int max = sales[0];
        int min = sales[0];

        for (int i = 1; i < 12; i++) {
            if (sales[i] > max) {
                max = sales[i];
            }

            if (sales[i] < min) {
                min = sales[i];
            }
        }

        System.out.println("Highest sales = " + max);
        System.out.println("Lowest sales = " + min);

        sc.close();
    }
}