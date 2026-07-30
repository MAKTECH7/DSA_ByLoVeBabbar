public class SortedOrUnsorted {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,9};
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println(arr[i+1]);
            }
        }
    }
}
