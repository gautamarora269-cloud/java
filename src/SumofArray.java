import java.util.Arrays;

public class SumofArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int sum = Arrays.stream(arr).sum();
        System.out.println("Array sum: " + sum);
    }
}
