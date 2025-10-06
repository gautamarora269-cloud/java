import java.util.Scanner;

public class ReverseaNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        //reverse a number
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;       // Get last digit
            reversed = reversed * 10 + digit; // Append digit
            num = num / 10;             // Remove last digit
        }

        System.out.println("Reverse number " + reversed);

    }

}
