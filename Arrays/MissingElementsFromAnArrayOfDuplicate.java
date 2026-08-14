import java.util.*;
public class MissingElementsFromAnArrayOfDuplicate {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int n = nums.length;
// marking
        for(int index = 0;index<n; index++){
            
            int value  = Math.abs(nums[index]);
            int position = value-1;

            if(nums[position]>0){
                nums[position] = -nums[position];
            }
        }

         for( int i=0; i<n;i++){
            if(nums[i]>0){
                ans.add(i+1);
            }
        }

        return ans;
    }

    public static void main(String[] args){
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDisappearedNumbers(nums);
        System.out.print(ans);
    }
}