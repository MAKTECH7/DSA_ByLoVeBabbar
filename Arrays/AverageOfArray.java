public class AverageOfArray {

    public static double getAverage(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double Average = sum / arr.length;

        return Average;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 3 };
        double avg = getAverage(arr);
        System.out.println(avg);
    }
}