import java.util.Arrays;

public class MaximumArray {
    public static void main(String[] args) {
        int[] arr = {10,50,20,90,40};
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("Maximum " + max);
    }
}
