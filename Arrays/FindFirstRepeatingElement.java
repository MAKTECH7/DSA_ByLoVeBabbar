import java.util.HashMap;

public class FindFirstRepeatingElement {
    public static int firstRepeating(int[] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int  num:arr){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }

        for(int i:arr){
            if(freq.get(i)>1){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        // int[] arr = { 6, 10, 5, 4, 9, 120, 4, 6, 10 };
        int[] arr = {1, 2, 3, 4, 4};
        // int[] arr = {1, 2, 3, 1};
        // int[] arr = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        // int[] arr = {1, 2, 3, 4, 5, 6};
        // int[] arr = {7, 7, 7, 7, 7};

        int ans = firstRepeating(arr);
        System.out.println(ans);
    }
}
