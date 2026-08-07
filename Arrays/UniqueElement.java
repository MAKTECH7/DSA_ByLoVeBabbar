public class UniqueElement{
    public static int UniqueElement(int[] arr){
        int xorSum = 0;
        for(int num:arr){
            xorSum = xorSum ^ num;
        }

        return xorSum;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,4,5,3,4};
        int Number = UniqueElement(arr);
        System.out.println(Number);
    }
}