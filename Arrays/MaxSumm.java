public class MaxSumm {
    public static void prefixSum(int arr[]) {
        int prefix[] = new int[arr.length];
        int maxSum = Integer.MIN_VALUE;

        // Compute prefix sum array
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Compute max subarray sum using prefix sum
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                int currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                maxSum = Math.max(maxSum, currSum);
            }
        }

        System.out.println("Maximum Subarray Sum: " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        prefixSum(arr);
    }
}
