import java.util.Arrays;

public class MaxInArray {
    public static void main(String[] args) {
        int[] numbers = {2, 8, 1, 9, 4};

        int max = Arrays.stream(numbers).max().getAsInt(); // find max easily

        System.out.println("Maximum number is: " + max);
    }
}
