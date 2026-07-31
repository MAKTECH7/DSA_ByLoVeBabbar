public class ReverseArray {
    public static int[] ReversedArray(int[] arr, int n) {
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 9 };
        int n = arr.length;
        int[] Rev = ReversedArray(arr, n);
        for (int array : Rev) {
            System.out.print(array + " ");
        }
    }
}
