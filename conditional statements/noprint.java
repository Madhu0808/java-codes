public class noprint {
    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 5){
            System.out.println(counter);
            counter++;
        }
        System.out.println();
        // below code is sum of n numbers
        int sum = 0;
        int n = 5;
        int i = 1;
        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println("sum is " +sum);
    }

} 
