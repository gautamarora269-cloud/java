import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.nextLine().charAt(0);
        ch = Character.toLowerCase(ch);

        //if else
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u') {
            System.out.println(ch + " is a vowel");
        } else if ((ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is a constant");
        } else {
            System.out.println("Invalid input");
        }


    }
}
