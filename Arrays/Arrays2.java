public class Arrays2 {
    public static int findLargest(int numbers[]) {
        int Largest = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] > Largest){
                Largest = numbers[i];
            }
        }
          return Largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1, 3, 6, 5, 7, 9, 2};
        System.out.println("The largest number in array is " +findLargest(numbers));
    }
}
