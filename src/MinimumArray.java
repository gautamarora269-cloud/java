import java.util.Arrays;

public class MinimumArray {
    public static void main(String[] args) {
        int [] arr = {10,20,50,30,60,6};
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println(min);
    }
}
