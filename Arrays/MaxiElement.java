public class MaxiElement {

    public static int MaximumElement(int[] arr,int n ){
        int maxi = arr[0];
        for(int i=0;i<n;i++){
            if(maxi<arr[i]){
                maxi = arr[i];
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[] arr  = {9,5,2,7,12};
        int n = arr.length;
        int Maximum = MaximumElement(arr,n);
        System.out.println(Maximum);

    }
}
