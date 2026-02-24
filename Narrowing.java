public class Narrowing {
    public static void main(String[] args) {

        char a = 'c';
        double b = (double) a;
        System.out.println(b);

        double ca = 10.5;
        float da = (float) ca;
        System.out.println(da);

        float ty = 34.5f;
        long lawe = (long) ty;
        System.out.println(lawe);

        long qw = 10000000l;
        int re = (int) qw;
        System.out.println(re);

        int rew = 3000;
        short sh = (short) rew;
        System.out.println(sh);

        short sq = 100;
        byte yt = (byte)sq;
        System.out.println(yt);
    }
}
