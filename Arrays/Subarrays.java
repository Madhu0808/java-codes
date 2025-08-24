public class Subarrays {
    public static void madhu(int array[]) {
        int totalnoofarrays = 0;
        int maxsum  = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
             //start row
            for (int j = i; j < array.length; j++) {
                // sum += array[j];
                // maxsum = Math.max(sum, maxsum);
                // System.out.println("sum"+sum);

                int sum =0;
                 for (int k = i; k <= j; k++) {
                    System.out.print(array[k]+ " ");
                    sum += array[k];
                    
                    // totalnoofarrays++;
                }
                if (maxsum < sum){
                    maxsum = sum;
                }
                System.out.println("");
                totalnoofarrays++;
               
            
        }
        
    }
    System.out.println("Total number of sub arrays"+totalnoofarrays); 
        System.out.println("MAX SUM OF A SUBARRAY IS "+ maxsum);
}
    public static void main(String[] args) {
        int array[] = {2,4,6,8,10};
        madhu(array);
    }
}