import java.util.Arrays;

public class threetripletSum {
    public static int[] qfivetripletsum(int nums[], int target) {
        int n = nums.length;
        for(int i = 0; i<n ;i++){
            int newtar = target - nums[i];
            int l = i+1;
            int r = n-1;
            while(l<r){
                int csum = nums[l] + nums[r];
                if(csum == newtar){
                    System.out.println("The triplet is" + nums[i] +","+ nums[l]+","+nums[r]);
                //    return new int []{i,l,r};
                   l++;
                } else if (csum < newtar){
                    l++;
                } else {
                    r--;
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int nums[] = {2,4,7,12,14};
        int target = 23;
        System.out.println(Arrays.toString(qfivetripletsum(nums, target)));
    }
}
