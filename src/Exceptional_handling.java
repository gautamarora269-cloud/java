public class Exceptional_handling {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int result = a/b;
            System.out.println(result);
        }

        catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero!");
        }

        finally {
            System.out.println("this block always executes. ");
        }

    }
}
