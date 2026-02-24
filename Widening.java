public class Widening {
    public static void main(String[] args) {
        byte b = 10;
        short s = (short) b;
        System.out.println(s);

        short r = 200;
        int i = (int) r;
        System.out.println(i);

        int num = 3000;
        long l = (long) num;
        System.out.println(l);

        long la = 100000l;
        float f = (float) la;
        System.out.println(f);

        float fe = 34.5f;
        double db = (double) fe;
        System.out.println(db);

        double d = 55.65;
        char ch = (char) d;
        System.out.println(ch);

     }
}
