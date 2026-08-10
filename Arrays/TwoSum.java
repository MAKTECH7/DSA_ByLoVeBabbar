public class TwoSum {
    public static int[] TwoSum(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == target) {
                return new int[] { arr[i], arr[j] };
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }

        }

        return new int[] {};
    }

    public static void main(String[] args) {
        // int[] arr = { -1, -2, -3, -4, -5 };
        int[] arr = { 1, 2, 3, 4, 6, 8, 10 };
        int target = 10;

        int[] ans = TwoSum(arr, target);
        for (int num : ans) {
            System.out.println(num + " ");
        }
    }
}