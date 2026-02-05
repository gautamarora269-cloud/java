import java.util.Scanner;

public class Input_from_user {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take integer input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        sc.nextLine(); // IMPORTANT: clear buffer

        // Take string input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Output
        System.out.println("You entered number: " + number);
        System.out.println("Hello " + name);
    }
}
