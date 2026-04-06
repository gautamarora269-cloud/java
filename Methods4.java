
public class Program4 {
    public static void main(String[] args) {
        //Create a method to check even/odd
        checkEvenOdd(10);
    }
    public static void checkEvenOdd(int num)
    {
        if (num % 2 == 0 ) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num +" is Odd");
        }
    }
}
