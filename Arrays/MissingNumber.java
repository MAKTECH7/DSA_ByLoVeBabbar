public class MissingNumber {
    public int missingNumber(int[] arr){

        int xorSum = 0;
// xor with all the array elements
        for(int n:arr){
            xorSum = xorSum ^ n;
        }

// xor with all the elements in the range 
      int n = arr.length;
      for(int i=0;i<=n;i++){
            xorSum = xorSum ^ i;
        }
    // ans

    return xorSum;

    }


    public static void main(String[] args){
        // int[] arr = {5,6,0,2,4,1,8};
        int[] arr = {3,0,1};
        MissingNumber mn = new MissingNumber();
        int ans = mn.missingNumber(arr);
        System.out.println(ans);
    }
}
