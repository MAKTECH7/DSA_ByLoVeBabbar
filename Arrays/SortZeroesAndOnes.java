public class SortZeroesAndOnes {

    public static int[] sortArray(int[] arr) {

        int i = 0;
        int j = arr.length - 1;

        while (i <  j) {
            if (arr[i] == 1 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                // i++;
                // j--;
            }else if(arr[i] == 0) {
                i++;
            }else if (arr[j] == 1) {
                j--;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 0, 0, 1, 0, 1, 1 };
        int[] arr = {1};
        int[] ans = sortArray(arr);
        for (int num : ans) {
            System.out.print(num + " ");
        }

    }
}
