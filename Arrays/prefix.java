public class prefix {
    public static void PrefixSum(int[] arr) {
        int prefix[] = new int [arr.length];
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

                if(maxSum <currSum){
                    maxSum = currSum;
                }

            }

        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        PrefixSum(arr);
    }
}