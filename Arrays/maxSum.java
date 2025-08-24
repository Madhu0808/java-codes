public class maxSum {
    public static void prefixSum(int prefixSum[]) {
        int prefix [] = new int [prefixSum.length];
        int maxSum =Integer.MIN_VALUE;
        prefix[0] = prefixSum[0];
        // prefix array
        for(int i=1; i<prefixSum.length;i++){
            prefix[i] = prefix[i-1] + prefixSum[i];
        }

        for (int i=0;i<prefixSum.length;i++){ //start
            for(int k=i;k<prefixSum.length;k++){ //end
                int currSum = i == 0 ? prefix[k]:prefix[k] - prefix[i-1];
                if (currSum > maxSum){
                    maxSum = currSum;
                }
               
            }
           
        }
        System.out.println(maxSum);
    }    public static void main(String[] args) {
        int prefixSum[]  = {1,-2,6,-1,3};
        prefixSum(prefixSum);
    }
}
