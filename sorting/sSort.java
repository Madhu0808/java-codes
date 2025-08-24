public class sSort {
    public static void sSort(int arr[]) {
        int n = arr.length;
        for(int i =0;i<n-1;i++){
            int minposindex = i;
            for(int j=i+1;j<n;j++){
                if(arr[minposindex]>arr[j]){
                    minposindex = j;
                }
            }
            //swap
            int temp = arr[minposindex];
            arr[minposindex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void print(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,1,4,3,2};
        sSort(arr);
        print(arr);
    }
}
// public static void main(int arr[]){
//     int n =arr.length;
//     for(int i =0;i<n-1;i++){

//     }
// }
