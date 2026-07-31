import java.util.HashMap;

public class HighestFreqNumOrLowestFreqNum {
    public static int[] getHighestOrLowestFreqElement(int[] arr){
        HashMap<Integer,Integer> Freq = new HashMap<>();
        for(int num:arr){
            Freq.put(num, Freq.getOrDefault(num, 0)+1);
        }
        // Hashmap is Ready

        int highestFreq = Integer.MIN_VALUE;
        int HighestFreqKey = -1;
        for(int key:Freq.keySet()){
            int currentKey = key;
            int MaxFreq = Freq.get(key);
            if(MaxFreq>highestFreq){
                highestFreq = MaxFreq;
                HighestFreqKey = currentKey;
            }
        }

        int lowestFreq = Integer.MAX_VALUE;
        int lowestFreqKey = -1;
        for(int key:Freq.keySet()){
            int currentKey = key;
            int LowFreq = Freq.get(key);
            if(LowFreq<lowestFreq){
                lowestFreq = LowFreq;
                lowestFreqKey = currentKey;
            }
        }

        int[] ans = {HighestFreqKey,lowestFreqKey};
        return ans;

    }
    public static void main(String[] args) {
        // int[] arr = {1,2,2,3,3,3,4,4,5,5,5,5,5};
        int[] arr = {10,10,10,20,20,30};
        int[] ans = getHighestOrLowestFreqElement(arr);
        System.out.println("Highest Frequence wala num "+ ans[0]);
        System.out.println("Lowest Frequence wala num "+ ans[1]);
    }
}
