public class insertionsort{
    public static void InsertionSort(int arr[]) {
        for(int i = 1;i<arr.length;i++){
            int prev = i-1;
            int curr = arr[i];
            while(prev >= 0 && arr[prev]> curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
}
    public static void main(String[] args) {
        int arr[] = {2,5,3,6,1,4};
        InsertionSort(arr);
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}