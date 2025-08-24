import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class twoSum {
    public static int[] twoSum(int nums[] , int target) {
        int n = nums.length;
        int l = 0;
        int r = n-1;
        while(l<r){
            int csum = nums[l] + nums[r];
            if(csum == target){
                return new int[]{l, r};
            } else if (csum < target){
                l++;
            } else {
                r--;
            }
        }
        return new int []{};
    }
    public static void main(String[] args) {
        int nums[] = {3,4,8,11,12,14};
        int target = 15;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
