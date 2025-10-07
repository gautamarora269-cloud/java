public class CalculateSimpleCompoundInterest {
    public static void main(String[] args) {

        double p = 1000;
        double r = 5;
        double t = 2;

        double si = (p*r*t) / 100;
        double ci = p* (Math.pow(( 1 + r / 100), t )) - p;

        System.out.println("Simple Interst = " + si);
        System.out.println("Compund Interst = " + ci);

    }
}
