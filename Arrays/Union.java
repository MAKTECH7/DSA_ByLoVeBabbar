import java.util.TreeSet;

public class Union {
    public static int[] union(int[] arr1, int[] arr2) {

        TreeSet<Integer> ts = new TreeSet<>();

        for (int num : arr1) {
            ts.add(num);
        }
        for (int num : arr2) {
            ts.add(num);
        }

        int[] ans = new int[ts.size()];

        int i = 0;

        for (int num : ts) {
            ans[i++] = num;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 2, 5, 6, 7 };

        int[] Union = union(arr1, arr2);
        for (int ans : Union) {
            System.out.print(ans + " ");
        }
    }
}
