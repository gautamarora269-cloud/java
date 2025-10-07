public class ImplicitandExplicit {
    public static void main(String[] args) {

        int num = 30; //implicit
        double a = num;
        System.out.println("double a " + a);

        double b = 202.33; //explicit
        int c = (int) b;
        System.out.println(c);
    }
}
