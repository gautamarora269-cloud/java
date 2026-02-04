public class Casting {
    public static void main (String[] args) {

        //implicit
        double price = 100.0;
        double finalPrice = 18.0;
        System.out.println(finalPrice);

        //explicit
        int p = 100;
        int fP = p + (int) 18.0;
        System.out.println(fP);

    }
}
