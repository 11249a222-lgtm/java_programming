import java.util.Scanner;

public class TrainCodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] trainCodes = {"TR101", "TR102", "TR103", "TR104", "TR105"};

        System.out.print("Enter train code index (0-4): ");
        int index = sc.nextInt();

        try {
            System.out.println("Train Code: " + trainCodes[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index!");
        }

        sc.close();
    }
}