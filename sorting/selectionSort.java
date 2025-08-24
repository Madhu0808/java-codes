import java.util.Arrays;

public class selectionSort {
    public static void SelectionSort(int arr[]) {
        for(int i = 0; i<arr.length;i++){
            int minpos = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] > arr[minpos]){
                    minpos = j;
                }
            }
            // swap
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        // Arrays.sort(arr);
        SelectionSort(arr);
        printArr(arr);
    }
}
