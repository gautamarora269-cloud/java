import java.util.Scanner;

public class ConvertTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                System.out.print("Enter total seconds: ");
                int totalSeconds = sc.nextInt();

                int hours = totalSeconds / 3600;           // 1 hour = 3600 seconds
                int remainingSeconds = totalSeconds % 3600;

                int minutes = remainingSeconds / 60;       // 1 minute = 60 seconds
                int seconds = remainingSeconds % 60;

                System.out.println(totalSeconds + " seconds = " + hours + " hours, "
                                   + minutes + " minutes, " + seconds + " seconds");
    }
}
