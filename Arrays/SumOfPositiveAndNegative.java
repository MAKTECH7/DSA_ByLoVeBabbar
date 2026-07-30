public class SumOfPositiveAndNegative {
    public static void main(String[] args) {
        int[] arr = {2,-3,-1,4,6,-9};
        int positive = 0;
        int negative = 0;

        for(int i=0;i<arr.length;i++){
            int element = arr[i];
            if(element >0){
                positive += element;
            }else{
                negative +=element;
            }
        }
        System.out.println("Sum of Positive number is "+positive);
        System.out.println("Sum of Negative number is "+negative);
    }
}
