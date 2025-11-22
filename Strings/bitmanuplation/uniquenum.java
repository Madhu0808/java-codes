package Strings.bitmanuplation;

public class uniquenum {
    public static int UniqueNumber(int []nums) {
        int UniqueNumber = 0;
        for(int idx=0; idx<nums.length; idx++){
            UniqueNumber = UniqueNumber^nums[idx];
        }
        return UniqueNumber;
    }
    public static void main(String[] args) {
        int nums[] = {2,4,6,8,2,4,6,8,7};
        System.out.println(UniqueNumber(nums));
    }
}
