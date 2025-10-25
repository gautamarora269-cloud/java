public class Arrays {
    public static void main(String[] args) {
        int[] marks = {45, 78, 89, 55, 91, 35, 60};

        //question
        System.out.println("Print more than 50");
        for (int i = 0; i<marks.length; i++) {
            if (marks[i] > 50){
                System.out.println(marks[i] + "");
            }
        }

    }
}
