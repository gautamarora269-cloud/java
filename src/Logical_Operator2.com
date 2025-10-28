public class Logical_Operator2 {
    public static void main(String[] args) {
        //||

        int a = 30;
        int b = 40;
        
        if (a<50 || b < 50)
            System.out.println("both less than 50");

    }
}
