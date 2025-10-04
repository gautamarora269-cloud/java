public class Reversed {
    public static void main(String[] args) {
        int num = 12345;

        String rev = new StringBuilder(String.valueOf(num)).reverse().toString();
        int reversedNum = Integer.parseInt(rev);

        System.out.println(reversedNum);
    }
}
