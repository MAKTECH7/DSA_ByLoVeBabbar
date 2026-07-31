import java.util.HashMap;

public class FindMode {
    public static int getMode(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // for(int i:freq.keySet()){
        // System.out.println(i+" -> "+freq.get(i));
        // }

        int maxFreq = -1;
        int MaxFreqWaliKey = -1;

        for (int key : freq.keySet()) {
            int currentKey = key;
            int currentKeykiFrequency = freq.get(key);
            if (currentKeykiFrequency > maxFreq) {
                maxFreq = currentKeykiFrequency;
                MaxFreqWaliKey = currentKey;
            }
        }

        return MaxFreqWaliKey;
        // return maxFreq;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5 };
        int Mode = getMode(arr);
        System.out.println(Mode);
    }
}
