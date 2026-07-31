public class ShiftByOnePosition {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
        int n = arr.length;
        int temp = arr[n - 1];

        for (int i = n-1; i >0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        for (int MAK : arr) {
            System.out.print(MAK + " ");
        }
    }
}
