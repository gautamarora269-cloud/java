public class Vowel {
    public static void main(String[] args) {

        char ch = 'b';
        ch = Character.toLowerCase(ch);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel");

        } else {
            System.out.println(ch + " is a consonant");
        }
    }
}
